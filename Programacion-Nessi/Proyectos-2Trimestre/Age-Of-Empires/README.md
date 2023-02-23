# Age-of-empires

## Enunciado  <br>
Trabajamos en una empresa de programación de juegos. Nos encargan programar una nueva versión del Age of Empires. Más concretamente el funcionamiento de una mina de recursos. <br>
Nuestro juego consta de unos aldeanos que pertenecen a una civilización (Españoles, Ingleses, Bizantinos, etc...) y están gobernados por un rey (Alejandro, Isabel, Constantino, etc...); además cada aldeano consta de un indicador de salud. <br>
La mina es explotada por los aldeanos y pueden ser de ORO o de PIEDRA. No existe límite en el número de aldeanos que pueden trabajar en la mina. Tampoco tienen que ser todos de la misma civilización. <br>
Las minas por defecto son de "ORO" y tienen una cantera de 500 ítems. Debemos definir también un constructor que parametrice todo, es decir que desde la construcción se pueda cambiar el tipo de mina y los ítems que tiene. <br>
Vamos a tener para nuestro juego, dos tipos de aldeanos: Españoles, gobernados por Isabel I y con una salud inicial de 200; y Bizantinos, gobernados por Constantino II y con una salud inicial de 250. <br>
El sistema se simula durante 1 minuto, de forma que:
<ul>
  <li>Cada segundo todos los aldeanos extraen un ítem de la mina y lo suman al almacén de su civilización.</li>
  <li>Cada 2 segundos se añade a la mina un español (al 40%) o un bizantino (al 20%); el resto de las veces no se añade a nadie.</li>
  <li>Cada 5 segundos sufrimos el ataque de un cura bizantino. Estos curas tienen la capacidad de convertir a otros aldeanos a su bando. En dicho ataque sólo se convierte a un aldeano. Este aldeano convertido cambiará de bando y trabajará para los bizantinos desde ese momento.</li>
 </ul> <br>
Crea los métodos que creas conveniente para simular todo esto y guardar toda esta información. Así como los constructores más útiles.


# Notas de clase
## Clases y sus atributos

<b>Aldeano -></b> Civilizacion (habra que meter la clase a la que pertenece), rey e indicador de salud <br>
<b>Mina -></b> Tipo (oro o priedra, por defecto será oro, habrá que tener un método por si se quiere cambiar a piedra), aldeanos (arrayList de objetos aldeano), cantera (inicializada a 500) <u>[Todas estas cosas se pueden inicializar también en el contructor, SE DEBE HACER ASÍ SEGÚN EL ENUNCIADO]</u> <br>
En esta clase será donde se guarden todas las funciones que añadan y hagan operaciones con los objetos aldeano <br>
<b>Civilización -></b>Nombre y almacén (como alternativa se puede quitar el atributo civilización de aldeanos y crear aqui un arrayList de aldeanos para cada una de las civilizaciones) <br>

El cura bizantino será una función aparte, no hace falta hacer una clase para ello. No es un objeto. <br>

Parece ser que a la hora de la somulación solo se trabaja con una sola mina <br>
