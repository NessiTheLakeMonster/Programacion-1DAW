open class Mujer : SerVivo {
    var edad = 0
    var indiceIntl = 0

    constructor(n: String, espV: Int, e: Int, iInt: Int): super() {
        this.nombre = n
        this.esperanzaVida = espV
        this.edad = e
        this.indiceIntl = iInt
    }

    fun analizarTarea() : Boolean {
        var puede: Boolean = true
        val tarea = Tarea()

        if (tarea.edadMinima < edad) {
            if (tarea.gradoResolucion < indiceIntl) {
                println("La mujer puede realizar la tarea + ${tarea.toString()}")
                puede = true
            } else {
                println("La mujer no puede realizar la tarea + ${tarea.toString()}")
                puede = false
            }
        } else {
            println("La mujer no puede realizar la tarea + ${tarea.toString()}")
            puede = false
        }

        return puede
    }

    override fun toString(): String {
        return "Mujer(edad=$edad, indiceIntl=$indiceIntl)"
    }


}