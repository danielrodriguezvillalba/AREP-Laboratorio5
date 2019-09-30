# AREP-Laboratorio5

# Autores:
* Daniel Felipe Rodriguez Villalba

# Patrones Arquitecturales
en el siguiente tutorial se trabajaran con distintos productos ofrecidos por AWS como lo son S3, EC2 y el sistema de bases de datos ofrecido por AWS. los procedimientos a realizar en este turotial se muestran a continuación:  
1. Desplegar un sitio estático usando S3

2. Desplegar un formulario dinámico usando EC2

3. Enlazar el formulario a una base de datos relacional o no-relacional, para almacenar y traer los datos almacenados. Use servicios de base de datos de AWS.

4. Configurar un VPC para gestionar la seguridad y los permisos de acceso a sus servidores.

## 1. Desplegar un sitio estático usando S3


Para poder desplegar un sitio estatico usando S3 Primero se debe ingresar a su cuenta de AWS Educate.

Paso siguiente debe ingresar en el menu de servicios prestados por AWS al boton en el que se muestra la opcion de S3.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio5/blob/master/resources/S3Servicios.PNG) 

Estando ubicado en este menú se debe pulsar el botón de Crear Bucket.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio5/blob/master/resources/S3New.PNG) 

Al pulsar el boton de crear se desplegara una ventana en la cual se debe ingresar el nombre que se quiere dar al bucket.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio5/blob/master/resources/NombreBucket.PNG)

Se debe dar en los botones de siguiente y asi se llega a una ventana como la siguiente en la que nos da opcion para poner nuestro Bucket publico, se debe desactivar la opción (esto es importante para poder ingresar desde cualquier otro servidor).

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio5/blob/master/resources/BucketPublico.PNG)

Se pulsa el boton siguiente y se finaliza este proceso pulsando el boton crear Bucket.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio5/blob/master/resources/CrearBucket.PNG)

Listo, ya tenemos nuestro S3 creado, ahora necesitamos cargar unos archivos HTML para poder probar que si esta funcionando, para esto se pulsa el boton de cargar, para asi subir un archivo index y una pagina para errores, se pulsa el boton y se seleccionan los respectivos archivos a ser subidos.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio5/blob/master/resources/CargarBucket.PNG)

Los archivos deben quedar cargador de la siguiente manera.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio5/blob/master/resources/HTMLBucket.PNG)

Dado el URL asignado por AWS que aparece dandole clic sobre el archivo HTML, podemos probar si nos funciono.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio5/blob/master/resources/IndexBucket.PNG)

## 2. Desplegar un formulario dinámico usando EC2



