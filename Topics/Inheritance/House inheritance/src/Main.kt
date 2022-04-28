fun main() {
    val rooms = readLine()!!.toInt()
    val price = readLine()!!.toInt()
    val house = House(rooms, price)
    println(totalPrice(house))
}

open class House(val rooms: Int, val price: Int) {

    fun factor(): Double {
        var factor: Double
        var correctedRooms = correctionRooms()
        factor = when {
            correctedRooms in 2..3 -> 1.2 // bungalow
            correctedRooms == 4 -> 1.25 // cottage
            correctedRooms in 5..7 -> 1.4 // mansion
            correctedRooms > 8 -> 1.6 // palace
            else -> 1.0 // cabin
        }
//        println("factor $factor")
        return factor
    }

    fun correctionRooms(): Int {
        var corrRooms: Int = 0
        if (this.rooms < 0) {
            corrRooms = 1
        } else {
            corrRooms = this.rooms
        }
//        println("corrRooms ${this.rooms} --> $corrRooms")
        return corrRooms
    }

    fun correctionBasePrice(): Int {
        var correctedBasePrice: Int = 0
        if (this.price > 1_000_000) {
            correctedBasePrice = 1_000_000
        } else if (this.price < 0) {
            correctedBasePrice = 0
        } else {
            correctedBasePrice = this.price
        }
//        println("correctedBasePrice ${this.price} --> $correctedBasePrice")
        return correctedBasePrice
    }

    fun totalPrice(): Int {
        return (this.correctionBasePrice() * this.factor()).toInt()
    }
}

fun totalPrice(house: House): Int {
    return house.totalPrice()
}


