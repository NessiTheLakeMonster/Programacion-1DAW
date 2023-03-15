class CategoriaProducto {

    var codigoProd: Int = 0
    var codigoCat: Int = 0
    var descripcion: String = ""
    var nombre: String = ""
    var cantidad: Int = 0
    var precio: Int = 0

    constructor(codProd: Int, codCat: Int, desc: String, nom: String, cant: Int, prec: Int) {
        codigoProd = codProd
        codigoCat = codCat
        descripcion = desc
        nombre = nom
        cantidad = cant
        precio = prec
    }

    override fun toString(): String {
        return "CategoriaProducto(codigoProd=$codigoProd, codigoCat=$codigoCat, descripcion='$descripcion', nombre='$nombre', cantidad=$cantidad, precio=$precio)"
    }

}