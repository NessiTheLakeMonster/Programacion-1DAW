import MujerGuerrera.*

class Tablero {
    var equipo1 = ArrayList<MujerGuerrera>()
    var equipo2 = ArrayList<MujerGuerrera>()

    val g = MujerGuerreraDAOImpl()

    /**
    fun crearMujeresGuerrerasEq1(min: Int, max: Int): ArrayList<MujerGuerrera> {
    val guerreras = g.getGuerreraByID(min, max)

    while (guerreras.size in min..max) {
    for (i in guerreras) {
    println(i.toString())
    addMujer(i)
    }
    }

    return equipo1
    }

    fun crearMujeresGuerrerasEq2(min: Int, max: Int): ArrayList<MujerGuerrera> {
    val guerreras = g.getGuerreraByID(min, max)

    for (i in guerreras) {
    println(i.toString())
    addMujer(i)
    }

    return equipo2
    }
     **/

    fun crearMujeresGuerrerasEq1(min: Int, max: Int): ArrayList<MujerGuerrera> {

        var id = min

        while (id in min..max) {
            var guerreras = g.getGuerreraByID2(id)
            equipo1.add(guerreras!!)
            println(guerreras)
            id++
        }

        return equipo1
    }

    fun crearMujeresGuerrerasEq2(min: Int, max: Int): ArrayList<MujerGuerrera> {

        var id = min

        while (id in min..max) {
            var guerreras = g.getGuerreraByID2(id)
            equipo2.add(guerreras!!)
            println(guerreras)
            id++
        }

        return equipo2
    }

    fun asignarTareasGuerreras(): ArrayList<Tarea> {
        val tareas = ArrayList<Tarea>()
        val t = FactoriaTarea.crearTareasGuerreras()
        tareas.add(t)
        println(t.toString())

        return tareas
    }

}
