// SOLUCIÓN MARCIANO

fun seCruzaGato(): Boolean {
    var frenazo = false
    val gato = (Math.random() * 100).toInt()
    if (gato < 10) {
        frenazo = true
    }
    return frenazo
}

fun main(args: Array<String>) {
    var c = Coche()
    var c2 = Coche("Opel","Vectra")
    var c3 = Coche("Citroen","B11","Rojo")

    println(c)
    println(c2)
    println(c3)
    println(c3.getMatricula())
    if (c.getColor().equals(c2.getColor())){
        System.out.println("Color igual")
    }
    else {
        System.out.println("Pues no")
    }
    c2.setColor("Amarillo")
    println(c2)

//Ejercicio Coche sin velocidades.
    val parque = arrayOfNulls<Coche>(4)
    for (i in parque.indices) {
        parque[i] = Coche()
    }
    for (i in parque.indices) {
        println(parque[i].toString())
    }

//Ejercicio simulación del coche.
    var c4 = Coche()
    println(c4);
    var tiempo = 4;
    var velMax = 120;
    var frenazo:Boolean = false;

    if (!c.isArrancado()) {
        println("Arrancando coche...");
        c.arrancarCoche();
        println("Coche arrancado");
    }

    //Acelerar
    while (c.getVelocidad() < velMax && !frenazo) {
        c.acelerar();
        println(c.getVelocidad().toString() + " en " + c.getMarcha());
        Thread.sleep(200);
        frenazo = seCruzaGato();
    }
    //Mantener
    var t = 1;
    while (t <= tiempo && !frenazo) {
        println("Manteniendo velocidad de crucero: " + c.getVelocidad() + " " + c.getMarcha());
        Thread.sleep(200);
        t++;
        frenazo = seCruzaGato();
    }
    //Frenar
    while (c.getVelocidad() > 0 && !frenazo) {
        c.decelerar();
        println(c.getVelocidad().toString() + " en " + c.getMarcha());
        Thread.sleep(200);
        frenazo = seCruzaGato();
    }
    if (frenazo) {
        c.frenazo();
        println("Casi pillas un gato.");
    } else {
        println("Parando el coche...");
        c.apagarCoche();
    }
    println("Fin de la simulación.");

}
