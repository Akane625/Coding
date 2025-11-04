fun main() {
    val storedName = "john doe"
    val storedPass = "123456"

    print("Username: ")
    val username = readln().lowercase()
    print("Password: ")
    val password = readln().trim()

    if (username == storedName && password == storedPass) {
        println("Login Successful")
    } else {
        println("Invalid Credentials")
    }

}
