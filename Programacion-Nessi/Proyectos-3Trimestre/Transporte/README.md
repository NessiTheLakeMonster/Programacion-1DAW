# ENUNCIADO TRANSPORTES

Trabajamos para DHUR, una empresa de entrega de paquetes y mensajería. Nos encargan que realicemos la simulación 
del reparto de una ciudad a la que han dividido en sectores.

Nuestra ciudad estará dividida en una **cuadrícula de 3x3**.

A nuestra sede llegan **paquetes** con un destinatario, un peso y un indicador de si es frágil o no. Del destinatario 
nos interesa el nombre, dirreción y teléfono. Los paquetes, además, podrán ser urgentes (tendremos que almacenar 
cuantos días de retraso permitimos en la entrega) o certificados (en este caso se guardará la fecha de entrega y 
quien firma la misma - DNI). Estos paquetes irán llegando y los iremos recolocando en sectores de la cuadrícula. 
Podrán llegar paquetes de los tres tipos.

Por otro lado tendremos también repartidores que identificaremos con una id (número de tres cifras concatenado con
una letra, que generaremos al azar), nombre, fila asignada y un contador de amonestaciones. Estos repartidores estarán
a cargo de una furgoneta de la que guardaremos la matrícula, marca y modelo; en estas furgonetas sólo se podrán 
almacenar para su reparto, como máximo, cuatro paquetes.

La sede, podrá generar informes. Estos informes serán: 
* de un sector concreto
* de una fila entera
* de una columna o de toda la ciudad. 
Los informes mostrarán el total de paquetes de cada tipo que hay por sector y un resumen descriptivo de los mismos.

La sede podrá comprobar también el total de paquetes que hay en toda una fila y amonestar al repartidor correspondiente 
si el total de paquetes que hay sin repartir excede de 20. Total de paquetes en toda la fila asignada a ese repartidor.

**Inicialización:**
* Se genera una ciudad vacía.
* Se generará un repartidor por fila y se le asignará una furgoneta vacía. Todos los valores de tipo String se pueden generar al azar de una lista de nombres pequeñas (con los valores que queráis).
* Otras inicializaciones que creas oportunas.

**Simulación:**
* Cada 2 segundos se generan en todos los sectores entre 0 y 2 paquetes. El tipo de los mismos es al azar, con la probabilidad: 
  * 50% paquetes normales
  * 25% urgentes 
  * 25% certificados. 
  * Sus datos aleatorios.
* Cada 6 segundos cada repartidor elige un sector (elegirá el que más paquetes en total tenga acumulados) de su fila asignada y carga su furgoneta con el máximo de paquetes posible por este orden: 
  * primero los urgentes
  * segundo los certificados 
  * finalmente los paquetes normales. 

* **OJO:** esos paquetes deben salir del sector y pasar a la furgoneta de reparto. Se mostrará un mensaje indicando qué paquetes están siendo repartidos por ese repartidor y luego, cuando vuelvan a pasar 6 segundos y tengamos que volver a hacer esto, desaparecerán de la misma (pero deben haber estado en ella). 

* Cada 10 segundos se genera un informe aleatorio. Sólo uno de estos cuatro tipos de informe: informe de un sector puntual, informe de una fila, informe de una columna o informe de toda la ciudad.
* Cada 20 segundos se recorrerá toda la ciudad y para aquellas filas en las que el total de paquetes (contándolos todos de toda la fila) supere los 20 implicará una amonestación para el repartidor encargado.
* Cuanda acaba la simulación (a los dos minutos) se mostrará toda la información de la ciudad de la siguiente manera: cuantos paquetes de cada tipo por cada sector, sólo cantidad y tipo por sector. También se mostrará la información de los repartidores indicando sus datos, el número de amonestaciones que tienen y el contenido de sus furgonetas al acabar la simulación.


# NOTAS SOBRE EL ENUNCIADO

## CLASES

* Clase Paquete()
  * destinatario
    * nombre
    * direccion 
    * telefono
  * peso
  * indicador -> si es fragil o no