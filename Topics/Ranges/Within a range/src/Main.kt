fun main() {
    val rg1a = readLine()!!.toInt()
    val rg1b = readLine()!!.toInt()
    val rg2a = readLine()!!.toInt()
    val rg2b = readLine()!!.toInt()
    val waarde = readLine()!!.toInt()
    println(waarde in rg1a..rg1b || waarde in rg2a..rg2b)
}
