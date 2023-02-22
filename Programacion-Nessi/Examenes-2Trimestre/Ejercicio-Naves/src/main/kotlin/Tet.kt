
class Tet {
    var almacen = ArrayList<Dron>()

    fun crearTet(num_dron: Int, id_dron: String) {
        for (i in 0 until num_dron) {
            var d = Dron(id_dron + "_" + i, )
        }
    }

    fun addDron(d: Dron) {
        almacen.add(d)
    }

    fun removeDron(d: Dron) {
        almacen.remove(d)
    }
}