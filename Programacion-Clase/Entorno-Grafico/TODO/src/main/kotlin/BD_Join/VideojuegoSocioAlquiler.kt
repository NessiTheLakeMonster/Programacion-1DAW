package BD_Join

class VideojuegoSocioAlquiler {
    var titulo: String = ""
    var nombre: String = ""
    var apellido: String = ""
    var fecha_inicio: String = ""
    var fecha_fin: String = ""

    constructor(tit: String, nom: String, ape: String, fe_ini: String, fe_fin: String) {
        this.titulo = tit
        this.nombre = nom
        this.apellido = ape
        this.fecha_inicio = fe_ini
        this.fecha_fin = fe_fin
    }

    override fun toString(): String {
        return "VideojuegoSocioAlquiler(titulo='$titulo', nombre='$nombre', apellido='$apellido', " +
                "fecha_inicio='$fecha_inicio', fecha_fin='$fecha_fin')"
    }


}