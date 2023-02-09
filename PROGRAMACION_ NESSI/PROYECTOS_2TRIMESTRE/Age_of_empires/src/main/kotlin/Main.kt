fun main(args: Array<String>) {

    val nomAldeanosEsp = arrayListOf("Juan", "Angel")
    val nomAldeanosBiz = arrayListOf("Pepe", "Ana")

    var default_mina = Mina() // Creamos una mina por defecto

    /*var default_aldeano_esp = Aldeano("Isabel", "Español")
    var default_aldeano_biz = Aldeano("Constantino", "Bizantino")*/

    val probabilidad: Int = (0..100).random()


    if (probabilidad < 40) {
        default_mina.crearAldeano(nomAldeanosBiz)
    } else {
        default_mina.crearAldeano(nomAldeanosEsp) // Se crea un aldeano con nombre random
    }

}

fun curaBizantino(): Boolean {

    return false
}