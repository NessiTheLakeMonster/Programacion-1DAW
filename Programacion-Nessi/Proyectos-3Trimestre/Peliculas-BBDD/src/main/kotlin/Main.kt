fun main(args: Array<String>) {
    val fn = Funcionalidades()
    var continuar = true

    do {
        when (imprimirMenuPrincipal()) {
            1 -> {
                fn.addPelicula()
            }

            2 -> {
                fn.removePelicula()
            }

            3-> {
                fn.modifyPelicula()
            }

            4 -> {

            }

            5 -> {
                break
            }
        }
        continuar = continuar()
    } while (continuar)

}

fun imprimirMenuPrincipal(): Int {
    println("Bienvenido")
    println("1. Añadir una película")
    println("2. Borrar una película")
    println("3. Modificar una película")
    println("4. Mostrar todas las películas que hay en el fichero")
    println("5. Salir del programa")

    val op = readln().toInt()
    return op
}

fun continuar(): Boolean {
    var c = true
    var num: Int

    do {
        println()
        println("Desea hacer alguna otra operación (1. Si/2. No):")
        num = readln().toInt()
    } while (num < 1 || num > 2)

    if (num == 2) {
        c = false
    }

    return c
}