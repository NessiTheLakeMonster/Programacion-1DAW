package alquiler


import com.example.git_interfaz.Constantes
import Servicio.ConexionBD
import java.sql.PreparedStatement
import java.sql.SQLException

class AlquilerDAOImpl : AlquilerDAO {
    private val conexion = ConexionBD(Constantes.url, Constantes.user, Constantes.password)

    override fun todosLosAlquileres(): List<Alquiler> {
        conexion.conectar()

        val query = Constantes.alquiler_sql_select
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val alquileres = ArrayList<Alquiler>()
        while (rs?.next() == true) {
            val alquiler = Alquiler(
                rs.getInt(Constantes.nombre_id_alquiler),
                rs.getInt(Constantes.nombre_id_videojuego),
                rs.getInt(Constantes.nombre_id_socio),
                rs.getString(Constantes.nombre_fecha_inicio),
                rs.getString(Constantes.nombre_fecha_fin),
                rs.getInt(Constantes.nombre_precio)
            )
            alquileres.add(alquiler)
        }
        st?.close()
        conexion.desconectar()
        return alquileres
    }

    override fun insertarLista(c: ArrayList<Alquiler>): ArrayList<Alquiler> {
        conexion.conectar()
        var result: Int? = null
        var ps: PreparedStatement? = null
        var listaNoInsertados = ArrayList<Alquiler>()

        val query = Constantes.alquiler_sql_insert
        ps = conexion.getPreparedStatement(query)
        for (i in c) {
            try {
                ps?.setInt(1, i.id_alquiler)
                ps?.setInt(2, i.id_videojuego)
                ps?.setInt(3, i.id_socio)
                ps?.setString(4, i.fecha_inicio)
                ps?.setString(5, i.fecha_fin)
                ps?.setInt(6, i.precio)
                result = ps?.executeUpdate()
            } catch (e: Exception) {
                //println("no Se puede insertar ${i.codigo}")
                listaNoInsertados.add(i)
            }
        }
        ps?.close()
        conexion.desconectar()
        return listaNoInsertados
    }

    override fun updateAlquiler(alquiler: Alquiler): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = Constantes.update_alquiler
            ps = conexion.getPreparedStatement(query)
            ps?.setString(1, alquiler.fecha_inicio)
            ps?.setString(2, alquiler.fecha_fin)
            ps?.setInt(3, alquiler.precio)
            result = ps?.executeUpdate()
        } catch (e: SQLException) {
            println("Error, " + e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result == 1
    }

    override fun deleteAlquiler(id_alquiler: Int): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = Constantes.delete_alquiler
            ps = conexion.getPreparedStatement(query)
            ps?.setInt(1, id_alquiler)
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