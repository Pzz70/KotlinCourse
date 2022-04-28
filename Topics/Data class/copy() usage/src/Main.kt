// do not change this data class
data class Box(val height: Int, val length: Int, val width: Int)

fun main() {
    // implement your code here
    val boxAheight = readln().toInt()
    val boxAlength = readln().toInt()
    val boxBlength = readln().toInt()
    val boxAwidth = readln().toInt()
    val boxA = Box(boxAheight, boxAlength, boxAwidth)
    val boxB = boxA.copy(length = boxBlength)
    println(boxA)
    println(boxB)
}
