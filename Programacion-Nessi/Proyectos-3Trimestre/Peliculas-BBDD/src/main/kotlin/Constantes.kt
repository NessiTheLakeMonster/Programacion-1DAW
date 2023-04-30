class Constantes {
    companion object {
        val url = "jdbc:mysql://localhost/peliculas"
        val user = "root"
        val password = ""
        val forname = "com.mysql.cj.jdbc.Driver"

        // TABLA DE PELICULA
        val id_pelicula = "id"
        val titulo_pelicula = "titulo"
        val dir_pelicula = "director"
        val dur_pelicula = "duracion"
        val year_pelicula = "year"

        val select_pelicula = "SELECT * FROM pelicula"
        val insert_pelicula = "INSERT INTO pelicula VALUES (?,?,?,?,?)"
        val update_pelicula = "UPDATE pelicula SET titulo=?, director=?, duracion=?, year=? WHERE id=?"
        val delete_pelicula = "DELETE FROM pelicula WHERE id=?"
        val select_max_pelicula = "SELECT MAX(id) FROM pelicula"
    }
}