# Entornos

---

En entorno de desarrollos hemos diseñado los diagramas de casos de uso, de sequencia y de clases. Además, hemos hecho la documentacion del proyecto en documentos de markdown y hemos estado trabajando con un repositorio en remoto en GitHub.

Índice:

[Diagrama de Casos de uso](##diagrama-de-casos-de-uso)

[Diagramas Secuenciales](#diagramas-secuenciales)

[Diagrama de Clases](#diagrama-de-clases)

## Diagrama de Casos de Uso

Se desea crear un programa que simule un banco que registra clientes, información de estos, de sus cuentas, movimientos que se realicen en éstas, préstamos ofrecidos , aceptados  y los pagos de estos.

[Diagrama de Casos de Uso](https://github.com/Kangelx/Equipo3/blob/master/Imagenes/Diagrama%20casos%20de%20uso.drawio.png)

Hay 2 actores en el diagrama UML, cliente y banquero.

Las operaciones que debería realizar la aplicación son las que se indican a continuación:

### Cliente:

Consultar cuenta:  para esta operación se debe suministrar el iban de la cuenta.

Hacer operación: se proporciona el iban de la cuenta, cantidad, concepto y fecha.

Aceptar préstamo preestablecido: se requiere el id del préstamo.

Consultar préstamos ofrecidos: se introduce el uuid del cliente y se muestran los préstamos que le han sido ofrecido.

Consultar estado de préstamos: se introduce el iban de una cuenta y se muestra el estado de los préstamos asociados a ese iban.

### Banquero:

Registrar usuario: se piden los datos del usuario: uuid,dni,nombre,apellidos,teléfono,dirección,localidad,fechaNac,iban.

Ofrecer préstamo: se introducen los datos del préstamo: idPres, periodo,fechaOfer,plazo,interés,cantidad,uuid.

### Restricciones:

Asimismo, deben tenerse en cuenta las siguientes restricciones:

No puede haber iban iguales.

No puede haber 2 idOperación iguales.

No puede haber 2 uuid iguales.

No puede haber 2 idPrestamo iguales.

No puede haber 2 idPago iguales.

No puede haber 2 usuarios iguales.

No puede haber 2 clientes con el mismo dni.

### Consultar cuenta:

-Actores involucrados: Cliente.

-Precondición: La cuenta debe estar creada y debe haber un cliente creado que es titular de dicha cuenta.

-Flujo básico:

1-El cliente solicita consultar los datos de una cuenta.

2- Se pide al cliente la introducción del iban de la cuenta.

3-El sistema comprueba que existe ese iban y que corresponde con el uuid del cliente que hace la solicitud.

4-Se  vuelve a solicitar a la persona usuaria que seleccione una operación.

-Caminos alternativos:

	*Si en el paso 3 se detecta que no existe ningún iban con los datos introducidos, o que el iban introducido, aún existiendo, no corresponde con el uuid del cliente que hace la consulta, se muestra un mensaje de error que el usuario debe aceptar y se va al paso 4.
	
-Post-condición:  se muestran los datos de la cuenta.

### Hacer operación:

-Actores involucrados: Cliente.

-Precondición:  La cuenta tiene que estar creada. Tiene que existir un cliente titular de dicha cuenta. 

-Flujo básico:

1- El cliente solicita realizar una operación en la cuenta (ingreso, envío, etc).

2-Se pide al cliente la introducción de la cantidad, concepto, iban destinatario o iban de destino, fecha.

3- El sistema comprueba que los iban son existentes, los conceptos son reales, si es una cantidad correcta, y que la fecha sea correcta.

4- Se vuelve a solicitar al usuario la introducción de una operación.

 	*Si  en el paso 3 anterior se detecta que alguno de los datos es incorrecto, se muestra un mensaje que el usuario debe aceptar y se pasa al paso 4.

-Post-condición: se crea un  movimiento.

### Aceptar préstamo preestablecido:

-Actores Involucrados: Cliente.

-Precondición:  Tiene que existir un préstamo preestablecido. Tiene que existir un Cliente receptor. 

-Flujo básico:

1-El cliente solicita aceptar un préstamo preestablecido.

2- Se piden al cliente que introduzca el id del préstamo que quiere aceptar.

3- Se comprueba que existe ese id de préstamo.

4- Se vuelve a solicitar al cliente la selección de una operación.

-Caminos alternativos:

	*si en el paso 3 se comprueba que no existe un id con el valor introducido, se pasa al punto 4 directamente.
	
-Post-condición: se crea un objeto prestamoAceptado.

### Consultar préstamos ofrecido:

-Actores involucrados: Cliente.

-Precondición: Tiene que existir un préstamo ofrecido. Tiene que existir un cliente que haya recibido dicho préstamo ofrecido.

-Flujo básico:

1-El cliente solicita consultar los  préstamos ofrecidos.

2-Se pide al cliente que introduzca su uuid para comprobar los préstamos ofrecidos asociados.

3- Se comprueba que existe ese uuid, y que tiene préstamos ofrecidos.

4- Se vuelve a solicitar al cliente que seleccione una operación.

-Caminos alternativos:

	*Si en el paso 3 se detecta que no existe un uuid con el valor introducido, se pasa directamente al punto 4.
	
Post-condición: El  estado del sistema no cambia. Se muestra los datos de los préstamos ofrecidos.


### Consultar estado de préstamo:

-Actores involucrados: Cliente.

-Precondición: tiene que existir un préstamo.

-Flujo básico:

1-El cliente solicita consultar el estado de los préstamos.

2-Se pide al cliente que introduzca su uuid para mostrar los préstamos asociados.

3- Se comprueba que el uuid es correcto y corresponde al cliente en cuestión.

4-Se vuelve a solicitar al usuario la selección de una operación.

-Caminos alternativos:

	*Si en el paso 3 se detecta que no existe ese uuidm se muestra un mensaje que debe aceptar el cliente y se pasa al punto 4.
-Post-condición: No hay cambios en el sistema. Se muestra los datos de los préstamos asociados.

### Registrar usuario:

-Actores involucrados: Banquero.

-Precondición: ninguna.

-Flujo básico: 

1-El banquero solicita la inserción de un nuevo usuario.

2-Se pide al banquero la introducción de los datos del usuario: uuid,dni,nombre,apellidos,teléfono,dirección,localidad,fechaNac,iban.

3- el sistema comprueba que no haya un usuario con ese uuid en la base de datos, ni con ese dni. 

4-Se vuelve a solicitar al banquero la selección de una operación.

-Caminos alternativos:

	*Si en el paso 3 se detecta que existe un usuario registrado con ese uuid o dni, se pasa al punto 4.
	
Post-condición: se crea una nuevo usuario.


### Ofrecer préstamos:

Actores involucrados: Banquero.

Precondición:  tiene existir al menos un cliente al que ofrecer el préstamo que vamos a crear.

Flujo básico:

1-El banquero solicita la introducción de un nuevo préstamo.

2- Se pide al banquero la introducción de los datos del préstamo que se va a crear: idPres,período,fechaOfer,plazo,interés,cantidad,fechaFirma,cantMens,uuid.

3-El sistema comprueba si hay algún préstamo creado con el mismo idPres, en caso contrario se crea el préstamo.

4-Se vuelve a solicitar al banquero la selección de una operación.

-Caminos alternativos:

	*Si en el paso 3 se detecta que existe un préstamo con ese id, se pasa al punto 4 directamente.
	
-Post-condición: se crea un nuevo préstamo.

## Diagramas Secuenciales:

Los Diagramas Secuenciales recogen el proceso desde que se solicita una petición por parte del actor hasta que se realiza la petición o surge un error.

En nuestro proyecto, recogemos 6 escenarios que están represetandos en el siguiente Diagrama:

[Diagramas Secuenciales](https://github.com/Kangelx/Equipo3/blob/master/Imagenes/DIAGRAMAS%20SECUENCIALES.drawio.png)

## Diagrama de Clases

En los Diagramas de Clases hemos plasmado cómo interactúan las clases entre sí y qué métodos y atributos las componen.

[Diagrama de Clases](https://github.com/Kangelx/Equipo3/blob/master/Imagenes/DiagramaClases.drawio.png)



[Readme](README.md)



[Volver arriba](#)
