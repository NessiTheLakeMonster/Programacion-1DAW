package Producto

class Producto(val cod_prod: Int, var cod_cat: Int, var nombre: String,
               var cant: Int, var precio: Int){

    override fun toString(): String {
        return "Producto.Producto [cod_prod=$cod_prod, cod_cat=$cod_cat, nombre='$nombre', cant=$cant, precio=$precio]"
    }
}