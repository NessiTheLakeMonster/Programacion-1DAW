import kotlin.random.Random
import java.util.Scanner

val TECLADO = Scanner(System.`in`)

fun main(args: Array<String>) {
    val main_tablero = Tablero()
    val humano = Jugador(1)
    val PC = Jugador(2)

    var columna = 0
    var fila = 0
    var i = 1

    main_tablero.crearTablero2()

    println("LOS CONQUISTADORES DE CATÁN")

    // Para empezar los turnos
    do {
        println("TURNO DE ELECCIÓN $i")

        do {
            println("Turno del humano")

            columna = humano.elegirColumnaHumano()
            fila = humano.elegirFilaHumano()

            main_tablero.colocarCasillaHumano(fila,columna)

        } while (!main_tablero.colocarCasillaHumano(fila, columna))

        do {
            println("Turno del PC")

            columna = PC.elegirColumnaPC()
            fila = PC.elegirFilaPC()

            main_tablero.colocarCasillaPC(fila,columna)

        }while (!main_tablero.colocarCasillaPC(fila,columna))


        i++

    } while (main_tablero.t2.isNotEmpty())


}