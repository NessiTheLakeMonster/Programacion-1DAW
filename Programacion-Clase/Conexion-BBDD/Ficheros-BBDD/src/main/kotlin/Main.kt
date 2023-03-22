import Autores.*
import Editorial.*

fun main(args: Array<String>) {
    val AutoresDAO = AutoresDAOImpl()
    val AutoresFichero= AutoresFichero()

    val EditorialesDAO = EditorialDAOImpl()
    val EditorialesFichero = EditorialFichero()


    /*
    // ! Ejemplo de sacar de bb a fichero
    val c = AutoresDAO.todosLosAutores()
    AutoresFichero.insertar(c,Constantes.ficheroAutores,true)
    println("Control por la salida Estandar")
    for (i in c!!) {
        println(i)
    }

    // ! Sacar de la base de datos y meterlo en un fichero
    val ed = EditorialesDAO.editorialesConFecha()
    EditorialesFichero.insertarEditorial(ed, Constantes.ficheroEditoriales, true)
    println("Control")
    for (i in ed!!) {
        println(i)
    }

     */


    // ! Ejemplo de insertar de fichero a bbdd
    //AutoresDAO.insertarLista(AutoresFichero.recuperar(Constantes.ficheroAutores))
    EditorialesDAO.insertarListaEdConFecha(EditorialesFichero.recuperarEditorial(Constantes.ficheroEditoriales))
}