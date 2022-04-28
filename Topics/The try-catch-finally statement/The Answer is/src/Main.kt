const val DEFAULTANSWER = 42
fun main() {
    val answer: Int = try {
        readLine()!!.toInt()
    } catch (e: Exception) {
        DEFAULTANSWER
    } finally {
        println("The answer is a number")
    }
    println(answer)
}
