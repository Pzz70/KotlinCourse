import kotlin.math.*

fun main() {
    val (x1, y1) = readln().split(" ")
    val (x2, y2) = readln().split(" ")
    val x = abs(x1.toInt() - x2.toInt())
    val y = abs(y1.toInt() - y2.toInt())
    println(if (x == 1 && y == 2 || x == 2 && y == 1) "YES" else "NO")

}
