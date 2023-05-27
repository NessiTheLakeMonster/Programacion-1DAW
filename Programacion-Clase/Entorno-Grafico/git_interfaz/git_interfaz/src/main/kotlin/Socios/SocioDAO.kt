package Socios

import Socios.Socio

interface SocioDAO {
    fun todosLosSocios(): List<Socio>
    fun insertSocio(socio: Socio): Boolean
    fun updateSocio(socio: Socio): Boolean
    fun deleteSocio(id_socio: Int): Boolean
}