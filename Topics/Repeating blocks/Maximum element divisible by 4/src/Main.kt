fun main() {
    val elements = readLine()!!.toInt()
    var maxElement: Int = 0
    repeat(elements) {
        val element = readLine()!!.toInt()
        if (element % 4 == 0 && element > maxElement) maxElement = element
    }
    println(maxElement)
}
