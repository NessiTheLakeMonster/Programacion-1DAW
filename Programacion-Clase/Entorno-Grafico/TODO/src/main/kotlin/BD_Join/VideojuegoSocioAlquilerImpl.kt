package BD_Join

import BBDD.*

class VideojuegoSocioAlquilerImpl : VideojuegoSocioAlquilerDAO {
    private val conexion = ConexionBD()

    override fun seleccionar(): List<VideojuegoSocioAlquiler> {
        conexion.conectar()

        val query =
            "SELECT videojuego.titulo, socio.nombre, socio.apellido1, " +
                    "DATE_FORMAT(alquiler.fecha_inicio, '%d/%m/%Y') AS fecha_in_st, " +
                    "DATE_FORMAT(alquiler.fecha_fin, '%d/%m/%Y') AS fecha_fin_st " +
                    "from alquiler join videojuego " +
                    "on alquiler.id_videojuego = videojuego.id_videojuego " +
                    "join socio " +
                    "on alquiler.id_alquiler = socio.id_socio"

        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val lista = ArrayList<VideojuegoSocioAlquiler>()

        while (rs?.next() == true) {
            val vsa = VideojuegoSocioAlquiler(
                rs.getString("videojuego.titulo"),
                rs.getString("socio.nombre"),
                rs.getString("socio.apellido1"),
                rs.getString("fecha_in_st"),
                rs.getString("fecha_fin_st")
            )
            lista.add(vsa)
        }

        st?.close()
        conexion.desconectar()
        return lista
    }
}