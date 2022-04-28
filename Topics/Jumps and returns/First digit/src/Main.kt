fun main() {
    // put your code here
    val numbers = listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "0")
    val text = readln()
    for (i in text.indices) {
        if (text[i].toString() in numbers) {
            println("${text[i]}")
            break
        }
    }
}
