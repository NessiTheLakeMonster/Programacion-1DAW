fun main(args: Array<String>) {

    Soldado.creadosPorDios = 7
    Soldado.miPais()

    println(Soldado.CuantosHanNacido())
    println(Soldado.miPais())

    //creo un objeto
    var uno = Soldado()
    println(Soldado.CuantosHanNacido())

    //al hacer privado equipo y no tener ni get ni set no se puede modificar
    var dos = Soldado()

    println(uno)
    println(dos)

    //cambiamos el pais en uno de los objetos
    uno.cambiarpais("Aragón")

    //vemos que ha cambiado en los dos objetos, pues es una variable de la clase no del objeto en particular
    println(uno)
    println(dos)

    println(Soldado.miPais())



    ///probamos el arraylist
    var primerbatallon = Ejercito(15, "Primer Batallon")
    primerbatallon.revisionEjercito()


}