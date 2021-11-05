#### Proyecto Final, Sistemas Operativos 1
#### ERICK DONALDO OLIVA DEL CID 7691-20-10863
# Manual de Usuario
Este proyecto consiste en un simulador de memoria. 

## Quantum
Al abrir el programa el usuario se encontrara con el Quantum generado el cual ira desde 1000ms hasta 10000ms.

|:--:| 
| *en este caso el Quantum generado es de 1129ms, poco mas de un segundo* |

## Crear procesos
Para crear un proceso simplemente debemos colocar el nombre y tamaño de memoria en Kb

|:--:| 
| *cada proceso debe tener un nombre, y el tamaño debe ir desde 1kb hasta 400000kb* |

## Lista de procesos
La lista de procesos nos da informacion sobre el estado, el tamaño y el ID de cada proceso.

|:--:| 
| *el tiempo que un proceso este en estado "en espera" sera aleatorio, entre 1 a 3 segundos* |

## Asignacion de memoria
Esta lista nos muestra el estado interno de la memoria, los bloques de memoria son de 200000kb por lo que si el proceso utiliza menos de la memoria necesaria este ocupara solo un bloque.


Por otro lado si el proceso es mayor a 200000kb este puede ocupar hasta 2 bloques de memoria como en el siguiente ejemplo

|:--:| 
| *aca se puede apresiar que el mismo proceso utilizo 2 bloques de memoria* |

## Concurrencia
Si utilizamos varios procesos de distintos tamaños estos podran compartir el mismo bloque de memoria, optimizando asi la memoria que sobre de los bloques.


## Limite
El gestor de memoria unicamente puede gestionar hasta 15 procesos distintos

Si usted alcanza el limite sera necesario esperar a que el proceso finalize y asi se liberen nuevos espacios para añadir mas procesos.
