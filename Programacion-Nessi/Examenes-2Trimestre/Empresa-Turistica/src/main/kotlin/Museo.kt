class Museo(nombre: String): Lugar_Turistico() {

    override var nombre: String = ""
    override var entrada: Int = Lugar_Turistico().entrada
    override var valoracion: Int = Lugar_Turistico().valoracion
    var tematica: String = ""
    var no_salas: Int = (1..10).random()

    fun generarTematica() {

    }

    override fun toString(): String {
        return "Museo(nombre='$nombre', entrada=$entrada, valoracion=$valoracion, tematica='$tematica', no_salas=$no_salas)"
    }


}