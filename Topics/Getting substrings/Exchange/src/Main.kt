fun main() {
    // put your code here
    val text = readLine()!!
    println(text[text.length - 1] + text.substring(1, text.length - 1) + text[0])
}
