import kotlin.random.Random

class Dron {

    var num_id: String = ""
    var estado_operativo: Boolean = Random.nextBoolean() // ! guardalo Random.nextBoolean()

    constructor(id: String) {
        this.num_id = id
    }

    override fun toString(): String {
        return "Dron(num_id='$num_id', estado_operativo=$estado_operativo)"
    }


}