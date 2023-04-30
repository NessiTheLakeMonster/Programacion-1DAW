package Ejercicio3

class Dado {
    var noCaras = 0
    var tirada = 0
    var n = 0
    var tiradas = Array<Int>(n) { 0 }
    var historial = ArrayList<Dado>()

    constructor(noC : Int) {
        this.noCaras = noC
    }

    fun tirarDado(): Int {
        val i = (1..noCaras).random()
        return i
    }

    fun historialTiradas() {

    }

    fun rondaTiradas(n: Int) {
        for (i in 0 until tiradas.size) {
            tiradas[i] = tirarDado()
        }
    }
}

