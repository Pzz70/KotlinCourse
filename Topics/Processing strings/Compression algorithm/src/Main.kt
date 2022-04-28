fun main() {
    // write your code here
    val dna = readLine()!!
    var dnaAbr: String? = null
    var last: String? = null
    var teller: Int = 0
    for (i in dna) {
        if (last.isNullOrBlank()) {
            last = i.toString()
            ++teller
        } else {
            if (last == i.toString()) {
                ++teller
            } else {
                if (dnaAbr.isNullOrBlank()) {
                    dnaAbr = last + teller
                } else {
                    dnaAbr += last + teller
//                    println("$last$teller")
                }
                last = i.toString()
                teller = 1
            }
        }
    }
    if (dnaAbr.isNullOrBlank()) {
        println("$last$teller")
    } else {
        println("$dnaAbr$last$teller")
    }
}


