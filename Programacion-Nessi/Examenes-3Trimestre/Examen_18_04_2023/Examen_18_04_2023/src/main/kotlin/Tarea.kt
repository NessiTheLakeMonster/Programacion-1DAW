open class Tarea {
    var tipo = 0
    var gradoResolucion = 0
    var edadMinima = 0
    var cantidadFuerza = 0

    constructor()

    constructor(t: Int, gr: Int, em: Int, cf: Int) {
        this.tipo = t
        this.gradoResolucion = gr
        this.edadMinima = em
        this.cantidadFuerza = cf
    }

    constructor(t: Int, gr: Int, em:Int) {
        this.tipo = t
        this.gradoResolucion = gr
        this.edadMinima = em
    }

    override fun toString(): String {
        return "Tarea(tipo=$tipo, gradoResolucion=$gradoResolucion, edadMinima=$edadMinima, cantidadFuerza=$cantidadFuerza)"
    }
}