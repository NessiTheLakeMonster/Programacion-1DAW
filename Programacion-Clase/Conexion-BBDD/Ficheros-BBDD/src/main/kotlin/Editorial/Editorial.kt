package Editorial

class Editorial {
    var id: Int = 0
    var nombre: String = ""
    var fundacion: String = ""

    constructor(id: Int, nom: String, fund: String) {
        this.id = id
        this.nombre = nom
        this.fundacion = fund
    }

    constructor(id: Int, nom: String) {
        this.id = id
        this.nombre = nom
    }

    override fun toString(): String {
        return "Editorial(id=$id, nombre='$nombre', fundacion='$fundacion')"
    }
}