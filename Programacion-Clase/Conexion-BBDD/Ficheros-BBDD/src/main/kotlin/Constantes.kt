class Constantes {
    companion object {
        val url = "jdbc:mysql://localhost/biblioteca"
        val user = "root"
        val password = ""
        val forname = "com.mysql.cj.jdbc.Driver"


        // ! AUTORES
        val autores_sql_select = "SELECT * FROM autores"
        val autores_sql_insert = "INSERT INTO autores (id,nombre,nacionalidad) VALUES (?, ?,?)"
        val id = "id"
        val nombre = "nombre"
        val nacionalidad = "nacionalidad"


        val ficheroAutores = "Autores.txt"

        // ! EDITORIALES
        val id_editoriales = "id"
        val nombre_editoriales = "nombre"
        val fundacion_editoriales = "fundacion"

        val editoriales_sql_select = "SELECT id, nombre FROM editoriales"
        val editoriales_sql_select_fecha = "SELECT * FROM editoriales"
        val editoriales_sql_insert = "INSERT INTO editoriales (id,nombre) VALUES (?,?)"
        val editoriales_sql_insert_fecha = "INSERT INTO editoriales (id,nombre,fundacion) VALUES (?,?,'12/12/2001')"

        const val ficheroEditoriales = "Editoriales.txt"

        // ! LIBROS

    }
}