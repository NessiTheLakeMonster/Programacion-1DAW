class Circulo(val radio: Double) : Forma {
    override fun area(): Double {
        return Math.PI * radio * radio
    }

    override fun perimetro(): Double {
        return 2 * Math.PI * radio
    }
}