package Administradores

class admin {
    var id_admin = 0
    var id_socio = 0

    constructor()

    constructor(admin : Int, socio : Int){
        this.id_admin = admin
        this.id_socio = socio
    }


    override fun toString(): String {
        return "admin(id_admin=$id_admin, id_socio=$id_socio)"
    }

}