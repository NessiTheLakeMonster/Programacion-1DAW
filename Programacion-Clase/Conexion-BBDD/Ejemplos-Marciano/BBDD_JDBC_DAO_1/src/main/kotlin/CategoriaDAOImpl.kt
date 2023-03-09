import java.sql.*

class CategoriaDAOImpl : CategoriaDAO {
    // DAO --> Data access object (objeto de acceso a datos)
    private val conexion = ConexionBD()

    override fun getCategoriaByCodigo(codigo: Int): Categoria? {
        conexion.conectar()
        val query = "SELECT * FROM categorias WHERE cod_grupo = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, codigo)
        val rs = ps?.executeQuery()
        var categoria: Categoria? = null
        if (rs?.next() == true) {
            categoria = Categoria(rs.getInt("cod_grupo"), rs.getString("descripcion"))
        }
        ps?.close()
        conexion.desconectar()
        return categoria
    }

    override fun getAllCategorias(): List<Categoria> {
        conexion.conectar()
        val query = "SELECT * FROM categorias"
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        // ! val categorias = mutableListOf<Categoria>() funciona igual que el ArrayList
        val categorias = ArrayList<Categoria>()
        while (rs?.next() == true) {
            val categoria = Categoria(rs.getInt("cod_grupo"), rs.getString("descripcion"))
            categorias.add(categoria)
        }
        st?.close()
        conexion.desconectar()
        return categorias
    }

    override fun insertCategoria(categoria: Categoria): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = "INSERT INTO categorias (cod_grupo, descripcion) VALUES (?, ?)"
            ps = conexion.getPreparedStatement(query)
            ps?.setInt(1, categoria.codigo)
            ps?.setString(2, categoria.descripcion)
            result = ps?.executeUpdate()
        } catch (e: SQLException) {
            println("Error, " + e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result == 1
    }

    override fun updateCategoria(categoria: Categoria): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = "UPDATE categorias SET descripcion = ? WHERE cod_grupo = ?"
            ps = conexion.getPreparedStatement(query)
            ps?.setString(1, categoria.descripcion)
            ps?.setInt(2, categoria.codigo)
            result = ps?.executeUpdate()
        } catch (e: SQLException) {
            println("Error, " + e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result == 1
    }

    override fun deleteCategoria(codigo: Int): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = "DELETE FROM categorias WHERE cod_grupo = ?"
            ps = conexion.getPreparedStatement(query)
            ps?.setInt(1, codigo)
            result = ps?.executeUpdate()
        } catch (e: SQLException) {
            println("Error, " + e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result == 1
    }

    override fun insertarLista(categoria: Categoria, lisCat: ArrayList<Categoria>): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = "INSERT INTO categorias VALUES (?,?)"

            for (i in 0 until lisCat.size) {
                ps = conexion.getPreparedStatement(query)
                ps?.setInt(i, categoria.codigo)

                result = ps?.executeUpdate()
            }

        } catch (e: SQLException) {
            println("Error, " + e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return  result == 1
    }
}
