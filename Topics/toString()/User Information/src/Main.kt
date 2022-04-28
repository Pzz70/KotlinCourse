class CustomerInfo(
    /** Unique user id */
    val uid: String,
    /** Operation system: Windows, Linux, macOS, iOS */
    val operationSystem: String,
    /** In GB */
    val ram: Int,
    /** In GHz */
    val coreSpeed: Double,
    val timeStamp: Long
) {
    override fun toString(): String {
        return "Id: ${this.uid}; Operation System: ${this.operationSystem}; RAM: ${this.ram}; Core Speed: ${this.coreSpeed}; Timestamp: ${this.timeStamp}"
    }
    //put your code here  
}

fun sendCustomerInfoToServer(customer: CustomerInfo) {
    Server.send(customer.toString())
}
