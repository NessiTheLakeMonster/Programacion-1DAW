# Funciones más utilizadas

Crear lo importante y meter las cosas en la array list poniendo nombre automaticamente
```kotlin
fun crearBatallon(c: Int, n: String) { // c es la cantidad de gente que se va a meter
    for (i in 1..c) {
        var s = Soldado(n + "_" + i)
        batallon.add(s)
    }
}
```

```kotlin
fun addSoldado(s: Soldado) {
    batallon.add(s)
}

fun removeSoldado(s: Soldado) {
    batallon.remove(s)
}
```

Elegir un soldado random para pelear
```kotlin
 import kotlin.random.Random
 fun soldadoPelear(): Soldado {
    var n = Random.nextInt(0,batallon.size)
     return batallon[n]
}
```

-------------------------------------------------------------------

Crear un tablero de 3x4 de objetos casilla
```kotlin
var t = Array(3) { arrayOfNulls<Casilla>(4) }
```

