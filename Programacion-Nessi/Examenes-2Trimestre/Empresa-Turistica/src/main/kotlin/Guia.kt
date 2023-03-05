class Guia {
    var nombre: String = ""
    var guia = ArrayList<Ruta_Turistica>()
    var cantRutas: Int = 0

    constructor(n: String) {
        this.nombre = n
        cantRutas = (1..3).random()
    }

    fun crearGuia() {
        for (i in 1 until cantRutas) {
            var r = Ruta_Turistica()
            guia.add(r)
        }
    }

    override fun toString(): String {
        return "Guia("
    }


}