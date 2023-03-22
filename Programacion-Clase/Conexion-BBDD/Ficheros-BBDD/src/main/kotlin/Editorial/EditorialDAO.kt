package Editorial

interface EditorialDAO {
    fun editorialesSinFecha(): List<Editorial>
    fun editorialesConFecha(): List<Editorial>
    fun insertarListaEd(lista: ArrayList<Editorial>): ArrayList<Editorial>
    fun insertarListaEdConFecha(lista: ArrayList<Editorial>): ArrayList<Editorial>
}