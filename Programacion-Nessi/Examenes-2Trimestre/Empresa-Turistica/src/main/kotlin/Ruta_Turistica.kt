class Ruta_Turistica {
    var nombre: String = ""
    var lugares = ArrayList<Lugar_Turistico>()
    var cantLugares: Int = 0

    constructor() {
        cantLugares = (0..5).random()
    }

    fun crearRuta() {
        var n = 1
        nombre = "RUTA" + n

        for (i in 1..cantLugares) {
            var l = Lugar_Turistico().tipo
            if (Lugar_Turistico().tipo == 0) {
                addMuseo(Museo("MUS" + i))
            }
            if (Lugar_Turistico().tipo == 1) {
                addParque(Parque("PARQ" + i))
            }
            if (Lugar_Turistico().tipo == 2) {
                addMonumento(Monumento("MON" + i))
            }
        }
    }

    private fun addMuseo(m : Museo) {
        lugares.add(m)
    }

    private fun addParque(p: Parque) {
        lugares.add(p)
    }

    private fun addMonumento(m: Monumento) {
        lugares.add(m)
    }

    override fun toString(): String {
        return "Ruta_Turistica(nombre='$nombre', cantLugares=$cantLugares, lugares=$lugares)"
    }

}