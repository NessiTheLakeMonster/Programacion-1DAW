import kotlin.random.Random

class FactoriaTarea {
    //Una clase factoria se encarga de crear instancias de una clase determinada.
    //Es un patron de diseño
    companion object {

        fun devolverUnaTarea(): Tarea {
            var i = Random.nextInt(1, 4)
            return when (i) {
                1 -> {
                    crearTareasAleatoria()
                }

                2 -> {
                    crearTareasGuerreras()
                }

                3 -> {
                    crearTareasNoGuerrera()
                }

                else -> throw IllegalArgumentException("Opción no válida")
            }
        }

        fun crearTareasAleatoria(): Tarea {
            var tipo: Int = Random.nextInt(1, 2)
            var gradoResolucion: Int = Random.nextInt(1, 10)
            var edadMinima: Int = Random.nextInt(1, 18)

            var i = Tarea()
            if (tipo == Constantes.Fuerza) {
                var cantidadFuerza: Int = Random.nextInt(1, 10)
                i = Tarea(tipo, gradoResolucion, edadMinima, cantidadFuerza)
            } else {
                i = Tarea(tipo, gradoResolucion, edadMinima)
            }
            return i
        }

        fun crearTareasGuerreras(): Tarea {
            var tipo: Int = 1
            var gradoResolucion: Int = Random.nextInt(1, 10)
            var edadMinima: Int = Random.nextInt(1, 18)
            var cantidadFuerza: Int = Random.nextInt(1, 50)

            return Tarea(tipo, gradoResolucion, edadMinima, cantidadFuerza)
        }

        fun crearTareasNoGuerrera(): Tarea {
            var tipo: Int = 2
            var gradoResolucion: Int = Random.nextInt(1, 10)
            var edadMinima: Int = Random.nextInt(1, 18)


            return Tarea(tipo, gradoResolucion, edadMinima)
        }
    }
}