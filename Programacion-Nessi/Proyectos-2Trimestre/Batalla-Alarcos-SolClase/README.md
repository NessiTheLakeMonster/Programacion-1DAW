# Enunciado del Proyecto de la Batalla de Alarcos

Con programación orientada a objetos:

* Dos ejércitos
  * **_Cristiano_** --> 1 jefe (Alfonso X), 10 soldados (nombre, fuerza)
  * **_Musulmán_** --> 1 jefe (Yusuf), 10 soldados (nombre, fuerza)
* Fuerza: 1 - 100 

* Representar la Batalla de Alarcos 
* Acaba el programa principal cuando uno de los dos ejércitos se quede sin soldados. 
* **_Batalla_**: se elige un guerrero aleatorio de cada ejército:
  * Opción sencilla: gana el que tenga mayor fuerza y el otro muere.
  * Opción complicada: se añade el atributo vida (1-100), cuando luchan se resta vida igual al valor de la fuerza del otro. Si la vida se agota, muere el soldadado.
* Después de pelear, Yusuf y Alfonso X conversan:
  * A mí me quedan X soldados vivos.
  * A mí me quedan Y soldados vivos.
  * Pueden (o no) decidir rendirse.
* Cuando termine el programa:
  * Dirá quien es el ganador.
  * Listará todos los guerreros como han ido peleando y muriendo.


# Clases & Notas

* CLASES
  * **_Class Soldado()_**
    * nombre
    * fuerza
  * **_Class Ejercito()_**
    * jefe
    * batallon -> ArrayList de objetos Soldado