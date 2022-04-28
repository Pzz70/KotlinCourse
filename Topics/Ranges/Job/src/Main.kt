import javax.swing.plaf.basic.BasicInternalFrameTitlePane

fun main() {
    // write your code here
    val age = readLine()!!.toInt()
    val minAge : Int = 18
    val maxAge : Int = 59
    println(age >= minAge && age <= maxAge)
}
