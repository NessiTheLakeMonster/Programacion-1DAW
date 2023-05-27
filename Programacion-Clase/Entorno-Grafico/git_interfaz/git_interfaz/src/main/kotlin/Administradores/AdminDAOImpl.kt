package Administradores

import Servicio.ConexionBD
import com.example.git_interfaz.Constantes

class AdminDAOImpl : AdminDAO {
    private val conexion = ConexionBD(Constantes.url, Constantes.user, Constantes.password)

    fun allAdmins(): List<admin>{
        conexion.conectar()
        val query = "select * from admins"
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val admins = ArrayList<admin>()
        while (rs?.next() == true){
            val a = Administradores.admin(
                rs.getInt("id_admin"),
                rs.getInt("id_socio")
            )
            admins.add(a)
        }
        st?.close()
        conexion.desconectar()
        return admins
    }

    override fun selectXAdmin(): Boolean {
        TODO("Not yet implemented")
    }

    override fun insertAdmin(admin: admin): Boolean {
        TODO("Not yet implemented")
    }

    override fun deleteAdmin(admin: admin): Boolean {
        TODO("Not yet implemented")
    }


}