// Ejercicio ejemplo de interfaces
fun main(args: Array<String>) {
    val gatera = ArrayList<Gato>()
    val g1 = Gato()
    g1.nombre = "Garfield"

    gatera.add(g1)

    println("soy g1 " + g1.toString())
    println("soy gatera[0] " + gatera[0].toString())

    var colonia1 = ColoniaDeGatos(g1)

}