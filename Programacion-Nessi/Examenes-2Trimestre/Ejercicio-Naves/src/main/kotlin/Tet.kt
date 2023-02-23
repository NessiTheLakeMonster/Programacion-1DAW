
class Tet {
    var almacen = ArrayList<Dron>()

    fun crearTet(num_dron: Int, id_dron: String) {
        for (i in 0 until num_dron) {
            var d = Dron(id_dron + "_" + i)
            if (d.estado_operativo == true) { // Si es operativo lo mete en el ArrayList
                almacen.add(d)
            }
        }
    }

    fun addDron(d: Dron) {
        almacen.add(d)
    }

    fun removeDron(d: Dron) {
        almacen.remove(d)
    }

    fun cantDrones(): Int {
        return almacen.size
    }
}