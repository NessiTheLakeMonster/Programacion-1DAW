# Mis peliculas

Vamos a gestionar un listado de películas que guardaremos en un fichero de texto. El programa principal nos permitirá:

1.- Añadir una peli.
2.- Borrar una peli.
3.- Mostrar todas.
4.- Salir del programa.

De las películas guardaremos: título, director, duración y año.

# Metodos de ficheros

## Crear y escribir fichero

```kotlin
 try {
    val ruta = "./Ejemplo/datos.txt"
    val fw = FileWriter(ruta, true)
    fw.write("soy escrito con el método write")
    fw.write("\n")
    val salida = PrintWriter(fw)
    salida.println("Línea 1 a escribir en el fichero")
    salida.println("Línea 2 a escribir en el fichero")
    salida.flush() //asegurarnos que todos los datos se escriben antes de cerrar el flujo de escritura
    salida.close()
} catch (e: Exception) {
    println(e.message)
}
```

## Leer ficheros

```kotlin
val ruta = "./Ejemplo/datos.txt"
val fr = FileReader(ruta)
val br = BufferedReader(fr)

var linea: String? = br.readLine()
while (linea != null) {
    println(linea)
    linea = br.readLine()
}

br.close()

//utilizando el método read
println("Utilizando el método read")
val archivo = File(ruta)

try {
    val fr = FileReader(archivo)
    val br = BufferedReader(fr)

    var linea: String? = br.readLine()

    while (linea != null) {
        println(linea)
        linea = br.readLine()
    }

    br.close()
    fr.close()
} catch (e: Exception) {
    println(e.message)
}
```
