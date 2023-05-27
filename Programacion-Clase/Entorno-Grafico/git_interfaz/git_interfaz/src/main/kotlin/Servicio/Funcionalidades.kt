package Servicio

import inventario.*
import videojuego.*
import Socios.*
import java.util.Scanner

class Funcionalidades {
    var videojuegoDAOImpl = VideojuegoDAOImpl()
    var inventarioDAOImpl = InventarioDAOImpl()
    val v = VideojuegoDAOImpl()

    // FUNCIONALIDAD DE SACAR RECOMENDACIONES
    fun buscarVideojuegos() {
        println("¿Que videojuego te gusta más?")
        var juegos = v.todosLosVideojuegos()

        for (i in juegos) {
            println(i.toString())
        }

        println("Introduce la id: ")
        var id_videojuego = readln().toInt()
        var gen = ""

        for (i in juegos) {
            if (i.id == id_videojuego) {

                gen = i.genero
                println("Has elegido --> " + i.toString())
                println("Vamos a sacar algunas recomendaciones:")

                for (j in juegos) {
                    if (j.genero == gen) {
                        println(j.toString())
                    }

                }
            }
        }

    }

    // FUNCIONALIDAD DE VER STOCK DE UN SOLO VIDEOJUEGO
    fun verStockVideojuegos() {
        println("¿Que videojuego quieres ver?")
        println()
        var juegos = videojuegoDAOImpl.todosLosVideojuegos()

        for (i in juegos) {
            println(i.toString())
        }

        println()
        println("Introduce la id: ")
        var id_videojuego = readln().toInt()
        var cantidades = inventarioDAOImpl.allInventory()

        var encontrado = false

        for (i in cantidades) {
            if (i.id_game == id_videojuego) {
                if (i.c_disp == 0) {
                    println("No quedan copias de este videojuego.")
                    encontrado = true
                } else {
                    println("Para el videojuego seleccionado tenemos un total de: ${i.c_disp} copias.")
                    encontrado = true
                }
            }
        }

        if (encontrado == false) {
            println("No quedan copias de este videojuego.")
            encontrado = true
        }
    }

    // FUNCIONALIDAD DE VER STOCK DE UN TODOS LOS VIDEOJUEGOS
    fun verStockTodosVideojuegos() {
        var inventario = inventarioDAOImpl.allInventory()

        for (i in inventario) {
            println("Videojuego: ${i.id_game} tiene: ${i.c_disp} copias.")
        }
    }

    // FUNCIONALIDAD DE INICIAR SESIÓN
    fun iniciarSesion() {
        val SC = Scanner(System.`in`)

        var s = SocioDAOImpl()
        var nombreSocio = ""

        println("Lista de todos los usuarios:")

        var listaSocios = s.todosLosSocios()

        for (i in listaSocios) {
            println(i.toString())
        }

        println("Qué usuario/a eres?")
        var res = SC.nextInt()

        for (socio in listaSocios) {
            if (socio.id_socio == res) {
                nombreSocio = socio.nombre
            }
        }

        println("Hola " + nombreSocio)
    }

    // FUNCIONALIDAD DE CREACIÓN DE USUARIOS
    fun crearusuario() {
        val sd = SocioDAOImpl()

        println("Dame tu DNI: ")
        var dni = readln()

        println("Dame tu nombre: ")
        var nombre = readln()

        println("Dame tu primer apellido: ")
        var apellido = readln()

        println("Dime tu fecha de nacimiento: (formato: yyyy-mm-dd)")
        var fecha_nac = readln()

        var lastid = sd.ultimaId() + 1

        var s = Socio(lastid, dni, nombre, apellido, fecha_nac)
        sd.insertSocio(s)
    }


}