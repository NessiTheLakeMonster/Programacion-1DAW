package BBDD

class CategoriaProducto {
    var descripcionCategoria: String = ""
    var nombreProducto: String = ""
    var cantidad: Int = 0
    var precio: Int = 0

    constructor(descrip: String, nom: String, cant: Int, prec: Int) {
        this.descripcionCategoria = descrip
        this.nombreProducto = nom
        this.cantidad = cant
        this.precio = prec
    }

    override fun toString(): String {
        return "CategoriaProducto(descripcionCategoria='$descripcionCategoria', nombreProducto='$nombreProducto', cantidad=$cantidad, precio=$precio)"
    }
}