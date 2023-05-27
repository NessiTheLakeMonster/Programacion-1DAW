package inventario

interface InventarioDAO {
    fun allInventory(): List<Inventario>
    fun insertListInventory(lista : ArrayList<Inventario>)
    fun updateInventory(inventario : Inventario) : Boolean
    fun deleteInventory(id_inventario : Int) : Boolean
}