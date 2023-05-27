package alquiler

class Alquiler {
    var id_alquiler = 0
    var id_videojuego = 0
    var id_socio = 0
    var fecha_inicio = ""
    var fecha_fin = ""
    var precio = 0

    constructor(id_a: Int, id_v: Int, id_s: Int, fi: String, ff: String, p: Int) {
        this.id_alquiler = id_a
        this.id_videojuego = id_v
        this.id_socio = id_s
        this.fecha_inicio = fi
        this.fecha_fin = ff
    }

    override fun toString(): String {
        return "alquier.alquiler.Alquiler(id_alquiler = $id_alquiler, id_videojuego = $id_videojuego, id_socio = $id_socio, fecha inicio = $fecha_inicio, fecha fin = $fecha_fin, precio = $precio"
    }
}