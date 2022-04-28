fun main() {
    val variabele = readLine()!!.toInt()
    val ran1 = readLine()!!.toInt()
    val ran2 = readLine()!!.toInt()
    print(ran1 < ran2 && variabele in ran1..ran2)
}
