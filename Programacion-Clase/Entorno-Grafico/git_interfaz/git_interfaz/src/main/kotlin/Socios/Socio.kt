package Socios

import java.time.LocalDate

class Socio {
    var id_socio = 0
    var dni = ""
    var nombre = ""
    var apellido1 = ""
    var fecha_nac = ""

    constructor()

    constructor(id: Int, nombre: String){
        this.id_socio = id
        this.nombre = nombre

    }

    constructor(id: Int, dni: String, nombre: String, apellido1: String, fecha_nac : String) {
        this.id_socio = id
        this.dni = dni
        this.nombre = nombre
        this.apellido1 = apellido1
        this.fecha_nac = fecha_nac
    }

    override fun toString(): String {
        return "socio.Socio(id=$id_socio, dni=$dni, nombre=$nombre, apellido=$apellido1, fecha nacimiento=$fecha_nac"
    }

}