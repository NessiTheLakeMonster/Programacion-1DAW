package Servicio

import Socios.*


class SocioServices {
    companion object {

        val Sdao = SocioDAOImpl()

        fun id () : Int{
            var id = Sdao.ultimaId() + 1
            return id
        }
        fun loginSocio(s: Socio): Boolean{
            return Sdao.comprobarSocio(s)
        }
        fun insertnewSocio(soc: Socio) {
            Sdao.insertSocio(soc)
        }
    }
}