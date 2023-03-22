package Editorial

import ConexionBD
import Constantes
import java.sql.PreparedStatement

class EditorialDAOImpl : EditorialDAO {
    private val conexion = ConexionBD(Constantes.url, Constantes.user, Constantes.password)

    override fun editorialesSinFecha(): List<Editorial> {
        conexion.conectar()
        val query = Constantes.editoriales_sql_select
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)

        val editoriales = ArrayList<Editorial>()

        while (rs?.next() == true) {
            val ed = Editorial(rs.getInt(Constantes.id_editoriales), rs.getString(Constantes.nombre_editoriales))
            editoriales.add(ed)
        }
        st?.close()
        conexion.desconectar()
        return editoriales
    }

    override fun editorialesConFecha(): List<Editorial> {
        conexion.conectar()
        val query = Constantes.editoriales_sql_select_fecha
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)

        val editoriales = ArrayList<Editorial>()

        while (rs?.next() == true) {
            val ed = Editorial(
                rs.getInt(Constantes.id_editoriales),
                rs.getString(Constantes.nombre_editoriales), rs.getString(Constantes.fundacion_editoriales)
            )
            editoriales.add(ed)
        }
        st?.close()
        conexion.desconectar()
        return editoriales
    }

    override fun insertarListaEd(lista: ArrayList<Editorial>): ArrayList<Editorial> {
        conexion.conectar()
        var ps: PreparedStatement? = null
        val listaNoInsertadosEd = ArrayList<Editorial>()

        val query = Constantes.editoriales_sql_insert
        ps = conexion.getPreparedStatement(query)

        for (i in lista) {
            try {
                ps?.setInt(1, i.id)
                ps?.setString(2, i.nombre)
            } catch (e: Exception) {
                listaNoInsertadosEd.add(i)
            }
        }

        ps?.close()
        conexion.desconectar()
        return listaNoInsertadosEd
    }

    override fun insertarListaEdConFecha(lista: ArrayList<Editorial>): ArrayList<Editorial> {
        conexion.conectar()
        var ps: PreparedStatement? = null
        val listaNoInsertadosEd = ArrayList<Editorial>()

        val query = Constantes.editoriales_sql_insert_fecha
        ps = conexion.getPreparedStatement(query)

        for (i in lista) {
            try {
                ps?.setInt(1, i.id)
                ps?.setString(2, i.nombre)
                ps?.setString(3, i.fundacion)
            } catch (e: Exception) {
                listaNoInsertadosEd.add(i)
            }
        }

        ps?.close()
        conexion.desconectar()
        return listaNoInsertadosEd
    }
}