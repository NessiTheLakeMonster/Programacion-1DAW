class Constantes {
    companion object {
        // Conexión con la base de datos
        val url = "jdbc:mysql://localhost/examen2"
        val user = "root"
        val password = ""
        val forname = "com.mysql.cj.jdbc.Driver"

        // Usadas en FactoriaTarea
        val Fuerza = 12 // por ejemplo

        // Tabla de Guerreras
        val id_guerreras = "id"
        val esperanzaVida = "esperanzadevida"
        val nombre = "nombre"
        val edad = "edad"
        val indiceIntenligencia = "indice_inteligencia"
        val fuerza = "fuerza"

        val select_guerreras = "SELECT * FROM guerreras WHERE id BETWEEN ? AND ?"
        val select_guerreras2 = "SELECT * FROM guerreras WHERE id = ?"
    }
}