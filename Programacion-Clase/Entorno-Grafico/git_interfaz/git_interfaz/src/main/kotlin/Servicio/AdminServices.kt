package Servicio

import Administradores.AdminDAO
import Administradores.AdminDAOImpl
import Administradores.admin

class AdminServices {
    companion object{
        val Adao = AdminDAOImpl()

        fun allAdmins(): List<admin>{
            return Adao.allAdmins()
        }
    }
}