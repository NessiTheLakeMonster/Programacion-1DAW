import Pelicula.*

class Funcionalidades {
    val pl = PeliculaDAOImpl()

    fun addPelicula() {
        val ultimaID = pl.lastIDPelicula() + 1

        println("Ingresa el título de la película")
        val titulo = readln()

        println("Ingresa el director de la película")
        val director = readln()

        println("Ingresa la duración de la película")
        val duracion = readln().toInt()

        println("Ingresa el año de lanzamiento de la película")
        val anio = readln().toInt()

        val p = Pelicula(ultimaID, titulo, director, duracion, anio)

        pl.insertarPelicula(p)
    }

    fun removePelicula() {
        println("¿Que película quieres borrar?")
        val peliculas = pl.todasLasPeliculas()

        for (i in peliculas) {
            println(i.toString())
        }

        println("Introduce la ID de la película que quieres borrar")
        val id_pelicula = readln().toInt()

        for (i in peliculas) {
            if (i.idPelicula == id_pelicula) {
                println("Has elegido --> " + i.toString())
                pl.deletePelicula(i.idPelicula)
            }
        }
    }

    fun modifyPelicula() {
        println("¿Qué película quieres modificar?")
        val peliculas = pl.todasLasPeliculas()

        for (i in peliculas) {
            println(i.toString())
        }

        println("Introduce la ID de la película que quieras modificar")
        val id_pelicula = readln().toInt()

        for (i in peliculas) {
            if (i.idPelicula == id_pelicula) {
                println("Se va a modificar --> " + i.toString())

                println("Ingresa un nuevo título para la película")
                i.titulo = readln()

                println("Ingresa un nuevo director para la película")
                i.director = readln()

                println("Ingresa una nueva duración para la película")
                i.duracion = readln().toInt()

                println("Ingresa un nuevo año de lanzamiento de la película")
                i.year = readln().toInt()

                val p = Pelicula(i.idPelicula, i.titulo, i.director, i.duracion, i.year)

                pl.updatePelicula(p)
            }
        }

    }


}