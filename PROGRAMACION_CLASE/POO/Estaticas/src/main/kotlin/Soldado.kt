class Soldado {
    var poder: Int = 0

    companion object { // Para crear estáticos
        var creadosPorDios: Int = 0
        private var equipo = "Orden del Temple"
        private var pais = "Castilla"
        fun CuantosHanNacido():Int {
            return this.creadosPorDios
        }

        fun miPais():String{
            return pais
        }
    } // Fin de los estáticos

    constructor(){
        creadosPorDios ++
        poder = (1..10).random()
    }

    fun cambiarpais(p:String){
        pais = p
    }

    override fun toString(): String {
        return "Soldado(poder=$poder  equipo=$equipo pais=$pais) "
    }


}