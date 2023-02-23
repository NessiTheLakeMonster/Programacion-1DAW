import kotlin.random.Random

class Mina {
    var tipo: String = ""
    var cantera: Int = 0
    var trabajadores = ArrayList<Aldeano>()

    constructor() {
        this.tipo = "Oro"
        this.cantera = 500
    }

    constructor(tipo: String, cantidad: Int) {
        this.tipo = tipo
        this.cantera = cantidad
    }

    // FUNCIONES -------------------------------------------------------------------

}