Bienvenido, estás en la parte de Base de Datos del Equipo 3

En este apartado se describe el diseño de la base de datos, así como sus principales funcionalidades.

La base de datos se descompone en 5 apartados:


-[Diagrama Entidad-Relación (E-R)](#Diagrama-Entidad-Relación) 

-[Diagrama Relacional](#Diagrama-relacional) 

-[Creacción de las tablas, datos almacenados,composición de las tablas](#creacción-de-las-tablas-datos-almacenados-composición-de-las-tablas)

-[Funcionalidades extra](#funcionalidades-extra)

-[Script de creacción](#script-de-creacción)

## Diagrama Entidad-Relación

El diagrama entidad-relación ha sido el punto de partida que me ha servido para diseñar la base de datos desde los cimientos.


Consta de 6 tablas relacionadas entre sí y desentrañan el entramado de la base de datos en su totalidad, la tabla padre es CUENTA.

En la entidad PRESTAMO, fechaFirma admite nulos ya que solo contendrá un valor si el préstamo ha sido aceptado. He optado por simplificarlo y utilizar solo una entidad.

En la entidad PERFIL, uuidPareja es el uuid del conyuge, admite nulos y no es unique key ya que este campo solo se rellena si el cónyuge es cliente del banco, no puede ser UK debido a que hay personas con varios cónyuges (por ejemplo árabes).

En la entidad CUENTA, nominaUltimo y nominaMEdiaAnual admiten nulos ya que si el cliente no ha trabajado en el último mes y/o último año, respectivamente, este campo estará en nulo.

En la entidad MOVIMIENTO, ibanDestinatario y ibanEmisor admiten nulos debido a que si se ingresa dinero en la cuenta en metálico no va a haber uuidEmisor y, del mismo modo, si se extrae dinero de un cajero no hay ibanDestinatario.

Ha continuación se muestra el diagrama E-R, con todas sus relaciones y cardinalidades:

[Diagrama E-R](https://github.com/Kangelx/Equipo3/blob/basedatos/Diagrama%20E-R.drawio.png)

## Diagrama relacional 

A partir del diagrama E-R, he procedido a realizar el diagrama relacional que será lo que va a ser transladado a la base de datos.

PAGOS contiene la FK propagada de PRESTAMOS ya que un prestamo puede contener varios pagos.

PRESTAMOS contiene la FK propagada de CLIENTES a razón de que un cliente puede tener varios prestamos.

PERFILES contiene la FK de CLUIENTES ya que un cliente puede tener un perfil o no.

CLIENTES contiene la FK "iban" propagada de CUENTAS ya que una cuenta puede tener varios titulares, dicha FK debe admitir nulos ya que puede haber antiguos clientes almacenados en la base de datos que ya no dispongan de cuenta.

MOVIMIENTOS contiene la FK de CUENTAS debido a que una cuenta puede realizar varios movimientos y un movimiento solo puede ser realizado desde una cuenta.

En esta foto puede verse el diagrama completo:

[Diagrama relacional](https://github.com/Kangelx/Equipo3/blob/basedatos/Foto%20diagrama%20Relacional.PNG)

## Creacción de las tablas, datos almacenados, composición de las tablas

Una vez diseñada la base de datos, he procedido a la creacción de las tablas con las así como sus restricciones basándome en el diagrama relacional.

La columna "iban" es un char fijo de 24 carácteres para nuestro banco y es único para cada cuenta.

"uuid" es un identificador universal, compuesto de 36 carácteres unívocamente.

"fechaFirma" es la fecha en que el cliente acepta un potencial préstamo.

"cantMens" recoge el valor númerico que, al haber aceptado un préstamo, el cliente se compromete a pagar mensualmente.

"periodo" recoge el número de meses en que el cliente se compromete a pagar integramente el préstamo.

La columna "plazo" contiene el número de días que se le otorgan al cliente para que acepte el ofrecimiento del préstamo.

El resto de columnas son autoexplicatorias.

[Esquema de la base de datos](https://github.com/Kangelx/Equipo3/blob/basedatos/BASE%20DE%20DATOS%20ESQUEMA.PNG)

## Funcionalidades extra

Me pareció interesante añadir algo que no hayamos visto en clase, así que he añadido 2 EVENTS que se activaran periódicamente hasta una determinada fecha.

Uno de ellos ofrece pagos en Verano a todos los clientes que sean mayores de 53 años:


```sql


CREATE EVENT evento_prestamos_verano_mayores_53_53
on schedule every 1 year starts "2023-06-21 00:00:01" ends "2027-01-01 00:00:01"
do 
insert into prestamos (periodo,fechaOfer,plazo,interes,cantidad,uuid)
select 2, '2023-06-21 ',12,7.5,10000,uuid from clientes where fechaNac < '1970-01-01 ';


```

El otro EVENT lo que hace es actualizar la nómina media de todos los clientes todos los meses, el día último de cada mes a las 12:00:00:

```sql
CREATE EVENT actualizarMediaIngresos
  ON SCHEDULE
    EVERY 1 MONTH
    STARTS "2023-01-31 12:00:00"
  DO
    update cuentas set nominaMedAnual= (nominaMedAnual + nominaUltimo) / TIMESTAMPDIFF(MONTH, '2023-01-01', NOW()) ;  

```

Asímismo, he creado una vista para flitrar la base de datos por los préstamos ofrecidos en Mayo de este año, mostrando, además de los datos del préstamo, el nombre, apellidos, uuid y telefono de los clientes a los que les ha hecho la oferta:

```sql
create view preconcedidosMayo
(idPres,periodo,fechaOfer,plazo,interes,cantidad,fechaFirma,
cantMens,uuid,nombre,apellidos,telefono)
as select idPres,periodo,fechaOfer,plazo,interes,cantidad,
fechaFirma,cantMens,prestamos.uuid,nombre,apellidos,telefono
from clientes inner join prestamos on prestamos.uuid=
clientes.uuid where fechaOfer like "2023-05-%";


```

[Volver arriba](#)

## Script de creacción

```sql
CREATE DATABASE  IF NOT EXISTS `prestamos` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `prestamos`;
-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: prestamos
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `uuid` char(36) NOT NULL,
  `dni` char(9) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `telefono` char(9) NOT NULL,
  `direccion` varchar(70) NOT NULL,
  `localidad` varchar(25) NOT NULL,
  `fechaNac` date NOT NULL,
  `iban` char(24) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `dni` (`dni`),
  KEY `fk_iban_idx` (`iban`),
  CONSTRAINT `fk_iban` FOREIGN KEY (`iban`) REFERENCES `cuentas` (`iban`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES ('0245c353-fa61-11ed-be56-0242ac120002','74125896K','Natalia','Fernández García','123456789','Calle Mayor 123','Santander','1996-05-05','ES0284759834759283759806'),('03f832c9-fa5d-11ed-be56-0242ac120002','24681357N','Carmen','Rodríguez Sánchez','987654321','Avenida Libertad 789','Torrelavega','1993-07-25','ES0284759834759283759871'),('0893ea34-fa5c-11ed-be56-0242ac120002','74125896I','Carlos','López Rodríguez','654987321','Calle Real 456','Santander','1989-07-12','ES0284759834759283759877'),('1994c60d-fa62-11ed-be56-0242ac120002','24681357V','Luisa','Sánchez López','654987321','Calle Real 789','Santander','1995-05-30','ES0284759834759283759891'),('1a7d8645-fa5b-11ed-be56-0242ac120002','24681357D','Ana','Rodríguez Sánchez','123456789','Calle Mayor 456','Torrelavega','1988-12-05','ES1284759834759283759805'),('277b9255-fa5f-11ed-be56-0242ac120002','36985214Z','Diego','Martínez Gómez','987654321','Avenida Libertad 123','Torrelavega','1990-02-10','ES1284759834759283759815'),('2807a8ab-fa5e-11ed-be56-0242ac120002','98765432T','Natalia','Gómez López','987654321','Avenida Libertad 456','Torrelavega','1991-10-10','ES1284759834759283759864'),('28a76bf0-fa60-11ed-be56-0242ac120002','13579246F','David','Rodríguez Sánchez','987654321','Avenida Libertad 789','Torrelavega','1991-07-30','ES1284759834759283759872'),('32e33fca-fa61-11ed-be56-0242ac120002','98765432L','Marta','Gómez López','987654321','Avenida Libertad 456','Torrelavega','1992-10-30','ES1284759834759283759882'),('373c0f41-fa5d-11ed-be56-0242ac120002','98765432O','Daniel','González López','654987321','Calle Real 123','Santander','1989-12-10','ES1284759834759283759882'),('39563a8e-fa61-11ed-be56-0242ac120002','54321678Q','Sara','Gómez Fernández','123456789','Calle Mayor 789','Torrelavega','1993-08-05','ES9284759834759283759890'),('3bc097d4-fa5c-11ed-be56-0242ac120002','98765432J','Elena','Fernández García','123456789','Calle Mayor 123','Torrelavega','1996-04-28','ES9284759834759283759880'),('41fc8e84-fa62-11ed-be56-0242ac120002','98765432W','Alejandro','Martínez Pérez','123456789','Calle Mayor 456','Torrelavega','1991-12-25','ES9284759834759283759870'),('46a7c33c-fa5a-11ed-be56-0242ac120002','12345678A','Juan','Gómez López','123456789','Calle Mayor 123','Santander','1990-01-01','ES9284759834759283759837'),('4e9c5b2d-fa5b-11ed-be56-0242ac120002','98765432E','Javier','Pérez Rodríguez','987654321','Avenida Libertad 789','Santander','1995-03-20','ES9284759834759283759807'),('51a4f9cc-fa5f-11ed-be56-0242ac120002','25874136A','Laura','López Rodríguez','654987321','Calle Real 456','Santander','1986-08-25','ES9248579324579832475959'),('525df867-fa60-11ed-be56-0242ac120002','24681357G','Carmen','González López','654987321','Calle Real 123','Santander','1987-12-25','ES9245783924759832475961'),('52974422-fa5e-11ed-be56-0242ac120002','12345678U','Marta','Hernández Martínez','654987321','Calle Real 789','Santander','1987-04-05','ES9237459875982734982356'),('63a12541-fa61-11ed-be56-0242ac120002','12345678M','Jorge','Hernández Martínez','654987321','Calle Real 789','Santander','1988-04-25','ES8732847593847593847555'),('640fc3b8-fa5d-11ed-be56-0242ac120002','54321678P','Paula','Sánchez Fernández','123456789','Calle Mayor 789','Torrelavega','1996-08-15','ES8284759834759283759899'),('6bc7ebe7-fa62-11ed-be56-0242ac120002','54321678X','Carolina','Fernández González','987654321','Avenida Libertad 789','Santander','1987-07-20','ES8284759834759283759889'),('6c0d742f-fa61-11ed-be56-0242ac120002','36985214R','Javier','Hernández López','987654321','Avenida Libertad 123','Santander','1989-03-20','ES8284759834759283759879'),('6d46013b-fa5c-11ed-be56-0242ac120002','12345678K','Mario','González López','987654321','Avenida Libertad 456','Santander','1993-10-20','ES8284759834759283759869'),('7732d47f-fa5a-11ed-be56-0242ac120002','87654321B','María','Fernández García','987654321','Avenida Libertad 456','Torrelavega','1985-02-15','ES8284759834759283759808'),('7af564de-fa60-11ed-be56-0242ac120002','54321678H','Daniel','Sánchez Fernández','123456789','Calle Mayor 789','Torrelavega','1995-08-20','ES6284759834759283759897'),('7b11a099-fa5e-11ed-be56-0242ac120002','87654321V','Jorge','Pérez Rodríguez','123456789','Calle Mayor 456','Torrelavega','1994-11-30','ES6284759834759283759897'),('7b79fe43-fa5f-11ed-be56-0242ac120002','74125896B','Carlos','Fernández García','123456789','Calle Mayor 123','Torrelavega','1994-04-20',NULL),('7e0a88fe-fa5b-11ed-be56-0242ac120002','54321678F','Laura','González López','654987321','Calle Real 123','Torrelavega','1991-09-15',NULL),('91555c2f-fa5d-11ed-be56-0242ac120002','36985214Q','Sergio','Martínez Gómez','987654321','Avenida Libertad 123','Santander','1992-02-01',NULL),('92ed3fa4-fa61-11ed-be56-0242ac120002','12345678S','Eva','Pérez Rodríguez','654987321','Calle Real 456','Torrelavega','1996-09-15',NULL),('945dad28-fa61-11ed-be56-0242ac120002','87654321N','Sofía','Pérez Rodríguez','123456789','Calle Mayor 456','Torrelavega','1995-12-20',NULL),('992b8f20-fa5a-11ed-be56-0242ac120002','13579246C','Pedro','Hernández Martínez','654987321','Calle Real 789','Santander','1992-06-10',NULL),('9d515a55-fa60-11ed-be56-0242ac120002','36985214I','Marina','Martínez Gómez','987654321','Avenida Libertad 123','Santander','1992-03-15',NULL),('9d9882ba-fa5f-11ed-be56-0242ac120002','98765432C','Elena','Gómez López','987654321','Avenida Libertad 456','Santander','1990-11-15',NULL),('9eadecc2-fa5c-11ed-be56-0242ac120002','87654321L','Laura','Hernández Martínez','654987321','Calle Real 789','Torrelavega','1990-06-05',NULL),('9f9b52f0-fa5e-11ed-be56-0242ac120002','13579246W','Sofía','Rodríguez Sánchez','987654321','Avenida Libertad 789','Santander','1990-06-25',NULL),('a4d9a7e5-fa5b-11ed-be56-0242ac120002','36985214G','Miguel','Sánchez Fernández','123456789','Calle Mayor 789','Santander','1987-05-02',NULL),('bf3da61b-fa61-11ed-be56-0242ac120002','87654321T','Lucía','Rodríguez Sánchez','123456789','Calle Mayor 123','Santander','1992-04-10',NULL),('c6a378ac-fa5d-11ed-be56-0242ac120002','25874136R','Marina','López Rodríguez','654987321','Calle Real 456','Torrelavega','1988-08-18',NULL),('c7d50d9f-fa61-11ed-be56-0242ac120002','13579246O','Andrés','Rodríguez Sánchez','987654321','Avenida Libertad 789','Santander','1991-07-15',NULL),('cbbf5901-fa5f-11ed-be56-0242ac120002','12345678D','Mario','Hernández Martínez','654987321','Calle Real 789','Torrelavega','1987-06-10',NULL),('d0ef5a49-fa5c-11ed-be56-0242ac120002','13579246M','David','Pérez Rodríguez','123456789','Calle Mayor 456','Santander','1986-01-30',NULL),('d1de1fcc-fa60-11ed-be56-0242ac120002','25874136J','Pablo','López Rodríguez','654987321','Calle Real 456','Torrelavega','1988-09-10',NULL),('d29e0f67-fa5e-11ed-be56-0242ac120002','24681357X','Andrés','González López','654987321','Calle Real 123','Torrelavega','1986-01-20',NULL),('d5f6c884-fa5b-11ed-be56-0242ac120002','25874136H','Sara','Martínez Gómez','987654321','Avenida Libertad 123','Torrelavega','1994-11-25','ES1284759834759283759892'),('ea8e7e92-fa61-11ed-be56-0242ac120002','13579246U','Marcos','González Martínez','987654321','Avenida Libertad 456','Torrelavega','1988-10-05','ES2284759834759283759804'),('f4759b34-fa5d-11ed-be56-0242ac120002','74125896S','Pablo','Fernández García','123456789','Calle Mayor 123','Santander','1995-03-15','ES2284759834759283759814'),('f669e617-fa61-11ed-be56-0242ac120002','24681357P','Valeria','González López','654987321','Calle Real 123','Torrelavega','1987-12-10','ES2284759834759283759873'),('f68d4dde-fa5e-11ed-be56-0242ac120002','54321678Y','Valeria','Sánchez Fernández','123456789','Calle Mayor 789','Santander','1993-08-15','ES2284759834759283759883'),('fe3c5f78-fa5f-11ed-be56-0242ac120002','87654321E','Laura','Pérez Rodríguez','123456789','Calle Mayor 456','Santander','1994-12-05','ES2284759834759283759893');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuentas`
--

DROP TABLE IF EXISTS `cuentas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cuentas` (
  `iban` char(24) NOT NULL,
  `tipoCuenta` varchar(25) NOT NULL,
  `saldo` float NOT NULL,
  `nominaUltimo` float DEFAULT NULL,
  `nominaMedAnual` float DEFAULT NULL,
  `diaPago` tinyint DEFAULT NULL,
  PRIMARY KEY (`iban`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuentas`
--

LOCK TABLES `cuentas` WRITE;
/*!40000 ALTER TABLE `cuentas` DISABLE KEYS */;
INSERT INTO `cuentas` VALUES ('ES0284759834759283759806','Cuenta de ahorros',6000,NULL,NULL,1),('ES0284759834759283759871','Cuenta de ahorros',6000,4500,5000,1),('ES0284759834759283759877','Cuenta de ahorros',6000,3000,2800,1),('ES0284759834759283759881','Cuenta de ahorros',6000,NULL,NULL,2),('ES0284759834759283759891','Cuenta de ahorros',6000,NULL,NULL,2),('ES1284759834759283759805','Cuenta corriente',2500,NULL,NULL,28),('ES1284759834759283759815','Cuenta corriente',2500,NULL,NULL,28),('ES1284759834759283759864','Cuenta corriente',5000,3000,2800,28),('ES1284759834759283759872','Cuenta corriente',2500,NULL,NULL,27),('ES1284759834759283759882','Cuenta corriente',2500,NULL,NULL,3),('ES1284759834759283759892','Cuenta corriente',2500,3000,2800,3),('ES2284759834759283759804','Cuenta de ahorros',7000,4500,5000,3),('ES2284759834759283759814','Cuenta de ahorros',7000,NULL,NULL,4),('ES2284759834759283759873','Cuenta de ahorros',7000,NULL,NULL,5),('ES2284759834759283759883','Cuenta de ahorros',7000,3000,2800,27),('ES2284759834759283759893','Cuenta de ahorros',7000,NULL,NULL,26),('ES3249857394875928475958','Cuenta corriente',2000,1500,1800,28),('ES3284759834759283759803','Cuenta corriente',5000,NULL,NULL,5),('ES3284759834759283759813','Cuenta corriente',5000,4500,5000,5),('ES3284759834759283759863','Cuenta de ahorros',7000,NULL,NULL,1),('ES3284759834759283759874','Cuenta corriente',5000,3000,2800,1),('ES3284759834759283759884','Cuenta corriente',5000,NULL,NULL,1),('ES3284759834759283759894','Cuenta corriente',5000,NULL,NULL,2),('ES4284759834759283759802','Cuenta de ahorros',9000,NULL,NULL,2),('ES4284759834759283759812','Cuenta de ahorros',9000,NULL,NULL,2),('ES4284759834759283759865','Cuenta de ahorros',9000,0,NULL,3),('ES4284759834759283759875','Cuenta de ahorros',9000,NULL,NULL,27),('ES4284759834759283759885','Cuenta de ahorros',9000,NULL,NULL,27),('ES4284759834759283759895','Cuenta de ahorros',9000,4500,5000,27),('ES5284759834759283759801','Cuenta corriente',3500,1500,1800,27),('ES5284759834759283759811','Cuenta corriente',3500,NULL,NULL,27),('ES5284759834759283759866','Cuenta corriente',3500,2000,2200,27),('ES5284759834759283759876','Cuenta corriente',3500,NULL,NULL,27),('ES5284759834759283759886','Cuenta corriente',3500,4500,5000,27),('ES5284759834759283759896','Cuenta corriente',3500,NULL,NULL,28),('ES5732948572398457923860','Cuenta corriente',4000,NULL,NULL,28),('ES6284759834759283759810','Cuenta de ahorros',6000,1500,1800,28),('ES6284759834759283759867','Cuenta de ahorros',6000,NULL,NULL,28),('ES6284759834759283759877','Cuenta de ahorros',6000,4500,5000,28),('ES6284759834759283759887','Cuenta de ahorros',6000,NULL,NULL,28),('ES6284759834759283759897','Cuenta de ahorros',6000,NULL,NULL,28),('ES6573928475982759837457','Cuenta de ahorros',10000,NULL,NULL,28),('ES7231901159437438237454','Cuenta corriente',1500,1000,1200,28),('ES7239487598347598347562','Cuenta corriente',2500,NULL,NULL,1),('ES7284759834759283759809','Cuenta corriente',2000,NULL,NULL,1),('ES7284759834759283759868','Cuenta corriente',2000,1500,1800,1),('ES7284759834759283759878','Cuenta corriente',2000,NULL,NULL,1),('ES7284759834759283759888','Cuenta corriente',2000,NULL,NULL,1),('ES7284759834759283759898','Cuenta corriente',2000,1500,1800,1),('ES8284759834759283759808','Cuenta de ahorros',8000,NULL,NULL,1),('ES8284759834759283759869','Cuenta de ahorros',8000,NULL,NULL,27),('ES8284759834759283759879','Cuenta de ahorros',8000,NULL,NULL,24),('ES8284759834759283759889','Cuenta de ahorros',8000,1500,1800,24),('ES8284759834759283759899','Cuenta de ahorros',8000,NULL,NULL,24),('ES8732847593847593847555','Cuenta de ahorros',5000,2500,2000,24),('ES9237459875982734982356','Cuenta corriente',3000,NULL,NULL,24),('ES9245783924759832475961','Cuenta de ahorros',6000,4500,5000,25),('ES9248579324579832475959','Cuenta de ahorros',8000,NULL,NULL,25),('ES9284759834759283759807','Cuenta corriente',4000,3000,2800,25),('ES9284759834759283759837','Cuenta corriente',4000,NULL,NULL,25),('ES9284759834759283759870','Cuenta corriente',4000,NULL,NULL,25),('ES9284759834759283759880','Cuenta corriente',4000,1500,1800,25),('ES9284759834759283759890','Cuenta corriente',4000,NULL,NULL,25);
/*!40000 ALTER TABLE `cuentas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movimientos`
--

DROP TABLE IF EXISTS `movimientos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movimientos` (
  `idOperacion` int NOT NULL AUTO_INCREMENT,
  `cantidad` float NOT NULL,
  `concepto` varchar(45) NOT NULL,
  `ibanDestinatario` char(24) DEFAULT NULL,
  `ibanEmisor` char(24) DEFAULT NULL,
  `iban` char(24) NOT NULL,
  `fecha` datetime NOT NULL,
  PRIMARY KEY (`idOperacion`),
  KEY `fk_ib_idx` (`iban`),
  CONSTRAINT `fk_ib` FOREIGN KEY (`iban`) REFERENCES `cuentas` (`iban`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimientos`
--

LOCK TABLES `movimientos` WRITE;
/*!40000 ALTER TABLE `movimientos` DISABLE KEYS */;
INSERT INTO `movimientos` VALUES (50,1600,'Nomina','ES7284759834759283759809','ES1720953451857146177519','ES7284759834759283759809','2023-05-25 12:34:56'),(51,-50,'Retirada en cajero',NULL,'ES7284759834759283759868','ES7284759834759283759868','2023-05-25 14:03:56'),(52,-50,'Pago de recibo','ES6401828531822652196326','ES7284759834759283759888','ES7284759834759283759888','2023-05-25 15:34:58'),(53,-60,'Pago con tarjeta','ES8104874923135896437427','ES8284759834759283759869','ES8284759834759283759869','2023-05-25 17:24:16'),(54,-70,'Retirada en cajero',NULL,'ES9237459875982734982356','ES9237459875982734982356','2023-05-25 17:24:16'),(55,-120,'Pago de recibo','ES8901287993607768239226','ES9284759834759283759837','ES9284759834759283759837','2022-11-21 19:01:37'),(56,-200,'Retirada en cajero',NULL,'ES9284759834759283759880','ES9284759834759283759880','2023-05-25 17:24:16'),(57,-24,'Pago con tarjeta','ES6401828531822652196326','ES5284759834759283759801','ES5284759834759283759801','2022-11-05 17:14:04'),(58,-56,'Pago de factura','ES8104874923135896437427','ES7284759834759283759809','ES7284759834759283759809','2023-05-25 17:24:16'),(59,-50,'Retirada en cajero',NULL,'ES7284759834759283759868','ES7284759834759283759868','2022-09-17 11:48:50'),(60,-200,'Pago de recibo','ES8901287993607768239226','ES7284759834759283759888','ES7284759834759283759888','2023-05-25 17:24:16'),(61,-58,'Pago con tarjeta','ES8104874923135896437427','ES8284759834759283759869','ES8284759834759283759869','2022-10-23 07:59:11'),(62,-50,'Retirada en cajero',NULL,'ES9237459875982734982356','ES9237459875982734982356','2023-05-25 17:24:16'),(63,-47,'Pago de recibo','ES6401828531822652196326','ES9284759834759283759837','ES9284759834759283759837','2023-05-25 17:24:16'),(64,-200,'Retirada en cajero',NULL,'ES9284759834759283759880','ES9284759834759283759880','2022-08-27 16:23:09'),(65,5000,'Nomina','ES5284759834759283759801','ES4221001852211351719629','ES5284759834759283759801','2023-05-25 17:24:16'),(66,5000,'Nomina','ES7284759834759283759809','ES4221001852211351719629','ES7284759834759283759809','2023-05-25 17:24:16'),(67,5000,'Nomina','ES7284759834759283759868','ES4221001852211351719629','ES7284759834759283759868','2022-12-09 13:37:58'),(68,5000,'Nomina','ES7284759834759283759888','ES4221001852211351719629','ES7284759834759283759888','2023-05-25 17:24:16'),(69,2000,'Nomina','ES8284759834759283759869','ES0730042459936869771571','ES8284759834759283759869','2022-10-03 06:42:18'),(70,1500,'Nomina','ES9237459875982734982356','ES1720953451857146177519','ES9237459875982734982356','2023-05-25 17:24:16'),(71,5000,'Nomina','ES9284759834759283759837','ES4221001852211351719629','ES9284759834759283759837','2022-09-12 21:30:15'),(72,2000,'Nomina','ES9284759834759283759880','ES0730042459936869771571','ES9284759834759283759880','2023-05-25 17:24:16'),(73,6000,'Nomina','ES5284759834759283759801','ES4221001852211351719629','ES5284759834759283759801','2022-11-25 10:05:42'),(74,1120,'Nomina','ES7284759834759283759809','ES1720953451857146177519','ES7284759834759283759809','2023-05-25 17:24:16'),(75,5000,'Nomina','ES7284759834759283759868','ES0730042459936869771571','ES7284759834759283759868','2023-05-25 17:24:16'),(76,7500,'Nomina','ES7284759834759283759888','ES4221001852211351719629','ES7284759834759283759888','2023-05-25 17:24:16'),(77,3000,'Nomina','ES8284759834759283759869','ES0730042459936869771571','ES8284759834759283759869','2022-09-20 22:08:06'),(78,2000,'Nomina','ES9237459875982734982356','ES0730042459936869771571','ES9237459875982734982356','2023-05-25 17:24:16'),(79,1999,'Nomina','ES9284759834759283759837','ES1720953451857146177519','ES9284759834759283759837','2022-10-05 08:56:27'),(80,2100,'Nomina','ES9284759834759283759880','ES0730042459936869771571','ES9284759834759283759880','2023-05-25 17:24:16'),(81,2340,'Nomina','ES5284759834759283759801','ES0730042459936869771571','ES5284759834759283759801','2023-05-25 20:24:16'),(82,1080,'Nomina','ES7284759834759283759809','ES1720953451857146177519','ES7284759834759283759809','2023-05-25 12:24:16'),(83,5000,'Nomina','ES7284759834759283759868','ES0730042459936869771571','ES7284759834759283759868','2023-05-25 19:24:16'),(84,7500,'Nomina','ES7284759834759283759888','ES4221001852211351719629','ES7284759834759283759888','2023-05-25 18:22:12'),(85,5004,'Nomina','ES8284759834759283759869','ES4221001852211351719629','ES8284759834759283759869','2023-05-25 14:22:11'),(86,-150,'Retirada en cajero',NULL,'ES9237459875982734982356','ES9237459875982734982356','2023-05-25 17:24:16'),(87,-80,'Pago de recibo','ES8104874923135896437427','ES9284759834759283759837','ES9284759834759283759837','2023-05-25 17:24:16'),(88,-120,'Retirada en cajero',NULL,'ES9284759834759283759880','ES9284759834759283759880','2022-11-15 18:45:21'),(89,-60,'Pago con tarjeta','ES8104874923135896437427','ES5284759834759283759801','ES5284759834759283759801','2023-04-25 10:05:42'),(90,-66,'Pago de factura','ES8104874923135896437427','ES7284759834759283759809','ES7284759834759283759809','2023-05-25 17:24:16'),(91,-50,'Retirada en cajero',NULL,'ES7284759834759283759868','ES7284759834759283759868','2023-05-22 17:24:16'),(92,-75,'Pago de recibo','ES8104874923135896437427','ES7284759834759283759888','ES7284759834759283759888','2023-05-19 17:24:16'),(93,-200,'Pago con tarjeta','ES8901287993607768239226','ES8284759834759283759869','ES8284759834759283759869','2023-05-22 17:24:16'),(94,-150,'Retirada en cajero',NULL,'ES9237459875982734982356','ES9237459875982734982356','2022-12-31 09:12:34'),(95,-50,'Pago de recibo','ES8104874923135896437427','ES9284759834759283759837','ES9284759834759283759837','2023-05-25 18:24:16'),(96,-120,'Retirada en cajero',NULL,'ES9284759834759283759880','ES9284759834759283759880','2023-05-25 17:24:16'),(97,-60,'Pago con tarjeta','ES8104874923135896437427','ES5284759834759283759801','ES5284759834759283759801','2023-02-08 09:12:34'),(98,-77,'Pago de recibo','ES8104874923135896437427','ES7284759834759283759809','ES7284759834759283759809','2023-05-25 17:23:16'),(99,-200,'Retirada en cajero',NULL,'ES7284759834759283759868','ES7284759834759283759868','2023-01-21 12:23:16');
/*!40000 ALTER TABLE `movimientos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagos`
--

DROP TABLE IF EXISTS `pagos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagos` (
  `idPago` int NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `cantidad` float NOT NULL,
  `idPres` int NOT NULL,
  PRIMARY KEY (`idPago`),
  KEY `fk_idPres_idx` (`idPres`),
  CONSTRAINT `fk_idPres` FOREIGN KEY (`idPres`) REFERENCES `prestamos` (`idPres`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagos`
--

LOCK TABLES `pagos` WRITE;
/*!40000 ALTER TABLE `pagos` DISABLE KEYS */;
INSERT INTO `pagos` VALUES (1,'2023-01-01',100,7),(2,'2023-02-01',100,7),(3,'2023-03-01',100,7),(4,'2023-02-05',200,8),(5,'2023-03-05',200,8),(6,'2023-04-05',200,8),(7,'2023-01-28',300,9),(8,'2023-02-28',300,9),(9,'2023-03-28',300,9),(10,'2023-04-28',300,9);
/*!40000 ALTER TABLE `pagos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfiles`
--

DROP TABLE IF EXISTS `perfiles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `perfiles` (
  `usuario` varchar(25) NOT NULL,
  `uuid` char(36) NOT NULL,
  `contrasena` varchar(25) NOT NULL,
  `situacionCivil` varchar(25) DEFAULT NULL,
  `situacionLaboral` enum('empleado','desempleado','autonomo','pensionista','rentista','estudiante','responsable del hogar') NOT NULL,
  `moroso` tinyint(1) NOT NULL DEFAULT '0',
  `procesoJudicial` tinyint(1) NOT NULL DEFAULT '0',
  `uuidPareja` char(36) DEFAULT NULL,
  `regimen` enum('gananciales','separacion_de_bienes') DEFAULT NULL,
  PRIMARY KEY (`usuario`),
  KEY `fk_uuid` (`uuid`),
  KEY `fk_pareja_idx` (`uuidPareja`),
  CONSTRAINT `fk_pareja` FOREIGN KEY (`uuidPareja`) REFERENCES `clientes` (`uuid`),
  CONSTRAINT `fk_uuid` FOREIGN KEY (`uuid`) REFERENCES `clientes` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfiles`
--

LOCK TABLES `perfiles` WRITE;
/*!40000 ALTER TABLE `perfiles` DISABLE KEYS */;
INSERT INTO `perfiles` VALUES ('cliente1','0245c353-fa61-11ed-be56-0242ac120002','password1','soltero','empleado',0,0,NULL,NULL),('cliente10','373c0f41-fa5d-11ed-be56-0242ac120002','password10','soltero','estudiante',0,0,NULL,NULL),('cliente11','39563a8e-fa61-11ed-be56-0242ac120002','password11','soltero','pensionista',0,0,NULL,NULL),('cliente12','3bc097d4-fa5c-11ed-be56-0242ac120002','password12','casado','desempleado',1,0,'f4759b34-fa5d-11ed-be56-0242ac120002','gananciales'),('cliente2','03f832c9-fa5d-11ed-be56-0242ac120002','password2','casado','autonomo',1,0,NULL,'gananciales'),('cliente3','0893ea34-fa5c-11ed-be56-0242ac120002','password3','soltero','estudiante',0,0,NULL,NULL),('cliente4','1994c60d-fa62-11ed-be56-0242ac120002','password4','casado','empleado',0,1,NULL,'separacion_de_bienes'),('cliente5','1a7d8645-fa5b-11ed-be56-0242ac120002','password5','soltero','pensionista',0,0,NULL,NULL),('cliente6','277b9255-fa5f-11ed-be56-0242ac120002','password6','casado','desempleado',1,0,NULL,'gananciales'),('cliente7','2807a8ab-fa5e-11ed-be56-0242ac120002','password7','soltero','responsable del hogar',0,0,NULL,NULL),('cliente8','28a76bf0-fa60-11ed-be56-0242ac120002','password8','soltero','autonomo',0,0,NULL,NULL),('cliente9','32e33fca-fa61-11ed-be56-0242ac120002','password9','casado','empleado',1,0,NULL,'separacion_de_bienes');
/*!40000 ALTER TABLE `perfiles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `preconcedidosmayo`
--

DROP TABLE IF EXISTS `preconcedidosmayo`;
/*!50001 DROP VIEW IF EXISTS `preconcedidosmayo`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `preconcedidosmayo` AS SELECT 
 1 AS `idPres`,
 1 AS `periodo`,
 1 AS `fechaOfer`,
 1 AS `plazo`,
 1 AS `interes`,
 1 AS `cantidad`,
 1 AS `fechaFirma`,
 1 AS `cantMens`,
 1 AS `uuid`,
 1 AS `nombre`,
 1 AS `apellidos`,
 1 AS `telefono`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `prestamos`
--

DROP TABLE IF EXISTS `prestamos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamos` (
  `idPres` int NOT NULL AUTO_INCREMENT,
  `periodo` smallint NOT NULL,
  `fechaOfer` date NOT NULL,
  `plazo` smallint NOT NULL,
  `interes` float NOT NULL,
  `cantidad` float NOT NULL,
  `fechaFirma` date DEFAULT NULL,
  `cantMens` float DEFAULT NULL,
  `uuid` char(36) NOT NULL,
  PRIMARY KEY (`idPres`),
  KEY `fk_uuid_idx` (`uuid`),
  CONSTRAINT `fk_idClien` FOREIGN KEY (`uuid`) REFERENCES `clientes` (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamos`
--

LOCK TABLES `prestamos` WRITE;
/*!40000 ALTER TABLE `prestamos` DISABLE KEYS */;
INSERT INTO `prestamos` VALUES (6,4,'2022-12-05',30,3.5,10000,NULL,NULL,'992b8f20-fa5a-11ed-be56-0242ac120002'),(7,10,'2022-12-24',20,4.2,1200,'2022-12-25',100,'992b8f20-fa5a-11ed-be56-0242ac120002'),(8,10,'2022-12-10',12,2.8,2000,'2022-12-12',200,'9d515a55-fa60-11ed-be56-0242ac120002'),(9,20,'2022-12-24',36,3.9,6000,'2022-12-26',300,'9d9882ba-fa5f-11ed-be56-0242ac120002'),(10,16,'2023-05-24',18,2.5,3000,NULL,NULL,'9eadecc2-fa5c-11ed-be56-0242ac120002'),(11,13,'2023-05-24',48,4.8,15000,NULL,NULL,'9f9b52f0-fa5e-11ed-be56-0242ac120002'),(12,12,'2023-05-24',24,3.2,7000,NULL,NULL,'a4d9a7e5-fa5b-11ed-be56-0242ac120002'),(13,11,'2023-05-25',12,2.7,4000,NULL,NULL,'bf3da61b-fa61-11ed-be56-0242ac120002'),(14,12,'2023-05-24',36,3.7,10000,NULL,NULL,'c6a378ac-fa5d-11ed-be56-0242ac120002'),(15,14,'2023-05-24',18,2.3,6000,NULL,NULL,'c7d50d9f-fa61-11ed-be56-0242ac120002');
/*!40000 ALTER TABLE `prestamos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'prestamos'
--
/*!50106 SET @save_time_zone= @@TIME_ZONE */ ;
/*!50106 DROP EVENT IF EXISTS `actualizarMediaIngresos` */;
DELIMITER ;;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;;
/*!50003 SET character_set_client  = utf8mb4 */ ;;
/*!50003 SET character_set_results = utf8mb4 */ ;;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;;
/*!50003 SET @saved_time_zone      = @@time_zone */ ;;
/*!50003 SET time_zone             = 'SYSTEM' */ ;;
/*!50106 CREATE*/ /*!50117 DEFINER=`root`@`localhost`*/ /*!50106 EVENT `actualizarMediaIngresos` ON SCHEDULE EVERY 1 MONTH STARTS '2023-01-31 12:00:00' ON COMPLETION NOT PRESERVE ENABLE DO update cuentas set nominaMedAnual= (nominaMedAnual + nominaUltimo) / TIMESTAMPDIFF(MONTH, '2023-01-01', NOW()) */ ;;
/*!50003 SET time_zone             = @saved_time_zone */ ;;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;;
/*!50003 SET character_set_client  = @saved_cs_client */ ;;
/*!50003 SET character_set_results = @saved_cs_results */ ;;
/*!50003 SET collation_connection  = @saved_col_connection */ ;;
/*!50106 DROP EVENT IF EXISTS `evento_prestamos_verano_mayores_53_53` */;;
DELIMITER ;;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;;
/*!50003 SET character_set_client  = utf8mb4 */ ;;
/*!50003 SET character_set_results = utf8mb4 */ ;;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;;
/*!50003 SET @saved_time_zone      = @@time_zone */ ;;
/*!50003 SET time_zone             = 'SYSTEM' */ ;;
/*!50106 CREATE*/ /*!50117 DEFINER=`root`@`localhost`*/ /*!50106 EVENT `evento_prestamos_verano_mayores_53_53` ON SCHEDULE EVERY 1 YEAR STARTS '2023-06-21 00:00:01' ENDS '2027-01-01 00:00:01' ON COMPLETION NOT PRESERVE ENABLE DO insert into prestamos (periodo,fechaOfer,plazo,interes,cantidad,uuid)
select 2, '2023-06-21 ',12,7.5,10000,uuid from clientes where fechaNac < '1970-01-01 ' */ ;;
/*!50003 SET time_zone             = @saved_time_zone */ ;;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;;
/*!50003 SET character_set_client  = @saved_cs_client */ ;;
/*!50003 SET character_set_results = @saved_cs_results */ ;;
/*!50003 SET collation_connection  = @saved_col_connection */ ;;
DELIMITER ;
/*!50106 SET TIME_ZONE= @save_time_zone */ ;

--
-- Dumping routines for database 'prestamos'
--

--
-- Final view structure for view `preconcedidosmayo`
--

/*!50001 DROP VIEW IF EXISTS `preconcedidosmayo`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `preconcedidosmayo` (`idPres`,`periodo`,`fechaOfer`,`plazo`,`interes`,`cantidad`,`fechaFirma`,`cantMens`,`uuid`,`nombre`,`apellidos`,`telefono`) AS select `prestamos`.`idPres` AS `idPres`,`prestamos`.`periodo` AS `periodo`,`prestamos`.`fechaOfer` AS `fechaOfer`,`prestamos`.`plazo` AS `plazo`,`prestamos`.`interes` AS `interes`,`prestamos`.`cantidad` AS `cantidad`,`prestamos`.`fechaFirma` AS `fechaFirma`,`prestamos`.`cantMens` AS `cantMens`,`prestamos`.`uuid` AS `uuid`,`clientes`.`nombre` AS `nombre`,`clientes`.`apellidos` AS `apellidos`,`clientes`.`telefono` AS `telefono` from (`clientes` join `prestamos` on((`prestamos`.`uuid` = `clientes`.`uuid`))) where (`prestamos`.`fechaOfer` like '2023-05-%') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-29  3:45:26



```
[Volver arriba](#)
