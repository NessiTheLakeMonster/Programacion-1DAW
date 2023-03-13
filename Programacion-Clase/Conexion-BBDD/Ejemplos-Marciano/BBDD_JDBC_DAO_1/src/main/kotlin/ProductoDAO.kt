interface ProductoDAO {
    fun insertProducto(producto: Producto): Boolean
    fun updateProducto(producto: Producto): Boolean
    fun deleteProducto(producto: Producto): Boolean
}