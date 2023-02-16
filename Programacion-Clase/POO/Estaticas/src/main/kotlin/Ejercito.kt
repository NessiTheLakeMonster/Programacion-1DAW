
class Ejercito {
    var tercio = ArrayList<Soldado>()    //Creating an empty arraylist
    var nombre: String =""

    constructor(num:Int,n:String){
        for (valor in 1..num){
            var sol = Soldado()
            tercio.add(sol)

        }
        this.nombre = n
    }

    fun revisionEjercito(){
        println("$nombre")
        for (i in tercio) {
            println(i)
        }
    }

    fun muerto(){
        if (tercio.isEmpty()){
            print("Final del ejercito")
        }else{
            tercio.removeAt(0)
        }

    }
}