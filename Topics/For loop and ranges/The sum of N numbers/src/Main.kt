fun main() {
    val numbers = readLine()!!.toInt()
    var numSum = 0
    for (i in 1..numbers) {
        val number = readLine()!!.toInt()
        numSum += number
    }
    println(numSum)
}
