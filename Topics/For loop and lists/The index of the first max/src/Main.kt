fun main() {
    // write your code here
    val numOfElements = readLine()!!.toInt()
    var maxElement: Int = 0
    var inputElement: Int
    var maxIndex : Int = 0
    for (i in 0 until numOfElements) {
        inputElement = readLine()!!.toInt()
        if (maxElement < inputElement) {
            maxElement = inputElement
            maxIndex = i
        }
    }
    println(maxIndex)
}
