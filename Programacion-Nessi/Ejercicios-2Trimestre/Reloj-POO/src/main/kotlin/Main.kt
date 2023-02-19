// * Ejercicio 1 del Tema 4 --> Programacion orientada a objetos

import kotlin.concurrent.thread

fun main(args: Array<String>) {

    var tiempo = Reloj(12, 30, 55)



    if (tiempo.segundo > 59) {
        tiempo.minuto++
    }
    if (tiempo.minuto > 59) {
        tiempo.hora = tiempo.cambioFormato()
    }

    Thread.sleep(100) // ! Esto sirve para que el tiempo vaya pasando


}