package BBDD

import java.sql.PreparedStatement
import java.sql.Statement

class CategoriaProductoDAOImpl : CategoriaProductoDAO {
    private val conexion = ConexionBD()

    override fun seleccionarCategoriaProducto(): List<CategoriaProducto> {
        var st: Statement? = null
        val lista = ArrayList<CategoriaProducto>()

        try {
            conexion.conectar()

            val query = "SELECT descripcion, nombre, cant, precio FROM categorias" +
                    "JOIN productos ON cod_grupo = cod_cat"

            st = conexion.getStatement()
            val rs = st?.executeQuery(query)

            while (rs?.next() == true) {
                val catprod = CategoriaProducto(
                    rs.getString("descripcion"),
                    rs.getString("nombre"),
                    rs.getInt("cant"),
                    rs.getInt("precio")
                )

                lista.add(catprod)
            }

        } catch (ex: Exception) {
            // Lo optimo seria abrir fichero de error y guardar error

            println(ex.message)
        } finally {
            st?.close()
            conexion.desconectar()
        }

        return lista
    }
}