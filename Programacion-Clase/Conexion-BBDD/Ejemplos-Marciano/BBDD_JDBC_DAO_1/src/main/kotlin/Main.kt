fun main() {
    val categoriaDAO = CategoriaDAOImpl()

    var c = ArrayList<Categoria>()

    for (i in 1..9) {
        val cat = Categoria(i, "info" + i)
        c.add(cat)
    }

    var cat = Categoria(90, "Naranjas")
    c.add(cat)

    var aux = categoriaDAO.insertarLista(c) //! Se guarda en un arraylist distinto

    for (i in aux) {
        println(i) //! Bc la clase categoria ya tiene in toString()
    }

    /*
    // Obtener todas las categorias
    val categorias = categoriaDAO.getAllCategorias()
    println("Lista de categorias:")
    //! categorias.forEach { println(it) } función lambda (no se ve aún)
    for (categoria in categorias) {
        println(categoria)
    }

    // Obtener una categoría por código
    val codigo = 1
    val categoria = categoriaDAO.getCategoriaByCodigo(codigo)
    if (categoria != null) {
        println("Categoria con codigo $codigo:")
        println(categoria)
    } else {
        println("No se encontró la categoria con codigo $codigo")
    }


    // Insertar una nueva categoria
    val nuevaCategoria = Categoria(6, "Frutas")
    if (categoriaDAO.insertCategoria(nuevaCategoria)) {
        println("Se insertó correctamente la categoria $nuevaCategoria")
    } else {
        println("No se pudo insertar la categoria $nuevaCategoria")
    }

    // Actualizar una categoria existente
    val categoriaExistente = Categoria(1, "Hogar y electrodomésticos")
    if (categoriaDAO.updateCategoria(categoriaExistente)) {
        println("Se actualizó correctamente la categoria $categoriaExistente")
    } else {
        println("No se pudo actualizar la categoria $categoriaExistente")
    }

    // Eliminar una categoria existente NO ES POSIBLE PUES ES CLAVE EXTTERNA, DARA ERROR
    val codigoAEliminar = 3
    if (categoriaDAO.deleteCategoria(codigoAEliminar)) {
        println("Se eliminó correctamente la categoria con codigo $codigoAEliminar")
    } else {
        println("No se pudo eliminar la categoria con codigo $codigoAEliminar")
    }

     */
}
