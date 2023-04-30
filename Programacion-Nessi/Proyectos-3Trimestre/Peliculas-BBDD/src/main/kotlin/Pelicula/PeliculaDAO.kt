package Pelicula

interface PeliculaDAO {
    fun todasLasPeliculas(): List<Pelicula>
    fun insertarPelicula(pelicula: Pelicula) : Boolean
    fun updatePelicula(pelicula: Pelicula): Boolean
    fun deletePelicula(id_pelicula: Int): Boolean
    fun lastIDPelicula(): Int
}