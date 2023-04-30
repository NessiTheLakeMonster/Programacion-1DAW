package Pelicula

class Pelicula {
    var idPelicula = 0
    var titulo = ""
    var director = ""
    var duracion = 0
    var year = 0

    constructor(id: Int, tit: String, dir: String, dur: Int, y: Int) {
        this.idPelicula = id
        this.titulo = tit
        this.director = dir
        this.duracion = dur
        this.year = y
    }

    override fun toString(): String {
        return "Pelicula (idPelicula=$idPelicula, titulo='$titulo', director='$director', duracion=$duracion, año=$year)"
    }
}