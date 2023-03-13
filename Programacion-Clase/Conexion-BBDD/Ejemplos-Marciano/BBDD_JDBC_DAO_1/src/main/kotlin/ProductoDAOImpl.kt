import java.sql.PreparedStatement
import java.sql.SQLException

class ProductoDAOImpl : ProductoDAO {
    private val conexion = ConexionBD()

    override fun insertProducto(producto: Producto): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = "INSERT INTO empleados (cod_prod,cod_cat,nombre,cant,precio) VALUES (?,?,?,?,?)"
            ps = conexion.getPreparedStatement(query)
            ps?.setInt(1, producto.cod_prod)
            ps?.setInt(2, producto.cod_cat)
            ps?.setString(3, producto.nombre)
            ps?.setInt(4, producto.cant)
            ps?.setInt(5, producto.precio)
            result = ps?.executeUpdate()
        } catch (e: SQLException) {
            println("Error, " + e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result == 1
    }

    override fun updateProducto(producto: Producto): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = "UPDATE empleados SET cod_cat = ?, nombre = ?, cant = ?, precio = ? WHERE cod_prod = ?"
            ps = conexion.getPreparedStatement(query)
            ps?.setInt(1, producto.cod_cat)
            ps?.setString(2, producto.nombre)
            ps?.setInt(3, producto.cant)
            ps?.setInt(4, producto.precio)
            ps?.setInt(5, producto.cod_prod)
            result = ps?.executeUpdate()
        } catch (e: SQLException) {
            println("Error, " + e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result == 1
    }

    override fun deleteProducto(cod_prod: Int): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = "DELETE FROM productos WHERE cod_prod = ?"
            ps = conexion.getPreparedStatement(query)
            ps?.setInt(1, cod_prod)
            result = ps?.executeUpdate()
        } catch (e: SQLException) {
            println("Error, " + e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result == 1
    }
}