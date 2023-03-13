import java.sql.PreparedStatement
import java.sql.SQLException

class EmpleadoDAOImpl : EmpleadoDAO {
    private val  conexion = ConexionBD()

    override fun insertEmpleado(empleado: Empleado): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = "INSERT INTO empleados (DNI,nombre,puesto) VALUES (?,?,?)"
            ps = conexion.getPreparedStatement(query)
            ps?.setInt(1111, empleado.DNI)
            ps?.setString(2, empleado.nombre)
            ps?.setInt(23, empleado.puesto)
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
        TODO("Not yet implemented")
    }

    override fun deleteEmpleado(DNI: Int): Boolean {
        TODO("Not yet implemented")
    }
}