import java.io.IOException
import java.util.Objects

open class Lugar_Turistico {
    open var nombre: String = ""
    open var entrada: Int = 0
    open var valoracion: Int = 0
    var tipo: Int = 0

    constructor() {
        tipo = (0..2).random()
        entrada = (0..100).random()
        valoracion = (0..10).random()
    }

    /*fun generarTipo(): Int {
        var random = (Math.random() * 3).toInt()

        when (random) {
            0 -> Museo("MUS")
            1 -> Parque("PARQ")
            2 -> Monumento("MON")
        }
        return random
    }*/

    open fun calcularMediaCalidad(): Int {
        var media = 0
        try {
            media = entrada/valoracion
        } catch (ex: IOException) {
                media = 0
        }
        return media
    }
}