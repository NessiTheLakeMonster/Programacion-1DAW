package inventario

class Inventario {
    var i: Int = 0
    var id_game: Int = 0
    var c_disp: Int = 0
    var c_reparacion: Int = 0
    var c_prestamo: Int = 0
    var date_last_up: String = ""

    constructor(i: Int, id_game: Int, disp: Int, cant_rep: Int, c_prest: Int, last_update: String) {
        this.i = i
        this.id_game = id_game
        this.c_disp = disp
        this.c_reparacion = cant_rep
        this.c_prestamo = c_prest
        this.date_last_up = last_update
    }

    override fun toString(): String {
        return "inventario.Inventario(i=$i, id_game=$id_game, c_disp=$c_disp, c_reparacion=$c_reparacion, c_prestamo=$c_prestamo, date_last_up='$date_last_up')"
    }
}