package Editorial

import java.io.File
import java.io.FileWriter
import java.io.PrintWriter

class EditorialFichero {

    fun insertarEditorial(lista: List<Editorial>, no: String, ti: Boolean) {
        val pw = FileWriter(no, ti)
        var copiar = PrintWriter(pw)

        for (i in lista) {
            copiar?.println(i)
        }

        copiar?.flush()
        copiar?.close()
    }

    fun recuperarEditorial(n: String): ArrayList<Editorial> {
        val sol = ArrayList<Editorial>()
        var id: Int
        var nombre: String
        var fundacion: String
        val file = File(n)

        val lineas = file.readLines()

        for (i in lineas) {
            id = i.substringAfter("id =").substringAfter(",").toInt()
            nombre = i.substringAfter("nombre de la editorial =").substringAfter(",")
            fundacion = i.substringAfter("fundacion=").substringAfter(",")

            val ed = Editorial(id, nombre, fundacion)
            sol.add(ed)
        }

        return sol
    }
}