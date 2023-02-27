class Coche {
    private var marca: String = ""
    private var modelo: String= ""
    private var matricula: String= ""
    private var color: String= ""

    private var velocidad = 0
    private var marcha = 0
    private var arrancado = false

    constructor(){
        marca = dameMarca()
        modelo = dameModelo()
        matricula = dameMatricula()
        color = dameColor()
        arrancado = false
    }

    constructor(marca: String, modelo: String) {
        this.marca = marca
        this.modelo = modelo
        matricula = dameMatricula()
        color = dameColor()
        arrancado = false
    }

    constructor(marca: String, modelo: String, color: String) {
        this.marca = marca
        this.modelo = modelo
        this.color = color
        matricula = dameMatricula()
        arrancado = false
    }

    fun getMarca(): String {
        return marca
    }

    fun getModelo(): String {
        return modelo
    }

    fun getMatricula(): String {
        return matricula
    }

    fun getColor(): String {
        return color
    }

    fun setMatricula(matricula: String) {
        this.matricula = matricula
    }

    fun setColor(color: String) {
        this.color = color
    }

    //********************** Métodos para conducir ******************
    fun acelerar() {
        velocidad += 5
        if (velocidad > 0 && velocidad < 30) {
            marcha = 1
        }
        if (velocidad >= 30 && velocidad < 50) {
            marcha = 2
        }
        if (velocidad >= 50 && velocidad < 70) {
            marcha = 3
        }
        if (velocidad >= 70 && velocidad < 100) {
            marcha = 4
        }
        if (velocidad >= 100) {
            marcha = 5
        }
    }

    fun acelerar(pisoton: Int) {
        velocidad += pisoton
        if (velocidad > 0 && velocidad < 30) {
            marcha = 1
        }
        if (velocidad >= 30 && velocidad < 50) {
            marcha = 2
        }
        if (velocidad >= 50 && velocidad < 70) {
            marcha = 3
        }
        if (velocidad >= 70 && velocidad < 100) {
            marcha = 4
        }
        if (velocidad >= 100) {
            marcha = 5
        }
    }

    fun decelerar() {
        velocidad -= 5
        if (velocidad > 0 && velocidad < 30) {
            marcha = 1
        }
        if (velocidad >= 30 && velocidad < 50) {
            marcha = 2
        }
        if (velocidad >= 50 && velocidad < 70) {
            marcha = 3
        }
        if (velocidad >= 70 && velocidad < 100) {
            marcha = 4
        }
        if (velocidad >= 100) {
            marcha = 5
        }
    }

    fun getVelocidad(): Int {
        return velocidad
    }

    fun getMarcha(): Int {
        return marcha
    }

    fun isArrancado(): Boolean {
        return arrancado
    }

    fun arrancarCoche() {
        arrancado = true
    }

    fun apagarCoche() {
        arrancado = false
    }

    override fun toString(): String {
        return "Coche{marca=$marca, modelo=$modelo, matricula=$matricula, color=$color}"
    }

    private fun dameMarca(): String {
        var marca = ""
        val alea = (Math.random() * 3).toInt()
        when (alea) {
            0 -> marca = "Citroen"
            1 -> marca = "Seat"
            2 -> marca = "Peugeot"
        }
        return marca
    }


    private fun dameModelo(): String {
        var modelo = ""
        val alea = (Math.random() * 3).toInt()
        when (alea) {
            0 -> modelo = "C5"
            1 -> modelo = "León"
            2 -> modelo = "508"
        }
        return modelo
    }

    //------------------------------------------------------------------
    private fun dameMatricula(): String {
        var matricula = ""
        val num = (Math.random() * 9000).toInt() + 1000
        val letra1 = ((Math.random() * 25).toInt().toChar().code + 65).toChar()
        val letra2 = ((Math.random() * 25).toInt().toChar().code + 65).toChar()
        val letra3 = ((Math.random() * 25).toInt().toChar().code + 65).toChar()
        matricula = num.toString() + letra1 + letra2 + letra3
        return matricula
    }

    //------------------------------------------------------------------
    private fun dameColor(): String {
        var modelo = ""
        val alea = (Math.random() * 3).toInt()
        when (alea) {
            0 -> modelo = "Rojo"
            1 -> modelo = "Negro"
            2 -> modelo = "Azul"
        }
        return modelo
    }

    fun frenazo() {
        velocidad = 0
        marcha = 0
        arrancado = false
    }

}