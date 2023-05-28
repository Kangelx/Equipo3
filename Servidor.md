# Servidor
He instalado y configurado el servidor y le he conectado la maquina virtual windows 10.


Esta es la configuracion del servidor.

![servidor](Imagenes/serverconf.png "ServerConf")

He descargado el IIS de windows y así es como se ve la pagina desde la maquina de windows 10
despues de hacer unaos cambios a modo de comprobacion.

![pruebapag](Imagenes/Conexion.png "Conexion")

He descargado ademas xampp para poder manejar la base de datos desde el servidor

![xampp](Imagenes//xampp.png "Xampp")

![pruebapag](Imagenes/menuXampp.png "XamppMenu")

Durante la configuración de XAMPP tuve problemas con la asignación de puertos. Windows Server tenía protegido el puerto 80, así que para acceder a la página web hay que utilizar el puerto 8080. Para ello estuve cambiando cosas en los archivos de configuración.

![docXampp](Imagenes/docXampp.png "docXamp")

Además tambien e implementado la base de datos en el servidor.

![sql](Imagenes/sql.png "SQL")

Para que las dos maquinas puedan verse he añadido una excepcion en el puerto 8080 de ambas maquinas.

![8080](Imagenes/8080.png)

También he añadido en el archivo hosts de la maquina virtual windows 10 un nombre relacionado con la ip del servidor.

![hosts](Imagenes/hosts.png)

[Readme](README.md)
