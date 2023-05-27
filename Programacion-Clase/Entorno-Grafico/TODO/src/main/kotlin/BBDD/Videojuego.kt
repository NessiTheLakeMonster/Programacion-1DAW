package BBDD

import java.io.Serializable
import java.time.LocalDate
import java.util.Date

class Videojuego : Serializable{
    var id: Int = 0
    var titulo: String = ""
    var saga: String = ""
    var distribuidora: String = ""
    var lanzamiento: LocalDate = LocalDate.now()
    var genero: String = ""

    constructor() {}

    constructor(i: Int, tit: String, s: String, dist: String, lanz: LocalDate, g: String) {
        this.id = i
        this.titulo = tit
        this.saga = s
        this.distribuidora = dist
        this.lanzamiento = lanz
        this.genero = g
    }

    override fun toString(): String {
        return "Videojuego(id=$id, titulo='$titulo', saga='$saga', distribuidora='$distribuidora', " +
                "lanzamiento=$lanzamiento, genero='$genero')"
    }

}