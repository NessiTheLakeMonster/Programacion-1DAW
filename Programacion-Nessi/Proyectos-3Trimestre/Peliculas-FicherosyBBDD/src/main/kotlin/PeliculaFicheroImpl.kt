class PeliculaFicheroImpl : PeliculaFichero {

    private var listaPeliculas = ArrayList<Pelicula>()

    override fun addPelicula(): Pelicula {
        println("Ingresa el titulo de la película")
        val titulo = readln()
        println("Ingresa el director de la película")
        val director = readln()
        println("Ingresa la duración de la película")
        val duracion = readln().toInt()
        println("Ingresa el año de la película")
        val year = readln().toInt()

        val p = Pelicula(titulo, director, duracion, year)

        for (i in listaPeliculas) {
            if (p.titulo == titulo) {
                println("Pelicula ya registrada")
            } else {
                listaPeliculas.add(p)
                println("Pelicula añadida")
            }
        }

        return Pelicula(titulo, director, duracion, year)
    }

    override fun deletePelicula(): Pelicula {
        TODO("Not yet implemented")
    }
}