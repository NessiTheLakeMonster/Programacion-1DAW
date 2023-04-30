// Inés María Barrera Llerena

import Ejercicio3.*
import MujerGuerrera.MujerGuerreraDAOImpl
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException
import java.io.ObjectOutputStream
import java.nio.file.Paths

fun main(args: Array<String>) {
    val tablero = Tablero()

    println("~BIENVENIDO AL JUEGO~")
    println("Cuantas caras quieres que tengan dados")
    val caras = 2

    var dado1 = Dado(caras)
    var dado2 = Dado(caras)
    var x = dado1.tirarDado()
    var y = dado2.tirarDado()
    println("Números $x e $y")

    var retoseq1 = ArrayList<Tarea>()
    var eq1 = tablero.equipo1
    var eq2 = tablero.equipo2
    var tareasCompletadas = 0

    println("Equipo 1")
    eq1 = tablero.crearMujeresGuerrerasEq1(1, caras)
    println("Tareas para el equipo 1")
    for (i in 0 until caras) {
        retoseq1 = tablero.asignarTareasGuerreras()
    }

    for (i in retoseq1) {
        for (j in eq1) {
            if (i.edadMinima <= j.edad && i.gradoResolucion <= j.indiceIntl
                && i.cantidadFuerza <= j.fuerza
            ) {
                println("La mujer ${j.toString()} puede realizar la tarea ${i.toString()}")
                tareasCompletadas ++
            } else {
                println("La mujer ${j.toString()} no puede realizar la tarea ${i.toString()}")
            }
        }
    }

    println("El equipo 1 ha completado $tareasCompletadas tareas")


    println("Equipo 2")
    eq2 = tablero.crearMujeresGuerrerasEq2(caras + 1, caras + 2)
    println("Tareas para el equipo 2")
    for (i in 0 until caras) {
        retoseq1 = tablero.asignarTareasGuerreras()
    }


    /** FICHERO SERIALIZABLE
    var os: ObjectOutputStream? = null

    try {
    val fs = FileOutputStream("Guerreras.ser")
    os = ObjectOutputStream(fs)
    for (i in tablero.equipo1) {
    os.writeObject(i)
    }
    for (i in tablero.equipo2) {
    os.writeObject(i)
    }
    } catch (e: FileNotFoundException) {
    e.printStackTrace();
    } catch (e: IOException) {
    e.printStackTrace();
    } finally {
    os?.close();
    }
     **/
}