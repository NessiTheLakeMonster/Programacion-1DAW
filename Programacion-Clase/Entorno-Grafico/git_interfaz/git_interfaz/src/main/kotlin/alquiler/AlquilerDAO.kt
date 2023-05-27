package alquiler

interface AlquilerDAO {
    fun todosLosAlquileres(): List<Alquiler>
    fun insertarLista(c:ArrayList<Alquiler>):ArrayList<Alquiler>
    fun updateAlquiler(alquiler: Alquiler): Boolean
    fun deleteAlquiler(id_alquiler: Int): Boolean
}