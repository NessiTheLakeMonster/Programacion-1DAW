class Empleado(val DNI:Int, var nombre: String, var puesto: Int) {
    override fun toString(): String {
        return "Empleado [DNI=$DNI, nombre='$nombre', puesto=$puesto]"
    }
}