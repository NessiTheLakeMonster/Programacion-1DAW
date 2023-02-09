class Mina {
    var tipo: String = ""
    var cantera: Int = 0
    var aldeanos = ArrayList<Aldeano>()

    constructor() {
        this.tipo = "ORO"
        this.cantera = 500
    }


    // FUNCIONES -------------------------------------------------------------------
    fun addAldeano() {
        for (i in 0 until aldeanos.size) {
            aldeanos.add(Aldeano()) // Se van añadiendo objetos aldeano
        }
    }

    fun quitarAldeano() {
        for (i in 0 until aldeanos.size) {
            aldeanos.remove(Aldeano())
        }
    }
}