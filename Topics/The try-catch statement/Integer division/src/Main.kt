fun intDivision(x: String, y: String): Int {
    var res: Int = 0
    try {
        res = x.toInt() / y.toInt()
    } catch (e: ArithmeticException) {
        println("Exception: division by zero!")
    } catch (e: NumberFormatException) {
        println("Read values are not integers.")
    }
    return res
}

fun main() {
    val x = readLine()!!
    val y = readLine()!!
    println(intDivision(x, y))

}
