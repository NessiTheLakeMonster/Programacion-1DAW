class MujerSanadora : Mujer {

    constructor(espV: Int, n: String, e: Int, iInt: Int) : super(n, espV, e, iInt) {
        this.esperanzaVida = espV
        this.nombre = n
        this.edad = e
        this.indiceIntl = iInt
    }

    fun subirEsperanzaVida(serVivo: SerVivo) {
        println("Se va a subir la esperanza de vida ")
        serVivo.esperanzaVida += 2
    }
}