open class Cuadrante {

    // ? Maybe crear una variable para las columnas y otra para las filas

    var mecanico: String = "" // Jack
    var supervisora: String = "" // Vika
    var dron_cuadrante = Array<Tet>((1..3).random()){Tet()}
    // ? En cada cuadrante hay varios drones del almacén del Tet

    constructor(m: String, s: String) {
        mecanico = m
        supervisora = s
    }

    fun addTet() {
        for (i in 0 until dron_cuadrante.size) {
            var t = Tet()

        }
    }

    fun crearCuadrante() {

    }
}