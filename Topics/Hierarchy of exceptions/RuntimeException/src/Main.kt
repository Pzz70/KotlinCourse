fun main() {
    try {
        // write your code here, do not touch the lines above
        val a = "a"
        a[2]
        // do not touch the lines below
    } catch (e: RuntimeException) {
        println("Well")
    } catch (e: Exception) {
        println("Wrong")
    }
}
