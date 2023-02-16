class Gato: serVivo, Animal {
    var nombre: String = "sin nombre"

    override fun crecer() {
        TODO("Not yet implemented")
    }

    override fun nacer() {
        TODO("Not yet implemented")
    }

    override fun morir() {
        TODO("Not yet implemented")
    }

    override var vivo: Boolean = false // Aquí si se inicializa

    override fun estaVivo(valor: Int): Boolean {
        return vivo
    }

    override fun toString(): String {
        return nombre
    }
}