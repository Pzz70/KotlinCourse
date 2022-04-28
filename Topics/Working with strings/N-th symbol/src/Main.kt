fun main() {
    // write your code here
    val text = readLine()!!
    val pos = readLine()!!.toInt()
    println("Symbol # $pos of the string \"$text\" is '${text[pos - 1]}'")
}
