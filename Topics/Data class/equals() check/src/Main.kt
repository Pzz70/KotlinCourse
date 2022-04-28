data class Client(val name: String, val age: Int, val balance: Int)

fun main() {
    //implement your code here
    val client1_name = readln()
    val client1_age = readln().toInt()
    val client1_balance = readln().toInt()
    val client2_name = readln()
    val client2_age = readln().toInt()
    val client2_balance = readln().toInt()
    val client1 = Client(name = client1_name, age = client1_age, balance = client1_balance)
    val client2 = Client(client2_name, client2_age, client2_balance)
    println(client1.name == client2.name && client1.age == client2.age)
}
