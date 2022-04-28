// complete this function
fun greetings(name: String? = null): String {
    var hello: String? = name
    if (name == null || name.isEmpty()) {
        hello = "Hello, secret user!"
    } else {
        hello = "Hello, ${name}!"
    }
    return hello
}
