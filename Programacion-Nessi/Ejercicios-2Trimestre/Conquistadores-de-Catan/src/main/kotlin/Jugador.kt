class Jugador {
    var idJugador: Int = 0 // 0 no esta ocupada, 1 para humano y 2 para PC
    var almacen_trigo: Int = 0
    var almacen_madera: Int = 0
    var almacen_carbon: Int = 0

    constructor(jh: Int) {
        this.idJugador = jh
    }

    fun elegirColumnaHumano(): Int {
        var x = 0
        do {
            println("Dime la columna")
            x = TECLADO.nextInt() + 1
        } while (x < 0 && x > 4)
        println("Has elegido la columna $x")

        return x
    }

    fun elegirFilaHumano(): Int {
        var x = 0
        do {
            println("Dime la columna")
            x = TECLADO.nextInt() + 1
        } while (x < 0 && x > 3)
        println("Has elegido la fila $x")

        return x
    }

    fun elegirFilaPC(): Int {
        val x = (0..2).random()
        println("La fila elegida por el PC es $x")

        return x
    }

    fun elegirColumnaPC(): Int {
        val x = (0..3).random()
        println("La columna elegida por el PC es $x")

        return x
    }
}