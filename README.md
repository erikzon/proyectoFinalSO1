#### Segundo Proyecto, Sistemas Operativos 1
#### ERICK DONALDO OLIVA DEL CID 7691-20-10863
# Manual de Usuario
Este proyecto consiste en un simulador de memoria. 

## Quantum
Al abrir el programa el usuario se encontrara con el Quantum generado el cual ira desde 1000ms hasta 10000ms.
![image](https://user-images.githubusercontent.com/7264939/138543375-a1d136da-300b-4be2-ba60-5378c9951cbd.png)
|:--:| 
| *en este caso el Quantum generado es de 1129ms, poco mas de un segundo* |

## Crear procesos
Para crear un proceso simplemente debemos colocar el nombre y tamaño de memoria en Kb
![image](https://user-images.githubusercontent.com/7264939/138543387-b6d9a978-4496-4d38-9bb5-492ec58dca02.png)
|:--:| 
| *cada proceso debe tener un nombre, y el tamaño debe ir desde 1kb hasta 400000kb* |

## Lista de procesos
La lista de procesos nos da informacion sobre el estado, el tamaño y el ID de cada proceso.
![image](https://user-images.githubusercontent.com/7264939/138543416-bd966359-5dd5-482e-932a-94da2998e33f.png)
|:--:| 
| *el tiempo que un proceso este en estado "en espera" sera aleatorio, entre 1 a 3 segundos* |

## Asignacion de memoria
Esta lista nos muestra el estado interno de la memoria, los bloques de memoria son de 200000kb por lo que si el proceso utiliza menos de la memoria necesaria este ocupara solo un bloque.
![image](https://user-images.githubusercontent.com/7264939/138543489-a0f17e18-f2e2-46c4-b388-468d644e73aa.png)

Por otro lado si el proceso es mayor a 200000kb este puede ocupar hasta 2 bloques de memoria como en el siguiente ejemplo
![image](https://user-images.githubusercontent.com/7264939/138543511-1ffbc2f0-ab59-45e1-a3bf-718017b926a8.png)
|:--:| 
| *aca se puede apresiar que el mismo proceso utilizo 2 bloques de memoria* |

## Concurrencia
Si utilizamos varios procesos de distintos tamaños estos podran compartir el mismo bloque de memoria, optimizando asi la memoria que sobre de los bloques.
![image](https://user-images.githubusercontent.com/7264939/138543633-fabeb5bd-6ddc-49f4-8d8e-d59122a0fa23.png)


## Limite
El gestor de memoria unicamente puede gestionar hasta 15 procesos distintos
![image](https://user-images.githubusercontent.com/7264939/138543690-e8b9b9bc-7981-471a-b10a-ac2d304dc8b6.png)
Si usted alcanza el limite sera necesario esperar a que el proceso finalize y asi se liberen nuevos espacios para añadir mas procesos.
