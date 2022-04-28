/*
import kotlin.math.roundToInt

fun main() {
    val productType = readLine()!!
    val price = readLine()!!.toInt()
    val product = Product(price = price, productType = productType)
    println(totalPrice(product = product))
}

class Product(val price: Int, val productType: String) {
    fun getTax(): Int {
        return when (productType) {
            "headphones" -> 11
            "smartphone" -> 15
            "tv" -> 17
            "laptop" -> 19
            else -> 0
        }
    }

    fun getTotalPrice(): Int {

//        println(this.getTax())
        return this.price + this.price * this.getTax() / 100
    }
}

fun totalPrice(product: Product): Int {
    return product.getTotalPrice()
}

*/

fun main() {
    val factory = FactoryWithRoof(3, 2, 23000)
    print(factory.employeesPerFloor())
}

open class Facility(val floors: Byte) {
    fun addFloors(num: Byte): Int = floors + num
}

open class Factory(floors: Byte, val employees: Short, val roof: Byte) : Facility(floors) {
    fun buildRoof(): Int = super.addFloors(roof)
    open fun employeesPerFloor(): Int = employees / floors
}

open class FactoryWithRoof(floors: Byte, roof: Byte, employees: Short) : Factory(floors, employees, roof) {
    override fun employeesPerFloor(): Int = employees / (floors + super.buildRoof())
}
