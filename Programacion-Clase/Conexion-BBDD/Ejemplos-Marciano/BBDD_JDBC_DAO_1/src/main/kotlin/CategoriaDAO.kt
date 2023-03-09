interface CategoriaDAO {
    fun getCategoriaByCodigo(codigo: Int): Categoria?
    fun getAllCategorias(): List<Categoria>
    fun insertCategoria(categoria: Categoria): Boolean
    fun updateCategoria(categoria: Categoria): Boolean
    fun deleteCategoria(codigo: Int): Boolean
    fun insertarLista(categoria: Categoria, lisCat: ArrayList<Categoria>) : Boolean
}
