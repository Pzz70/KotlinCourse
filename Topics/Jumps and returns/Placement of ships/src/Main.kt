const val shipCount = 3

fun main() {
    // put your code here
    val columns = mutableListOf<Int>(1, 2, 3, 4, 5)
    val rows = mutableListOf<Int>(1, 2, 3, 4, 5)

    for (i in 1..shipCount) {
//        print("Schip $i: ")
        var ship = readLine()!!.split(" ")
        var x = ship[0].toInt()
        columns.remove(x)
        var y = ship[1].toInt()
        rows.remove(y)
    }

    var uitvoer: String = ""

    for (i in 0..columns.size - 1) {
        uitvoer = uitvoer + columns[i] + " "
    }
    println("${uitvoer?.trim()}")
    uitvoer = ""
    for (j in 0..rows.size - 1) {
        uitvoer = uitvoer + rows[j] + " "
    }
    println("${uitvoer?.trim()}")

}
