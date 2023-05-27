package videojuego

interface VideojuegoDAO {
    fun todosLosVideojuegos(): List<Videojuego>
    fun insertListaVideojuegos(lista: ArrayList<Videojuego>): ArrayList<Videojuego>
    fun updateVideojuego(videojuego: Videojuego): Boolean
    fun deleteVideojuego(cod_videojuego: Int): Boolean
}