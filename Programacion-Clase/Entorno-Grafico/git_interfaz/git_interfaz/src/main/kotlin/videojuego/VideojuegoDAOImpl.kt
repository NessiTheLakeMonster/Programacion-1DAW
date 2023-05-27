package videojuego

import Servicio.ConexionBD
import com.example.git_interfaz.Constantes
import java.sql.PreparedStatement
import java.sql.SQLException

open class VideojuegoDAOImpl : VideojuegoDAO {
    private val conexion = ConexionBD(Constantes.url, Constantes.user, Constantes.password)

    override fun todosLosVideojuegos(): List<Videojuego> {
        conexion.conectar()
        val query = Constantes.select_videojuegos
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val videojuegos = ArrayList<Videojuego>()
        while (rs?.next() == true) {
            val v = Videojuego(
                rs.getInt(Constantes.id_videojuego), rs.getString(Constantes.titulo_videojuego),
                rs.getString(Constantes.saga), rs.getString(Constantes.distribuidora),
                rs.getString(Constantes.fecha_lanz), rs.getString(Constantes.genero)
            )
            videojuegos.add(v)
        }
        st?.close()
        conexion.desconectar()
        return videojuegos
    }

    override fun insertListaVideojuegos(lista: ArrayList<Videojuego>): ArrayList<Videojuego> {
        conexion.conectar()
        var ps: PreparedStatement? = null
        val listaNoInsertadosVid = ArrayList<Videojuego>()

        val query = Constantes.insert_videojuegos
        ps = conexion.getPreparedStatement(query)

        for (i in lista) {
            try {
                ps?.setInt(1, i.id)
                ps?.setString(2, i.titulo)
                ps?.setString(3, i.saga)
                ps?.setString(4, i.distribuidora)
                ps?.setString(5, i.fecha_lanzamiento)
                ps?.setString(6, i.genero)
            } catch (e: Exception) {
                listaNoInsertadosVid.add(i)
            }
        }

        ps?.close()
        conexion.desconectar()
        return listaNoInsertadosVid
    }

    override fun updateVideojuego(videojuego: Videojuego): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = Constantes.update_videojuegos
            ps = conexion.getPreparedStatement(query)
            ps?.setString(1, videojuego.titulo)
            ps?.setString(2, videojuego.saga)
            ps?.setString(3, videojuego.distribuidora)
            ps?.setString(4, videojuego.fecha_lanzamiento)
            ps?.setString(5, videojuego.genero)
            ps?.setInt(6, videojuego.id)
            result = ps?.executeUpdate()
        } catch (e: SQLException) {
            println("Error, " + e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result == 1
    }

    override fun deleteVideojuego(cod_videojuego: Int): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = Constantes.delete_videojuegos
            ps = conexion.getPreparedStatement(query)
            ps?.setInt(1, cod_videojuego)
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