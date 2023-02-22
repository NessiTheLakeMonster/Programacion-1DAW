class Tierra : Cuadrante() {

    var parrilla = Array(3) { arrayOfNulls<Cuadrante>(3) }

    fun addCuadrante() {
        for (i in 0 until 3) {
            for (j in 0 until 3) {
                parrilla[i][j] = Cuadrante() // ! Se rellena la matriz de objetos cuadrantes
            }
        }
    }
}