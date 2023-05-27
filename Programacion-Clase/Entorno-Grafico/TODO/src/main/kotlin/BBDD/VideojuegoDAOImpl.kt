package BBDD

import java.sql.PreparedStatement

class VideojuegoDAOImpl : VideojuegoDAO {
    private val conexion = ConexionBD()

    override fun insertarVideojuego(v: Videojuego): Int {
        conexion.conectar()
        var result: Int? = null
        var ps: PreparedStatement? = null
        var correcto: Int = 1

        val query = "INSERT INTO videojuego (id_videojuego, titulo, saga, distribuidora, fecha_lanzamiento, genero) " +
                "VALUES (?,?,?,?,?,?);"
        ps = conexion.getPreparedStatement(query)

        try {
            ps?.setInt(1, v.id)
            ps?.setString(2, v.titulo)
            ps?.setString(3, v.saga)
            ps?.setString(4, v.distribuidora)
            val utilDate = v.lanzamiento
            val sqlDate = java.sql.Date.valueOf(utilDate)
            ps?.setDate(5, sqlDate)
            ps?.setString(6, v.genero)

            result = ps?.executeUpdate()
        } catch (ex: Exception) {
            println("no se ha podido insertar ${v.titulo}")
            correcto = 0
        }

        ps?.close()
        conexion.desconectar()
        return correcto
    }

    override fun seleccionarVideojuego(): List<Videojuego> {
        conexion.conectar()
        /*val query = "SELECT id_videojuego, titulo, saga, distribuidora, DATE_FORMAT(fecha_lanzamiento, '%d/%m/%Y') " +
                ", genero FROM videojuego"*/

        val query = "SELECT id_videojuego, titulo, saga, distribuidora, fecha_lanzamiento, " +
                "genero FROM videojuego"

        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val lista = ArrayList<Videojuego>()

        while (rs?.next() == true) {
            val vid = Videojuego(
                rs.getInt("id_videojuego"),
                rs.getString("titulo"),
                rs.getString("saga"),
                rs.getString("distribuidora"),
                (rs.getDate("fecha_lanzamiento")).toLocalDate(),
                rs.getString("genero")
            )
            lista.add(vid)
        }

        st?.close()
        conexion.desconectar()
        return lista
    }

    override fun borrarVideojuego(id: Int): Boolean {
        conexion.desconectar()

        val query = "DELETE FROM videojuego WHERE id_videojuego = ?"
        val ps = conexion.getPreparedStatement(query)

        ps?.setInt(1, id)
        val result = ps?.executeUpdate()

        ps?.close()
        conexion.desconectar()
        return result == 1
    }
}