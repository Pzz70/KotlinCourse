fun main() {
    // write your code here
//    print("aantal in te voeren nummers: ")
    val n = readLine()!!.toInt()
    val lijst = mutableListOf<Int>()
    for (i in 1..n) {
//        print("nummer $i van $n: ")
        lijst.add(readLine()!!.toInt())
    }
//    print("te tellen nummer: ")
    val m = readLine()!!.toInt()
    var teller: Int = 0

    for (j in lijst) {
        if (j == m) ++teller
    }
    println(teller)
}

