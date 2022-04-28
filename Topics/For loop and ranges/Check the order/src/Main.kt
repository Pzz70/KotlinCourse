fun main() {
    var lastNum: Int = 0
    val numOfNums = readLine()!!.toInt()
    var fout: Boolean = false
    for (i in 1..numOfNums) {
        val number = readLine()!!.toInt()
        if (number >= lastNum) lastNum = number else fout = true
    }
    if (fout) println("NO") else println("YES")
}
