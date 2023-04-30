class Animal : SerVivo {
    var libre = true // Esta libre si es true si es false no lo estara
    var fuerza = 0

    constructor()

    override fun toString(): String {
        return "Animal(libre=$libre, fuerza=$fuerza)"
    }
}