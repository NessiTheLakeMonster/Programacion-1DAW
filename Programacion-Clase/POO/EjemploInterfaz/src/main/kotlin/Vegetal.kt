abstract class Vegetal {
    abstract var vivo: Boolean // como es abstracto no se inicializa
    var tamanio: Int = 0 // es un atributo normal por lo que se puede inicializar

    fun estaVivo(valor: Int): Boolean {
        return true
    }

    abstract fun estaVivo(valor: Int, tipo: String)
}