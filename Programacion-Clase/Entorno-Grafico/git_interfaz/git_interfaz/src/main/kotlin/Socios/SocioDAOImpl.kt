package Socios

import com.example.git_interfaz.Constantes
import Servicio.ConexionBD
import java.sql.SQLException

class SocioDAOImpl: SocioDAO {

    private val conexion = ConexionBD(Constantes.url, Constantes.user, Constantes.password)

    override fun todosLosSocios(): List<Socio> {
        conexion.conectar()
        val query = Constantes.socio_sql_select
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val socios = ArrayList<Socio>()
        while (rs?.next() == true) {
            val v = Socios.Socio(
                rs.getInt(Constantes.nombre_id_socio),
                rs.getString(Constantes.nombre_dni),
                rs.getString(Constantes.nombre_nombre_socio),
                rs.getString(Constantes.nombre_apellido1),
                rs.getString(Constantes.nombre_fecha_nac)
            )
            socios.add(v)
        }
        st?.close()
        conexion.desconectar()
        return socios
    }

    fun ultimaId(): Int {
        conexion.conectar()
        val query = Constantes.select_max_socio
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        var lastId = 0
        if (rs?.next() == true) {
            lastId = rs.getInt("max(id_socio)")
        }
        st?.close()
        conexion.desconectar()
        return lastId

    }

    fun selectXSocio(x: String): Socio {
        conexion.conectar()
        val query = Constantes.select_x_socio
        val ps = conexion.getPreparedStatement(query)
        ps?.setString(1, x)
        val rs = ps?.executeQuery()
        var socio: Socio? = null
        if (rs?.next() == true) {
            socio = Socios.Socio(
                rs.getInt(Constantes.nombre_id_socio), rs.getString(Constantes.nombre_dni),
                rs.getString(Constantes.nombre_nombre_socio), rs.getString(Constantes.nombre_apellido1),
                rs.getString(Constantes.nombre_fecha_nac)
            )
        }
        return socio!!
        ps?.close()
        conexion.desconectar()
    }

    override fun insertSocio(socio: Socio): Boolean {
        conexion.conectar()
        val query = Constantes.socio_sql_insert
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, socio.id_socio)
        ps?.setString(2, socio.dni)
        ps?.setString(3, socio.nombre)
        ps?.setString(4, socio.apellido1)
        ps?.setString(5, socio.fecha_nac)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun updateSocio(socio: Socio): Boolean {
        conexion.conectar()
        val query = Constantes.update_socio
        val ps = conexion.getPreparedStatement(query)
        ps?.setString(1, socio.dni)
        ps?.setString(1, socio.nombre)
        ps?.setString(1, socio.apellido1)
        ps?.setString(1, socio.fecha_nac)
        ps?.setInt(1, socio.id_socio)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun deleteSocio(id_socio: Int): Boolean {
        conexion.conectar()
        val query = Constantes.delete_socio
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_socio)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }
    fun comprobarSocio(socio : Socio): Boolean{
        conexion.conectar()
        val query = "select * from socio where id_socio = ? and lower(nombre) like ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1,socio.id_socio)
        ps?.setString(2,socio.nombre)
        val resultSet=ps?.executeQuery()?:throw SQLException("Algo fue mal")
        var usuarioEncontrado=false
        if(resultSet.next()){
            usuarioEncontrado=true
        }
        return usuarioEncontrado
    }
}