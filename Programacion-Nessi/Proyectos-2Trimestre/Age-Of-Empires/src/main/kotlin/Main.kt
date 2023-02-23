// Elena, Ramón e Inés

fun main() {

    val TIEMPOMAX = 1 // minutos
    var tiempoTranscurrido = 0 // segundos

    val nomAldeanosEsp = arrayListOf("Anastasio", "Rigoberto", "Ezequiel", "Ataulfo", "Anacleto", "Ermenegildo", "Estanislao", "Urbano", "Malaquías", "Segismundo", "Policarpo", "Nicereto", "Urbano", "Marciano el Ejecutor", "Cayetano", "Gromenagüer")
    val nomAldeanosBiz = arrayListOf("Jelani", "Barani", "Jabari", "Devak", "Raldin", "Telash", "Ajheed", "Narphet", "Khaleel", "Phaet", "Geshef", "Vanji", "Haphet", "Thadar", "Yatiraj", "Rhadge", "Yashied", "Jarulf", "Flux", "Scorch")

    var default_mina = Mina() // Creamos una mina por defecto
    var Hispania = Civilizacion("Isabel I", "Hispania")
    var Bizancio = Civilizacion("Constantino II", "Bizancio")
        
    do {
        var probabilidad = (0..100).random()

        minar(default_mina, Hispania, Bizancio)
        println("A la mina le quedan ${default_mina.cantera} unidades de ${default_mina.tipo}.")
        println("Los españoles tienen ${Hispania.almacen} unidades de ${default_mina.tipo}.")
        println("Los bizantinos tienen ${Bizancio.almacen} unidades de ${default_mina.tipo}.")

        if (tiempoTranscurrido % 2 == 0) {
            if (probabilidad < 40) {
                agregarTrabajador(Hispania, default_mina,  nomAldeanosEsp, 200)
                //println("${Hispania.poblacion[Hispania.poblacion.size-1].nombre} ha empezado a trabajar en la mina.")

            } else if (probabilidad in 40..60){
                agregarTrabajador(Bizancio, default_mina,  nomAldeanosBiz, 250)
            } // El resto de veces no se crean aldeanos
        }

        println("En la mina hay doblando el lomo ${Hispania.poblacion.size} aldeanos españoles y ${Bizancio.poblacion.size} bizantinos.")

        if (tiempoTranscurrido % 5 == 0 && Hispania.poblacion.size > 0) {
            convertirAldeano(Hispania, Bizancio)
        }

        tiempoTranscurrido++
        println("Han transcurrido ${tiempoTranscurrido} segundos.\n")
    } while (tiempoTranscurrido < TIEMPOMAX * 60 && default_mina.cantera > 0)

    if (default_mina.cantera < 0){
        println("Se ha sobreexplotado la mina.")
    }
}

fun minar(mina: Mina, civilizacion1: Civilizacion, civilizacion2: Civilizacion){
    mina.cantera -= mina.trabajadores.size
    civilizacion1.almacen += civilizacion1.poblacion.size
    civilizacion2.almacen += civilizacion2.poblacion.size
}

fun agregarTrabajador(civilizacion: Civilizacion, mina: Mina, nombres:ArrayList<String>, salud:Int){
    var nuevoAldeano = Aldeano(nombres, salud)
    civilizacion.poblacion.add(nuevoAldeano)
    mina.trabajadores.add(nuevoAldeano)
    println("${nuevoAldeano.nombre} de ${civilizacion.nombre} ha empezado a trabajar en la mina.")//no se deberian hacer dos cosas en una funcion pero el print es mas facil asi
}

fun convertirAldeano(civOrigen: Civilizacion, civDestino: Civilizacion) {
    val ALDEANO = civOrigen.devolverAldeano()
    civOrigen.poblacion.remove(ALDEANO)
    civDestino.poblacion.add(ALDEANO)
    println("El desertor ${ALDEANO.nombre} de ${civOrigen.nombre} se ha unido a ${civDestino.nombre}.")
}