class Gatos: serVivo, Animal {
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
}