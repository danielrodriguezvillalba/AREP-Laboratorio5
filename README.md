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

Los archivos deben quedar cargados de la siguiente manera.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio5/blob/master/resources/HTMLBucket.PNG)

Dado el URL asignado por AWS que aparece dandole clic sobre el archivo HTML, podemos probar si nos funciono.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio5/blob/master/resources/IndexBucket.PNG)

## 2. Desplegar un formulario dinámico usando EC2

La respectiva implementacion del formulario del EC2 esta en la este repositorio.

Para crear una maquina virtual EC2 en AWS es necesario ingresar a la cuenta de aws educate, al estar ahi en el desplegable de servicios se debe pulsar en la opcion de EC2 que se muestra a continuacion.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio5/blob/master/resources/EC1.PNG)

Estando en este menú debe dirigirse a la opcion Launch Intance para asi poder crear la maquina virtual.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio5/blob/master/resources/EC2.PNG)

Paso siguiente debe seleccionar el tipo de maquina virtual que desea lanzar (recomendada la que se encuentra subrayada de amarillo) y al boton select sobre la que se quiere elegir.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio5/blob/master/resources/EC3.PNG)

Teniendo esto realizado es importante seleccionar la opcion subrayada para que asi no nos genere ningun costo y pulsar el boton de Review and launch.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio5/blob/master/resources/EC4.PNG)

Estando en la siguiente pantalla, en la cual se muestra el resumen de como vamos a crear nuestra maquina virtual se debe  pulsar en el boton de Launch.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio5/blob/master/resources/EC5.PNG)

Al pulsar el boton Launch, esto nos dirige a la siguiente ventana en la que si se tiene una Key disponible, se puede seleccionar una, sin embargo si no se tiene se debe poner el nombre que se quiera y se debe descargar y guardar en un lugar facil de recordar ya que esta nos servira para lanzar mas instancias de otras maquinas, paso siguiente se habilita la opcion de Launch Instance.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio5/blob/master/resources/EC6.PNG)

Listo, nuestra maquina visrtual S2 esta creada y nos saldra este aviso informandonos que quedo bien hecha.

![](https://github.com/danielrodriguezvillalba/AREP-Laboratorio5/blob/master/resources/EC7.PNG)


## 3. Enlazar el formulario a una base de datos relacional o no-relacional, para almacenar y traer los datos almacenados. Use servicios de base de datos de AWS.

