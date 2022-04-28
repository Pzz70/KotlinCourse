const val SPEEDCHANGE = 5

class Car(val make: String, val year: Int) {

    var speed: Int = 0

    // write the methods here
    fun accelerate() {
        speed += SPEEDCHANGE
    }

    fun decelerate() {
        speed -= SPEEDCHANGE
        speed = if (speed < 0) 0 else speed
    }
}
