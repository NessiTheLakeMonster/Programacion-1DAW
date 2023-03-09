import java.sql.*

class CategoriaProductosDAOImpl : CategoriaProductoDAO {
    private val conexion = ConexionBD()

    override fun deleteCascadeCP(c: Categoria): Boolean {
        var ps: PreparedStatement? = null
        var result: Int? = null

        try {
            conexion.conectar()
            val query = "DELETE * FROM productos WHERE cod_cat = ?"
            ps = conexion.getPreparedStatement(query)
            ps?.setString(1, c.descripcion)
            result = ps?.executeUpdate()

        } catch (e: SQLException) {
            println(e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }
        return result == 1
    }

    override fun deleteCascadeCP(cod: Int): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = "DELETE * FROM productos WHERE cod_cat = ?"

        } catch (e: SQLException) {
            println(e.message)
        }

        return result == 1

    }

    override fun juntarTablas(): Boolean {
        TODO("Not yet implemented")
    }

}