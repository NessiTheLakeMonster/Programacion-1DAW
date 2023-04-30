package Pelicula

import ConexionBD
import Constantes
import java.sql.PreparedStatement
import java.sql.SQLException

class PeliculaDAOImpl : PeliculaDAO {
    private val conexion = ConexionBD(Constantes.url, Constantes.user, Constantes.password)

    override fun todasLasPeliculas(): List<Pelicula> {
        conexion.conectar()
        val query = Constantes.select_pelicula
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val peliculas = ArrayList<Pelicula>()

        while (rs?.next() == true) {
            val p = Pelicula(
                rs.getInt(Constantes.id_pelicula), rs.getString(Constantes.titulo_pelicula),
                rs.getString(Constantes.dir_pelicula), rs.getInt(Constantes.dur_pelicula),
                rs.getInt(Constantes.year_pelicula)
            )
            peliculas.add(p)
        }
        st?.close()
        conexion.desconectar()
        return peliculas
    }

    override fun insertarPelicula(pelicula: Pelicula): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = Constantes.insert_pelicula
            ps = conexion.getPreparedStatement(query)
            ps?.setInt(1, pelicula.idPelicula)
            ps?.setString(2, pelicula.titulo)
            ps?.setString(3, pelicula.director)
            ps?.setInt(4, pelicula.duracion)
            ps?.setInt(5, pelicula.year)
            result = ps?.executeUpdate()
        } catch (e: SQLException) {
            println("Error, " + e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result == 1
    }

    override fun updatePelicula(pelicula: Pelicula): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = Constantes.update_pelicula
            ps = conexion.getPreparedStatement(query)
            ps?.setString(1, pelicula.titulo)
            ps?.setString(2, pelicula.director)
            ps?.setInt(3, pelicula.duracion)
            ps?.setInt(4, pelicula.year)
            ps?.setInt(5, pelicula.idPelicula)
            result = ps?.executeUpdate()
        } catch (e: SQLException) {
            println("Error, " + e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result == 1
    }

    override fun deletePelicula(id_pelicula: Int): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = Constantes.delete_pelicula
            ps = conexion.getPreparedStatement(query)
            ps?.setInt(1, id_pelicula)
            result = ps?.executeUpdate()
        } catch (e: SQLException) {
            println("Error, " + e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result == 1
    }

    override fun lastIDPelicula(): Int {
        conexion.conectar()
        val query = Constantes.select_max_pelicula
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        var lastId = 0
        if (rs?.next() == true) {
            lastId = rs.getInt("max(id)")
        }
        st?.close()
        conexion.desconectar()
        return lastId
    }
}