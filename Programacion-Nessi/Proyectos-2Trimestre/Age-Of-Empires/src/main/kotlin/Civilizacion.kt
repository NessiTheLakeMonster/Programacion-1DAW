import kotlin.random.Random

class Civilizacion {
    var rey: String = ""
    var nombre: String = ""
    var almacen = 0
    var poblacion = ArrayList<Aldeano>()

    constructor(rey:String, civ: String) {
        this.rey = rey
        nombre = civ
    }

    // FUNCIONES -------------------------------------------------------------------

    fun devolverAldeano(): Aldeano {

        return poblacion[Random.nextInt(poblacion.size)]
    }

}