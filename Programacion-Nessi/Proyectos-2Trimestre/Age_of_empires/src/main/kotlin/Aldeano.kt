class Aldeano {
    var rey: String = ""
    var nombre: String = ""
    var salud: Int = 0

    constructor(nom: String) {
        //this.rey = rey
        this.nombre = nom
        salud = (1..100).random() // Salud lo considero como un valor aleatorio
    }


}