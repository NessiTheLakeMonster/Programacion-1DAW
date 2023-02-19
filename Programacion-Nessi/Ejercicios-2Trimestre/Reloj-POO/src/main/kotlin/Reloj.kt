class Reloj {
    var hora: Int = 0
    var minuto: Int = 0
    var segundo: Int = 0
    var pila: Int = 0


    constructor(h: Int, m: Int, s: Int) {
        this.hora = h
        this.minuto = m
        this.segundo = s
    }

    fun cambioFormato() : Int { // ! Para cambiar a formato 12 horas
        if (hora > 12) {
            hora -= 12
        }
        return hora
    }

    fun recargarPila() {
        do {
            pila += (0..99).random()
        } while (pila < 100)
    }

    override fun toString(): String {
        return "Reloj(hora=$hora, minuto=$minuto, segundo=$segundo)"
    }
}