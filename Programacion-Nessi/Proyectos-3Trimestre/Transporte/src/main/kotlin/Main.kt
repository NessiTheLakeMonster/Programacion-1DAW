fun main(args: Array<String>) {
    val N = 3
    var ciudad = Array<IntArray>(N){IntArray(N)}

    for (i in 0 until ciudad.size) {
        for (j in 0 until  ciudad[0].size) {
            print(ciudad[i][j])
        }
        println()
    }
}