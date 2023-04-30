package MujerGuerrera

import Animal
import Mujer
import java.io.Serializable

class MujerGuerrera : Mujer, Serializable {
    var idGuerrera = 0
    var fuerza = 0

    var animales = ArrayList<Animal>()

    constructor(id: Int, espV: Int, n: String, e: Int, iInt: Int, f: Int) : super(n, espV, e, iInt) {
        this.idGuerrera = id
        this.esperanzaVida = espV
        this.nombre = n
        this.edad = e
        this.indiceIntl = iInt
        this.fuerza = f
    }

    fun tenerAnimales() {
        if (animales.isEmpty()) {
            println("La mujer guerrera no tiene animales")
        } else {
            println("La mujer guerrera tiene animales que son:")
            for (i in animales) {
                println(animales.toString())
            }
        }
    }

    override fun toString(): String {
        return "MujerGuerrera(idGuerrera = $idGuerrera, esperanzaVida = $esperanzaVida, nombre = $nombre," +
                "edad = $edad, indice_inteligencia = $indiceIntl, fuerza=$fuerza)"
    }

}