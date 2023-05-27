package videojuego

class Videojuego {
    var id: Int = 0
    var titulo: String = ""
    var saga: String = ""
    var distribuidora: String = ""
    var fecha_lanzamiento: String = ""
    var genero: String = ""

    constructor(i: Int, tit: String, sag: String, distr: String, fec_lanz: String, gen: String) {
        this.id = i
        this.titulo = tit
        this.saga = sag
        this.distribuidora = distr
        this.fecha_lanzamiento = fec_lanz
        this.genero = gen
    }

    override fun toString(): String {
        return "videojuego.Videojuego(id=$id, titulo='$titulo', saga='$saga', distribuidora='$distribuidora', fecha_lanzamiento='$fecha_lanzamiento', genero='$genero')"
    }

}