class Pelicula {
    var titulo = ""
    var director = ""
    var duracion = 0
    var year = 0

    constructor()

    constructor(t: String, d: String, du: Int, y: Int) {
        this.titulo = t
        this.director = d
        this.duracion = du
        this.year = y
    }

    override fun toString(): String {
        return "Pelicula (titulo='$titulo', director='$director', duracion=$duracion, año=$year)"
    }
}