fun main() {
    val n = readLine()!!.toInt()
    var tooBig: Int = 0
    var tooSmall: Int = 0
    var perfect: Int = 0
    var piece: Int
    repeat(n) {
        piece = readLine()!!.toInt()
        if (piece == -1) {
            tooSmall++
        } else if (piece == 1) {
            tooBig++
        } else {
            perfect++
        }
    }
    println("$perfect $tooBig $tooSmall")
}
