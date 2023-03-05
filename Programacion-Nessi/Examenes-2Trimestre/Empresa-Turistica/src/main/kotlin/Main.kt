// INÉS MARÍA BARRERA LLERENA

fun main(args: Array<String>) {

    val guia1 = Guia("GUIA_1")
    val guia2 = Guia("GUIA_2")
    val ruta = Ruta_Turistica()

    val mus = Museo("MUS")
    val parq = Parque("PARQ")
    val mon = Monumento("MON")

    println("BIENVENIDOS A NUESTRA EMPRESA TURISTICA")

    do {
        println("RUTAS DEL PRIMER GUÍA")

        var gui = guia1.crearGuia()
        var rut = ruta.crearRuta()

        rut.toString()

    } while (ruta.lugares.isNotEmpty() && guia1.guia.isNotEmpty())

    do {


    } while (ruta.lugares.isNotEmpty() && guia2.guia.isNotEmpty())
}