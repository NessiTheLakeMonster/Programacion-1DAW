package Ejercicios1y2

import java.time.LocalDate
import java.util.Date

class Conversion {

    companion object {

        fun textoAfecha(s: String): LocalDate {
            val fecha = LocalDate.parse(s)
            return fecha
        }

        fun fechaAtexto(d: Date): String {
            val pal = d.toString()
            return pal
        }

        fun enteroAtexto(num: Int): String {
            val s = num.toString()
            return s
        }

        fun textoAentero(s: String): Int {
            val i = s.toInt()
            return i
        }

        fun modulo(n1: Int, n2: Int): Boolean {
            var bol = true

            if (n1 % n2 == 0) {
                println("Los números son divisibles entre ellos")
                bol = true
            } else {
                println("Los números no son divisibles entre ellos")
                bol = false
            }

            return bol
        }
    }

}

fun main() {
    var n1 = 0
    var n2 = 0
    val palabra = "2022-12-31"
    var fecha = LocalDate.now()

    try {
        fecha = Conversion.textoAfecha(palabra)
        println(fecha)
    } catch (e: Exception) {
        println(e.message)
    }

    do {
        n1 = (1..100).random()
        n2 = (1..100).random()
        println("Los números generados son $n1 y $n2")

    } while (!Conversion.modulo(n1, n2))

}