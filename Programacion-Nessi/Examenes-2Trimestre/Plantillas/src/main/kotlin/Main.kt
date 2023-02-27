fun main(args: Array<String>) {
    val circulo = Circulo(5.0)

    println("Area del circulo con radio ${circulo.radio}: ${circulo.area()}")
    println("Perimetro del circulo con radio ${circulo.radio}: ${circulo.perimetro()}")
}