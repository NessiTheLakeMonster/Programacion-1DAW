package inventario

import com.example.git_interfaz.Constantes
import Servicio.ConexionBD

class InventarioDAOImpl : InventarioDAO {
    private val conexion = ConexionBD(Constantes.url, Constantes.user, Constantes.password)

    override fun allInventory(): List<Inventario> {
        conexion.conectar()

        val query = Constantes.select_inventario
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)

        val inventario = ArrayList<Inventario>()

        while (rs?.next() == true) {
            val i = Inventario(
                rs.getInt(Constantes.id_inventario), rs.getInt(Constantes.id_videojuego),
                rs.getInt(Constantes.cant_disponible), rs.getInt(Constantes.cant_reparacion),
                rs.getInt(Constantes.cant_prestamo), rs.getString(Constantes.last_date_up)
            )
            inventario.add(i)
        }
        st?.close()
        conexion.desconectar()
        return inventario
    }

    override fun insertListInventory(lista: ArrayList<Inventario>) {

    }

    override fun updateInventory(inventario: Inventario): Boolean {
        return false
    }

    override fun deleteInventory(id_inventario: Int): Boolean {
        return false
    }
}