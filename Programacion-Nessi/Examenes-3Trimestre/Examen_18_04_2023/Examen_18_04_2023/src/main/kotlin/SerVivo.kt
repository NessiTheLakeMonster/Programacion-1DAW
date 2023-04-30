open class SerVivo {
    var esperanzaVida = 0
    var nombre = ""
    var estado = 0 // Muy vivo es 1, al borde de la muerte 2 y muerto 3

    companion object {
        const val maxEsperanzaVida = 120
    }

    fun vivoOmuerto() {
        if ((maxEsperanzaVida - esperanzaVida) > 20) {
            println("Estoy muy vivo")
            estado = 1
        }
        if ((maxEsperanzaVida - esperanzaVida) < 5) {
            println("Estoy al borde de la muerte")
            estado = 2
        }
        if (esperanzaVida == 0) {
            println("Ser vivo muerto")
            estado = 3
        }
    }

    override fun toString(): String {
        return "SerVivo(esperanzaVida=$esperanzaVida, nombre='$nombre', estado=$estado)"
    }

}