package MujerGuerrera

import Constantes
import ConexionBD
import java.sql.PreparedStatement

class MujerGuerreraDAOImpl {
    private val conexion = ConexionBD(Constantes.url, Constantes.user, Constantes.password)

    /**
    fun getGuerreraByID(id_guerrera1: Int, id_guerrera2: Int): ArrayList<MujerGuerrera> {
        conexion.conectar()
        val query = Constantes.select_guerreras
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_guerrera1)
        ps?.setInt(2, id_guerrera2)
        val rs = ps?.executeQuery()
        var mujerGuerrera = ArrayList<MujerGuerrera>()

        if (rs?.next() == true) {
            val g = MujerGuerrera(
                rs.getInt(Constantes.id_guerreras), rs.getInt(Constantes.esperanzaVida),
                rs.getString(Constantes.nombre), rs.getInt(Constantes.edad),
                rs.getInt(Constantes.indiceIntenligencia), rs.getInt(Constantes.fuerza)
            )
            mujerGuerrera.add(g)
        }

        ps?.close()
        conexion.desconectar()
        return mujerGuerrera
    }
    **/

    // Hice dos pero al final utilicé esta
    fun getGuerreraByID2(id_guerrera1: Int): MujerGuerrera?{
        conexion.conectar()
        val query = Constantes.select_guerreras2
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id_guerrera1)
        val rs = ps?.executeQuery()
        var mujerGuerrera: MujerGuerrera? = null

        if (rs?.next() == true) {
            mujerGuerrera = MujerGuerrera(
                rs.getInt(Constantes.id_guerreras), rs.getInt(Constantes.esperanzaVida),
                rs.getString(Constantes.nombre), rs.getInt(Constantes.edad),
                rs.getInt(Constantes.indiceIntenligencia), rs.getInt(Constantes.fuerza)
            )

        }

        ps?.close()
        conexion.desconectar()
        return mujerGuerrera
    }
}