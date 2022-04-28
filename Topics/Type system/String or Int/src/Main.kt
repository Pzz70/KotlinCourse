fun isNumber(input: String): Any {
    var output: Any
    try {
        output = input.toInt() ?: input
    } catch (e: NumberFormatException) {
        output = input
    }
    return output
}
