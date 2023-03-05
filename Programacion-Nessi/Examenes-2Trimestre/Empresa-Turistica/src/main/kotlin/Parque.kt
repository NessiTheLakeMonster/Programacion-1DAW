import java.io.IOException

class Parque(nombre: String): Lugar_Turistico() {

    override var nombre: String = ""
    override var entrada: Int = Lugar_Turistico().entrada
    override var valoracion: Int = Lugar_Turistico().valoracion
    var no_atracciones: Int = (0..10).random()
    var no_juegos: Int = (0..10).random()

    fun generarNombre() {

    }

    override fun calcularMediaCalidad(): Int {
        var media = 0
        try {
            media = no_atracciones/entrada
        } catch (ex: IOException) {
            media = 1
        }
        return media
    }

    override fun toString(): String {
        return "Parque(nombre='$nombre', entrada=$entrada, valoracion=$valoracion, no_atracciones=$no_atracciones, no_juegos=$no_juegos)"
    }


}