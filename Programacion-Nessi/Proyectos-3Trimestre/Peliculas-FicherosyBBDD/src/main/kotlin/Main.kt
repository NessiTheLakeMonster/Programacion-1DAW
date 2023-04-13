import java.io.*
import java.nio.file.Files
import java.nio.file.Paths
import kotlin.io.*

fun main(args: Array<String>) {

    val peliFichero = PeliculaFicheroImpl()
    val listaPeliculas = ArrayList<Pelicula>()
    var continuar = true

    // ! Creación del fichero
    val ruta = Paths.get("Peliculas.txt")
    //Files.createFile(ruta) // Para la primera vez
    //var fs = FileOutputStream("Peliculas.ser") // Para el binario

    do {
        when (imprimirMenuPrincipal()) {
            1 -> {
                try {
                    val newPeli = peliFichero.addPelicula()
                    val ru = "Peliculas.txt"
                    val fw = FileWriter(ru, true)
                    val salida = PrintWriter(fw)
                    salida.println(newPeli)
                    salida.flush()
                    listaPeliculas.add(newPeli)

                    println("Has añadido --> $newPeli")

                } catch (e: Exception) {
                    println(e.message)
                }
            }

            2 -> {

            }

            3 -> {
                val file = FileReader("Peliculas.txt")
                val reader = BufferedReader(file)

                val lines = reader.readLines()

                println("~ FICHERO DE PELÍCULAS ~")
                for (line in lines) {
                    println(line)
                }

                reader.close()
                file.close()
            }

            4 -> {
                println("Adiós")
                break
            }
        }
        continuar = continuar()

    } while (continuar)

}

fun imprimirMenuPrincipal(): Int {
    println("Bienvenido")
    println("1. Añadir una película al fichero")
    println("2. Borrar una película del fichero")
    println("3. Mostrar todas las películas que hay en el fichero")
    println("4. Salir del programa")

    val op = readln().toInt()
    return op
}

fun continuar(): Boolean {
    var c = true
    var num: Int

    do {
        println()
        println("Desea hacer alguna otra operación (1. Si/2. No):")
        num = readln().toInt()
    } while (num < 1 || num > 2)

    if (num == 2) {
        c = false
    }

    return c
}




