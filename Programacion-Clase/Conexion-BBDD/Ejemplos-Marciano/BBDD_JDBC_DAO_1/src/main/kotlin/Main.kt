fun main() {
    val categoriaDAO = CategoriaDAOImpl()
    val empleadoDAO = EmpleadoDAOImpl()
    val productoDAO = ProductoDAOImpl()

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

    // * EMPLEADOS ------------------------------------------------------------------

    //! Insertar un nuevo empleado
    val newEmpleado = Empleado(2222,"Isabel", 2)
    if (empleadoDAO.insertEmpleado(newEmpleado)) {
        println("Se inserto correctamente el empleado $newEmpleado")
    } else {
        println("No se pudo insertar el empleado $newEmpleado")
    }

    //! Actualizar un empleado existente
    val empleadoExistente = Empleado(1111, "Angel",1)
    if (empleadoDAO.updateEmpleado(empleadoExistente)) {
        println("Se actualizó correctamente el empleado $empleadoExistente")
    } else {
        println("No se pudo actualizar correctamente el empleado $empleadoExistente")
    }

    /*
    //! Eliminar empleado por clave aka dni
    val dni_Eliminar = 2222
    if (empleadoDAO.deleteEmpleado(dni_Eliminar)) {
        println("Se elimino correctamente el empleado con DNI $dni_Eliminar")
    } else {
        println("No se pudo eliminar correctamente el empleado con DNI $dni_Eliminar")
    }
     */

    // * PRODUCTOS -----------------------------------------------------------------
}
