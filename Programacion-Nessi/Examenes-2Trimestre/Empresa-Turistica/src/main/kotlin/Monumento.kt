import java.io.IOException
import java.util.Date

class Monumento(nombre: String): Lugar_Turistico() {

    override var nombre: String = ""
    override var entrada: Int = Lugar_Turistico().entrada
    override var valoracion: Int = Lugar_Turistico().valoracion
    var arquitecto: String = ""
    var fechaCons: String = ""

    override fun calcularMediaCalidad(): Int {
        var media = 0
        try {
            media = entrada/valoracion
        } catch (ex: IOException) {
            media = 1
        }
        return media
    }

    override fun toString(): String {
        return "Monumento(nombre='$nombre', entrada=$entrada, valoracion=$valoracion, arquitecto='$arquitecto', fechaCons='$fechaCons')"
    }


}