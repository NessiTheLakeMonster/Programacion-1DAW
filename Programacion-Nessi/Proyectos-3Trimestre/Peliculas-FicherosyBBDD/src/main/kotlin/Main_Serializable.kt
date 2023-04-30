import java.io.*

fun main() {
    var os: ObjectOutputStream? = null
    val peli = Pelicula()

    try {
        val fs = FileOutputStream("Peliculas.ser")
        os = ObjectOutputStream(fs)
        os.writeObject(peli)//El método writeObject() serializa el objeto y lo escribe en el archivo
    } catch (e: FileNotFoundException) {
        e.printStackTrace()
    } catch (e: IOException) {
        e.printStackTrace()
    } finally {
        os?.close()
    }

    try {
        val fis = FileInputStream("Peliculas.ser")
        val ois = ObjectInputStream(fis)
        var peli = ois.readObject() // Recupera el objeto
        ois.close()
    } catch (e: FileNotFoundException) {
        e.printStackTrace()
    } catch (e: IOException) {
        e.printStackTrace()
    } catch (e: ClassNotFoundException) {
        e.printStackTrace()
    }

}