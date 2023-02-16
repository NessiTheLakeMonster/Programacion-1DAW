import kotlin.random.Random

class Mina {
    var tipo: String = ""
    var cantera: Int = 0
    var aldeanos = ArrayList<Aldeano>()

    constructor() {
        this.tipo = "ORO"
        this.cantera = 500
    }


    // FUNCIONES -------------------------------------------------------------------
   fun crearAldeano(nombre : ArrayList<String>) {
       for (i in 0 until aldeanos.size) {
           val nomRandom = nombre[Random.nextInt(nombre.size)]
           aldeanos.add(Aldeano(nomRandom))
           nombre.remove(nomRandom)
       }

   }

}