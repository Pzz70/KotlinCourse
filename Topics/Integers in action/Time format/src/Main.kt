fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    var secsLeft = totalSeconds
    val days = secsLeft / (24 * 60 * 60)
    secsLeft -= days * (24 * 60 * 60)
    val hours = secsLeft / (60 * 60)
    secsLeft -= hours * (60 * 60)
    val minutes = secsLeft / 60
    secsLeft -= minutes * 60
    val seconds = secsLeft
    println("$hours:$minutes:$seconds")
}
