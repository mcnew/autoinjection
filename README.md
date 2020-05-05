
## Alcance
Demostrar como tener 1 aplicacion (plantilla) con funcionalidad base para otras 2 aplicaciones, cambiando solo parte del funcionamiento mediante inyeccion en spring


## Uso

Una vez clonado el proyecto

```shell
$ cd proy0
$ mvn clean install
$ cd proy1
$ mvn clean package
$ cd proy2
$ mvn clean package
```

Al terminar se copian los wars generados (`proy1/web1/target/web1.war` y `proy2/web2/target/web2.war`) se copian en una instalacion limpia de tomcat (o cualquier servidor web que soporte wars), se levanta el servidor aplicativo. A continuacion se puede consutar la ejecucion de 2 controladores (tecnicamente el mismo controlador) pero recuperando diferente informacion:

	http://localhost:8080/web1/controller
	http://localhost:8080/web2/controller

Suponiendo que esta publicado el servicio en el puerto 8080.

La informacion que se regres en los servicios se encuentra hardcodeada en los archivos:

https://github.com/mcnew/autoinjection/blob/master/proy1/jar1/src/main/java/com/github/mc_new/jar1/dao/impl/DatatypeDao1.java

https://github.com/mcnew/autoinjection/blob/master/proy2/jar2/src/main/java/com/github/mc_new/jar2/dao/impl/DatatypeDao2.java

Y el filtro comun y al cual se le inyecta una instancia distinta, dependiendo del proyecto es:

https://github.com/mcnew/autoinjection/blob/master/proy0/jar0/src/main/java/com/github/mc_new/jar0/service/impl/DatatypeServiceImpl.java
