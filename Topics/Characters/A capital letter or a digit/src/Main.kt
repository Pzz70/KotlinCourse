fun main() {
    val teken = readLine()!!.first()
    println(teken.isUpperCase() || teken.isDigit() && teken.toString() != "0")
}
