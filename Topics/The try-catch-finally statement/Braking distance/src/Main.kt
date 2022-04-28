import kotlin.math.absoluteValue

fun calculateBrakingDistance(v1: String, a: String): Int {
    try {
        val v = v1.toInt()
        val a1 = a.toInt().absoluteValue
        return (v * v) / (2 * a1)
    } catch (e: ArithmeticException) {
        println("The car does not slow down!")
        return -1
    } catch (e: NumberFormatException) {
        println(e.message)
        return -1
    } catch (e: Exception) {
        return -1
    }
}
