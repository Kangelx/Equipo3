-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: pretamos
-- ------------------------------------------------------
-- Server version	8.0.29

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
  `iban` varchar(34) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `dni` (`dni`),
  KEY `fk_iban_idx` (`iban`),
  CONSTRAINT `fk_iban` FOREIGN KEY (`iban`) REFERENCES `cuentas` (`iban`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes_pagos_prestamos`
--

DROP TABLE IF EXISTS `clientes_pagos_prestamos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes_pagos_prestamos` (
  `uuidCli` char(36) NOT NULL,
  `idPag` int NOT NULL,
  `idPrestamo` int NOT NULL,
  PRIMARY KEY (`uuidCli`,`idPag`),
  KEY `fk_idPago_idx` (`idPag`),
  KEY `fk_idPrestamo_idx` (`idPrestamo`),
  CONSTRAINT `fk_idPago` FOREIGN KEY (`idPag`) REFERENCES `pagos` (`idPago`),
  CONSTRAINT `fk_idPrestamo` FOREIGN KEY (`idPrestamo`) REFERENCES `prestamos` (`idPres`),
  CONSTRAINT `fk_uuidCli` FOREIGN KEY (`uuidCli`) REFERENCES `clientes` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes_pagos_prestamos`
--

LOCK TABLES `clientes_pagos_prestamos` WRITE;
/*!40000 ALTER TABLE `clientes_pagos_prestamos` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientes_pagos_prestamos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuentas`
--

DROP TABLE IF EXISTS `cuentas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cuentas` (
  `iban` varchar(34) NOT NULL,
  `tipoCuenta` varchar(25) NOT NULL,
  `saldo` float NOT NULL,
  `nominaUltimo` float DEFAULT NULL,
  `nominaMedAnual` float DEFAULT NULL,
  PRIMARY KEY (`iban`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuentas`
--

LOCK TABLES `cuentas` WRITE;
/*!40000 ALTER TABLE `cuentas` DISABLE KEYS */;
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
  `uuidDestinatario` char(36) DEFAULT NULL,
  `uuidEmisor` char(36) DEFAULT NULL,
  `iban` varchar(36) NOT NULL,
  PRIMARY KEY (`idOperacion`),
  KEY `fk_ib_idx` (`iban`),
  CONSTRAINT `fk_ib` FOREIGN KEY (`iban`) REFERENCES `cuentas` (`iban`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimientos`
--

LOCK TABLES `movimientos` WRITE;
/*!40000 ALTER TABLE `movimientos` DISABLE KEYS */;
/*!40000 ALTER TABLE `movimientos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagos`
--

DROP TABLE IF EXISTS `pagos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagos` (
  `idPago` int NOT NULL,
  `fecha` date NOT NULL,
  `cantidad` float NOT NULL,
  PRIMARY KEY (`idPago`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagos`
--

LOCK TABLES `pagos` WRITE;
/*!40000 ALTER TABLE `pagos` DISABLE KEYS */;
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
  `contraseña` varchar(25) NOT NULL,
  `situacionCivil` varchar(25) DEFAULT NULL,
  `situacionLaboral` enum('empleado','desempleado','autonomo','pensionista','rentista','estudiante','responsable del hogar') NOT NULL,
  `moroso` tinyint(1) NOT NULL DEFAULT '0',
  `procesoJudicial` tinyint(1) NOT NULL DEFAULT '0',
  `uuidPareja` char(36) DEFAULT NULL,
  `regimen` enum('gananciales','separacion de bienes') DEFAULT NULL,
  PRIMARY KEY (`usuario`),
  KEY `fk_uuid` (`uuid`),
  CONSTRAINT `fk_uuid` FOREIGN KEY (`uuid`) REFERENCES `clientes` (`uuid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfiles`
--

LOCK TABLES `perfiles` WRITE;
/*!40000 ALTER TABLE `perfiles` DISABLE KEYS */;
/*!40000 ALTER TABLE `perfiles` ENABLE KEYS */;
UNLOCK TABLES;

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
  PRIMARY KEY (`idPres`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamos`
--

LOCK TABLES `prestamos` WRITE;
/*!40000 ALTER TABLE `prestamos` DISABLE KEYS */;
INSERT INTO `prestamos` VALUES (1,2,'2022-10-02',10,3.3,2500,NULL,NULL),(2,4,'2021-01-02',50,3.5,1100,NULL,NULL),(3,5,'2022-08-26',33,2.9,6900,NULL,NULL),(4,8,'2022-12-11',40,4,4000,'2023-01-01',500),(5,20,'2020-11-22',44,1.6,4750,'2020-11-26',240);
/*!40000 ALTER TABLE `prestamos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-24 17:10:34
