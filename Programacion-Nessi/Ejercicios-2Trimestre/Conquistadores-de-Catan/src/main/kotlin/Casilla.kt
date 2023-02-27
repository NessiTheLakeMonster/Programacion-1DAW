import kotlin.random.Random

class Casilla {
    var recurso: String = ""
    var dado: Int = Random.nextInt(1,6)
    var duenio = Jugador(0)

    constructor() {
        recurso = generarRecurso()
    }

    private fun generarRecurso() : String {
        var recurso = ""
        val random = (Math.random() * 3).toInt()

        when (random) {
            0 -> recurso = "Trigo"
            1 -> recurso = "Madera"
            2 -> recurso = "Carbón"
        }

        return recurso
    }

}