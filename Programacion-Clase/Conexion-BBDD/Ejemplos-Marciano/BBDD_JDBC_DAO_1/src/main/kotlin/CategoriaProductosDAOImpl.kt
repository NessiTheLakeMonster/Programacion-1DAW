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

    override fun getCategoriaProducto(codigo: Int): ArrayList<CategoriaProducto> {
        conexion.conectar()
        var ps: PreparedStatement? = null
        val prod = ArrayList<CategoriaProducto>()

        try {
            val query = "SELECT * FROM producto JOIN categoria" + //! esta mal, miralo
                    "ON producto.cod_cat = categoria.cod_grupo" +
                    "WHERE producto.cod_cat = ?"
            ps = conexion.getPreparedStatement(query)
            ps?.setInt(1, codigo)
            val rs = ps?.executeQuery()

            while (rs?.next() == true) {

                val cp = CategoriaProducto(
                    rs.getInt("codidoProd"),
                    rs.getInt("codigoCat"), rs.getString("descripcion"),
                    rs.getString("nombre"), rs.getInt("cantidad"),
                    rs.getInt("precio")
                )
                prod.add(cp)
            }

        } catch (e: SQLException) {
            e.message
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return prod
    }

    override fun getCategoriaProducto(): List<CategoriaProducto> {
        conexion.conectar()
        val catProd = ArrayList<CategoriaProducto>()
        val st = conexion.getStatement()

        try {
            val query = "SELECT * FROM producto JOIN categoria" +
                    "ON producto.cod_cat = categoria.cod_grupo"
            val rs = st?.executeQuery(query)
            while (rs?.next() == true) {
                val cp = CategoriaProducto(
                    rs.getInt("codidoProd"),
                    rs.getInt("codigoCat"), rs.getString("descripcion"),
                    rs.getString("nombre"), rs.getInt("cantidad"),
                    rs.getInt("precio")
                )
                catProd.add(cp)
            }
        } catch (e: SQLException) {
            e.message
        } finally {
            st?.close()
            conexion.desconectar()
        }

        return catProd
    }

}