fun main() {
    val students = readLine()!!.toInt()
    var grA: Int = 0
    var grB: Int = 0
    var grC: Int = 0
    var grD: Int = 0
    repeat(students) {
        val grade = readLine()!!.toInt()
        if (grade == 2) {
            grD++
        }
        if (grade == 3) {
            grC++
        }
        if (grade == 4) {
            grB++
        }
        if (grade == 5) {
            grA++
        }
    }
    println("$grD $grC $grB $grA")
}
