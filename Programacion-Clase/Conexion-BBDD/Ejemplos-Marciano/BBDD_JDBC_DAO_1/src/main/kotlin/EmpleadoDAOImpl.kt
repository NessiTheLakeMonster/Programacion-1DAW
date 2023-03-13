import java.sql.PreparedStatement
import java.sql.SQLException

class EmpleadoDAOImpl : EmpleadoDAO {
    private val conexion = ConexionBD()

    override fun insertEmpleado(empleado: Empleado): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = "INSERT INTO empleados (DNI,nombre,puesto) VALUES (?,?,?)"
            ps = conexion.getPreparedStatement(query)
            ps?.setInt(1, empleado.DNI)
            ps?.setString(2, empleado.nombre)
            ps?.setInt(3, empleado.puesto)
            result = ps?.executeUpdate()
        } catch (e: SQLException) {
            println("Error, " + e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result == 1
    }

    override fun updateEmpleado(empleado: Empleado): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = "UPDATE empleados SET nombre = ?, puesto = ? WHERE DNI = ?"
            ps = conexion.getPreparedStatement(query)
            ps?.setString(1, empleado.nombre)
            ps?.setInt(2, empleado.puesto)
            ps?.setInt(3, empleado.DNI)
            result = ps?.executeUpdate()
        } catch (e: SQLException) {
            println("Error, " + e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result == 1
    }

    override fun deleteEmpleado(DNI: Int): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = "DELETE FROM empleados WHERE DNI = ?"
            ps = conexion.getPreparedStatement(query)
            ps?.setInt(1, DNI)
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