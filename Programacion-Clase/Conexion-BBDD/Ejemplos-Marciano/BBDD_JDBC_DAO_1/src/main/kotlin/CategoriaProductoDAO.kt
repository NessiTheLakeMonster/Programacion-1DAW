interface CategoriaProductoDAO {
    fun deleteCascadeCP(c: Categoria) : Boolean
    fun deleteCascadeCP(cod: Int) : Boolean
    fun juntarTablas(): Boolean
}