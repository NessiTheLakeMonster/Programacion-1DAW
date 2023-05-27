package BBDD

interface VideojuegoDAO {
    fun insertarVideojuego(v: Videojuego): Int
    fun seleccionarVideojuego(): List<Videojuego>
    fun borrarVideojuego(id: Int): Boolean
}