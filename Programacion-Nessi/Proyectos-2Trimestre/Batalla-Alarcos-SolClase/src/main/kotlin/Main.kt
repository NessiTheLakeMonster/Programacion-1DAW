// * PROYECTO DE LA BATALLA DE ALARCOS

fun main(args: Array<String>) {
    var cristiano = Ejercito("Alfonso")
    var arabe = Ejercito("Yusuf")
    var cementerio = Ataud()

    cristiano.crearBatallon(10, "Cristiano")
    arabe.crearBatallon(10, "Arabe")

    while (cristiano.quedanVivos() && arabe.quedanVivos()) {
        var soldadoCristiano = cristiano.soldadoParaPelear()
        var soldadoArabe = arabe.soldadoParaPelear()
        println("_________Guerreros Combaten_________")
        println(soldadoCristiano)
        println(soldadoArabe)

        when (soldadoCristiano.peleaSoldado(soldadoArabe)) {
            0 -> {
                println("Empate en la pelea. Mueren todos.")
                arabe.morirSoldado(soldadoArabe)
                cristiano.morirSoldado(soldadoCristiano)
                cementerio.soldadoMuerto(soldadoArabe)
                cementerio.soldadoMuerto(soldadoCristiano)

            }

            1 -> {
                println("          COMPEÓN BATALLA:" + soldadoCristiano)
                arabe.morirSoldado(soldadoArabe)
                cementerio.soldadoMuerto(soldadoArabe)

            }

            2 -> {
                println("          COMPEÓN BATALLA:" + soldadoArabe)
                cristiano.morirSoldado(soldadoCristiano)
                cementerio.soldadoMuerto(soldadoCristiano)

            }
        }
        println("${cristiano.jefe}. Me quedan ${cristiano.cantidadSoldados()}")
        println("${arabe.jefe}. Me quedan ${arabe.cantidadSoldados()}")

    }
    cementerio.listarMuertos()
}