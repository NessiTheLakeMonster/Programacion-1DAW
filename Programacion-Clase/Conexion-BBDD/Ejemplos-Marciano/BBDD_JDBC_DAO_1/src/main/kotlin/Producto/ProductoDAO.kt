package Producto

interface ProductoDAO {
    fun insertProducto(producto: Producto): Boolean
    fun updateProducto(producto: Producto): Boolean
    fun deleteProducto(cod_prod: Int): Boolean
}