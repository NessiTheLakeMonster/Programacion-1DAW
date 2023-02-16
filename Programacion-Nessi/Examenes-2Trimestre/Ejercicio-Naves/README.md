# Enunciado del ejercicio

El _**Tet**_ es una estación espacial que orbita alrededor de la Tierra y que contendrá drones que enviará a la Tierra. La Tierra está dividida en una parrilla de cuadrantes de 3x3. En cada cuadrante operan varios drones y están supervisados por un Jack y una Vika (Jack y Vika tienen nombres como Jack01 o Vika12… ya lo veremos).

En el Tet **_hay un almacén de drones (100)_** que serán enviados a la Tierra cuando sean necesarios.

Cada **_cuadrante de la Tierra_** tendrá asignado entre 1 y 3 drones, un **_mecánico_** (Jack) y una **_supervisora_** (Vika). 
El nombre de estos personajes será: Jack + fila_cuadrante + col_cuadrante y para Vika igual.

Cuando se inicia un cuadrante se rellena por drones que serán enviados por el Tet.
Cada Dron tendrá un número de Dron (único) y si está operativo o no (por defecto todos están operativos).

El Tet también generará órdenes a sus cuadrantes. Estas órdenes tendrán una fecha, un campo que indique si se ha completado y un cuadrante de destino (fila y columna), asimismo pueden ser de reparación (indicando el nº de dron y el estado del mismo antes de ser reparado y después) o de reconocimiento (indicando el área a reconocer – un nº entre 1 y 20 y un campo que indique que se ha encontrado en ese área: animales, vegetales o radiación).

### Algoritmo:

* El **_Tet se rellena inicialmente_** con 200 drones, su número de identificación es único y su estado es operativo.
* Se rellenan los **_cuadrantes del planeta_**, asignando los drones del Tet (se sacan de él) y asignando un mecánico y una supervisora. El nombre de los mismos se ajustará a lo explicado anteriormente.
* Cada **_4 segundos_** se recorre el cuadrante y se estropean drones al azar. Un dron se estropea el 20% de las veces pasando a estar inactivo.
* Cada **_10 segundos_** el Tet recorre el planeta buscando drones estropeados, cursando las órdenes necesarias a los sectores correspondientes (que las archivarán como pendientes de hacer). Además de las órdenes de reparación se añaden órdenes de observación (entre 5 y 10). **_El Tet guardará una copia de las órdenes cursadas._**
* Cada **_20 segundos_**, cada sector resuelve sus órdenes sin atender. Recorre dichas órdenes y hará:
  * **_Si es de Reparación:_** accederá al dron correspondiente de su sector y lo pondrá: al 50%, a operativo (true) o a fallido. En caso de ser fallido ese dron se remplazará por otro dron que se le solicitará al Tet. Si el Tet no tiene más drones se quedará ese dron sin asignar.
  * **_Si es de Observación:_** en la descripción del área observada se pondrá uno de estos tres valores: vegetal, animal o radiación; al azar.
  * **_Una vez cumplida la orden, sea cual sea, se etiquetará como cumplida._** De manera que no se realice dos veces la misma orden en el futuro.
* Finalmente, todas las órdenes tendrán obligatoriamente un método mostrarInfo que muestre información de cada tipo de orden.
* Tenemos que saber, de alguna manera, **_cuantas órdenes se han cursado en total_**. Sean del tipo que sean y vayan asignadas al cuadrante que sea.
* Al final de la simulación se debe mostrar toda la información completa de la Tierra: todos los sectores, órdenes recibidas y estado de sus drones.


# Notas

### Clases
