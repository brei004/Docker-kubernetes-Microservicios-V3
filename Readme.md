## V3
Vamos a crear microservicios de todas las clases existentes, para esto necesitamos crear los archivos Dockerfile para cada clase

![alt text](images/image-17.png)

Posteriormente, creamos las 5 imagenes 

![alt text](images/image.png)

Usamos "docker-compose" para iniciar y ejecutar múltiples contenedores definidos en un archivo docker-compose.yml

![alt text](images/image-1.png)

Creamos los deployments que utilizan la imagen creada para ejecutarse en el cluster de kubernetes

![alt text](images/image-19.png)

Usamos minikube para crear un clúster de Kubernetes local y desplegamos los deployment que nos asegura que una copia esté corriendo en nuestro contenedor

![alt text](images/image-2.png)



Revisamos los pod que sería la unidad más pequeña y simple de despliegue. Creados en el momento del despliegue

![alt text](images/image-3.png)

Creamos los servicios que ayudan al pod para darle una IP , que utilizan las   y luego lo lanzamos. Además utilizamos LoadBalancer para balancear la carga 

![alt text](images/image-18.png)

![alt text](images/image-4.png)
## Implementacion de tests
*GameTest*
Probamos la inyección de mockTower en el constructor de gameService y su posterior verificaión
![alt text](images/image-21.png)
*TowerTest*
Tenemos 2 tests el primero comprueba que retorna el simbolo correcto para una torre. El otro que la creación de la torre fue correcta y que retorna correctamente el simbolo que se le pasó por el constructor
![alt text](images/image-25.png)
*PlayerTest*
Los 3 tests unitarios comprueban el correcto retorno de los getters de la clase player
![alt text](images/image-26.png)
*MapTest*
El primer test verifica la grilla si ubicamos la torre en una posición
El segundo test verifica la grilla sin poner torres sea correcta

![alt text](images/image-27.png)
## Configuración pitest
En nuestro build.gradle agregamos las siguientes lineas
![alt text](images/image-22.png)
![alt text](images/image-23.png)
![alt text](images/image-24.png)

## Resultados
En pruebas pasadas la ejecución de pitest no tuvo problema sin embargo en esta ocasión no se pudo ejecutar
![alt text](images/image-28.png)

## Ejercicio 1

En este ejercicio crearemos un microservicio para registrar las acciones importantes que pasan en nuestro juego como la creación de torres o nuestro puntaje

*Creación de docker-compose*
Docker-compose nos permite gestionar los multiconedores y multiservicio que hemos creado y indicar como queremos que sean construidos, ejecutados y conectados a los contenedores.
![alt text](images/image-5.png)

*Implementamos la clase LogService*
Esta clase tiene un único método que recibe los eventos y los va registrando en un txt 
![alt text](images/image-29.png)

*Creamos el dockerFile*
![alt text](images/image-30.png)

*Modificamos las otras clases*
Al colocar una torre o iniciar una nueva oleada se envía un evento a LogService
![alt text](images/image-7.png)

*Ejecución docker-compose up*
Construye, crea y ejecuta los contenedores mencionados en docker-compose.yml
![alt text](images/image-10.png)


## Ejercicio 2
Implementaremos un microservicio de autentifación para usuarios.

*Creación de la clase AuthService*

Esta clase tiene un Hash de usuarios(nombre, contraseña) y un método para verificar la existencia de un usuario en nuestros usuarios válidos 
![alt text](images/image-11.png)

*Modificación de otras Clases*
En este caso modificaremos GameService para que se requiera logearse para poder jugar, pedirá usuario y contraseña y le enviará un evento registrando el correcto logeo
![alt text](images/image-12.png)

*Creación dockerfile*

Creamos un nuevo dockerfile para esta clase
![alt text](images/image-14.png)

*Modificación docker-compose*

Debido a las modificaciones debemos indicar la ubicación y el nombre del dockerfile
![alt text](images/image-15.png)

*Ejecución de docker-compose up*

Ejecutamos docker-compose y verificamos que no hayan errores
![alt text](images/image-16.png)