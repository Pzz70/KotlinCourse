fun main() {
    // put your code here
    val a = readLine()!!.toInt()
    val b = a % 10
    val c = (a - b) / 10 % 10
    val d = (a - b - c) / 100 % 10
   println(b + c + d)
}
