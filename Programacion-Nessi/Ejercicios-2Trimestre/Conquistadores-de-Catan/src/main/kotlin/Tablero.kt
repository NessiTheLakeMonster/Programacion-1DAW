class Tablero {
    var t = Array(3) { arrayOfNulls<Casilla>(4) } // otra opcion pero no se usarla bien xd

    var t2 = ArrayList<ArrayList<Casilla>>()

    init {
        for (i in 0 until 3) {
            t2.add(ArrayList())
        }
    }

    fun crearTablero() {
        for (i in 0 until t.size) {
            for (j in 0 until t[0].size) {
                t[i][j] = Casilla()
                print(t[i][j])
            }
            println()
        }
    }

    fun crearTablero2() { // opcion para usar con arraylist
        for (fila in t2) {
            for (j in 0 until 4) {
                fila.add(Casilla())
            }
        }
    }

    fun colocarCasillaHumano(x: Int, y: Int): Boolean {
        if (t2[x][y].duenio.idJugador == 0) {
            t2[x][y].duenio.idJugador = 1
            return true
        } else {
            println("No se puede colocar en esa casilla")
            return false
        }
    }

    fun colocarCasillaPC(x: Int, y: Int): Boolean {
        if (t2[x][y].duenio.idJugador == 0) {
            t2[x][y].duenio.idJugador = 2
            return true
        } else {
            println("No se puede colocar en esa casilla")
            return false
        }
    }

    override fun toString(): String {
        return "Tablero(t=${t.contentToString()})"
    }


}