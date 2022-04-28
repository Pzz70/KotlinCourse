fun main() {
    val val1 = readLine()!!.toInt()
    val val2 = readLine()!!.toInt()
    val val3 = readLine()!!.toInt()
    val val4 = readLine()!!.toInt()
    val val5 = readLine()!!.toInt()
    val range1 = val1..val2
    val range2 = val3..val4
    println(val5 in range1 && val5 in range2)
}
