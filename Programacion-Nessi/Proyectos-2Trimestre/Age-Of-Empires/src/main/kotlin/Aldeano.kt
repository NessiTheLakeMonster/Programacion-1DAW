import kotlin.random.Random

class Aldeano {
    var nombre: String = ""
    var salud: Int = 0

    constructor(listaNombres : ArrayList<String>, salud:Int) { // Se crea un aldeano con nombre random
        this.nombre = listaNombres[Random.nextInt(listaNombres.size)]
        this.salud = salud
    }

}