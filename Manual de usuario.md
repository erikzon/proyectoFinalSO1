#### Proyecto Final, Sistemas Operativos 1
#### ERICK DONALDO OLIVA DEL CID 7691-20-10863
# Manual de Usuario
Este proyecto consiste en un simulador de memoria, el cual utiliza tambien memoria virtual y paginacion. 

## Quantum
Al abrir el programa el usuario se encontrara con una ventana divida en colores:
![image](https://user-images.githubusercontent.com/7264939/140621704-3334b635-d882-4b53-b267-ec92336ea8d8.png)
La ventana esta divida en distintas areas:
- Area **amarilla**: esta nos muestra el Quantum generado el cual ira desde 1000ms hasta 10000ms.
Este sera el tiempo que usara el planificador para realizar sus tareas de asignacion, inicio y finalizacion de procesos.
- Area **celeste**: nos lista los procesos y su estado.
- Area **verde**: Esta es la tabla que muestra los procesos en memoria principal.
- Area **Roja**: En esta ingresaremos los procesos para que el planificador se haga cargo de ellos.
- Area **Azul**: Esta area es donde la memoria virtual y sus paginas se muestran.
|:--:| 

## Crear procesos
Para crear un proceso debemos ir al area roja y colocar el nombre, tamaño de memoria en Kb y hacer click en el boton "Añadir"
![image](https://user-images.githubusercontent.com/7264939/140621723-b29355e6-be26-467e-a162-b84253f5bd4a.png)
Esta area presenta los siguientes elementos:
- El Text Field **Nombre** es un valor que se debe agregar obligatoriamente, pueden ser numeros o letras.  
- El Text Field **Memoria** es un valor obligatorio que se debe agregar, acepta numeros desde 1 al 400,000, este valor estara en KB.  
- El boton **añadir** este agregara el proceso a la cola del planificador quien estara a cargo de asignarla a memoria.

## Lista de procesos
La lista de procesos nos da informacion sobre el estado, el tamaño y el ID de cada proceso.
![image](https://user-images.githubusercontent.com/7264939/140622578-d8aa1e75-67f2-4e56-8d5d-8ee169bb6afd.png)
|:--:| 
| *el tiempo que un proceso este en estado "en espera" sera aleatorio, entre 1 a 3 segundos* |

Esta tabla presenta los siguientes elementos:
- La columna **Proceso** es el nombre que se asigno al crear el proceso en el area "Crear Proceso".  
- La columna **PID** es el ID del proceso, el cual el planificador agrega automaticamente a cada proceso para identificarlo.
- La columna **Estado** indica si el proceso ya esta asignado a memoria o si esta a la espera de estarlo.
- La columna **Memoria** indica el tamaño del proceso, si el proceso super el marco de 200000 entonces este sera divido en dos marcos.

## Asignacion de memoria
Esta lista nos muestra el estado interno de la memoria, los bloques de memoria son de 200000kb por lo que si el proceso utiliza menos de la memoria necesaria este ocupara solo un bloque.
![image](https://user-images.githubusercontent.com/7264939/140622157-be22a1d8-5973-4f92-b01f-d63d22e3c09a.png)
Esta tabla presenta los siguientes elementos:
- La columna **Marco** es el marco de memoria que representa en memoria principal
- La columna **Memoria (KB)** nos indica que el marco tiene una capacidad de 200000kb
- La columna **En uso (KB)** indica la cantidad de memoria que esta siendo ocupada por los procesos.
- La columna **Disponible (KB)** mostrara la memoria libre que se posee dentro del marco.
- La columna **Procesos** indica los distintos procesos que tiene el marco separados por una coma.

## Memoria Virtual
Si la memoria principal se termina el planificador nos indicara que el proceso sera asignado a la memoria Virtual con el siguiente mensaje
![image](https://user-images.githubusercontent.com/7264939/140622270-b8364ad6-3f30-4251-9a8a-6d139c5ff17f.png)
|:--:| 
| *Debes hacer click en el boton "OK" para que el programa pueda continuar.* |

### Interfaz de Memoria Virtual
![image](https://user-images.githubusercontent.com/7264939/140622333-cc3ead86-a463-401a-bcbf-0f253161f283.png)
La memoria virtual guardara los procesos que no fueron asignados a memoria principal por falta de espacio.
Cuando un proceso termina y libera espacio en la memoria principal el proceso asignado en memoria principal sera cargado a la memoria principal automaticamente.
El area azul contiene 3 tablas:

#### Tabla Memoria Virtual
![image](https://user-images.githubusercontent.com/7264939/140622359-1487dec9-a197-4b8f-b5d3-7a47f43a4605.png)

Contiene 3 columnas:
- Columna **Proceso**: Este indica el nombre del proceso almacenado en memoria virtual
- Columna **PID**: Es el ID del proceso que el planificador asigno para este.
- Columna **Memoria**: Esta columna nos indica la cantidad de memoria que utiliza el proceso.

#### Tabla Paginas
![image](https://user-images.githubusercontent.com/7264939/140622425-e45ccc51-e111-496a-bb36-ba697a90a056.png)

Contiene 3 columnas:
- Columna **Proceso**: Este indica el nombre del proceso almacenado en memoria virtual
- Columna **Pagina**: Es la pagina de la memoria virtual donde esta alojada el proceso.
- Columna **Tamaño**: Esta columna nos indica la cantidad de memoria que utiliza la pagina.


#### Tabla "tabla de paginas"
![image](https://user-images.githubusercontent.com/7264939/140622467-4dc96b6f-15b9-4f2c-81a5-a4de133296ec.png)

Contiene 3 columnas:
- Columna **Pagina**: Es la pagina de la memoria virtual donde esta alojada el proceso.
- Columna **Marco**: Este marco representa el marco que representa en la pagina para la memoria principal cuando el proceso fue divido en paginas y una de ellas continua en la memoria principal.



## Limite
El gestor de memoria unicamente puede gestionar hasta 15 procesos distintos
![image](https://user-images.githubusercontent.com/7264939/140622533-95e74500-6e51-4253-bafb-bd8bdfdadfcf.png)
Si usted alcanza el limite sera necesario esperar a que el proceso finalize y asi se liberen nuevos espacios para añadir mas procesos.
