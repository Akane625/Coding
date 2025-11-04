fun addition(num1: Float?, num2: Float?): Float? = if ((num1 != null) && (num2 != null)) num1 + num2 else null

fun subtraction(num1: Float?, num2: Float?): Float? = if ((num1 != null) && (num2 != null)) num1 - num2 else null

fun multiplication(num1: Float?, num2: Float?): Float? = if ((num1 != null) && (num2 != null)) num1 * num2 else null

fun division(num1: Float?, num2: Float?): Float? = if (num1 != null && num2 != null && num2 != 0f) num1 / num2 else null

fun operation(choice: Int?): Float? {
    if (choice == null) return null

    print("Enter first number: ")
    val num1 = readln().toFloatOrNull()
    print("Enter second number: ")
    val num2 = readln().toFloatOrNull()

    return when (choice) {
        1 -> addition(num1, num2)
        2 -> subtraction(num1, num2)
        3 -> (multiplication(num1, num2))
        4 -> (division(num1, num2))
        else -> null
    }

}

fun main() {
    println("""
        Simple Calculator
        1) Addition
        2) Subtraction
        3) Multiplication
        4) Division
    """.trimIndent())
    print("> ")
    val choice = readln().toIntOrNull()

    val result = operation(choice)
    when {
        choice == null -> println("Invalid choice")
        result == null -> println("Invalid input or zero division error")
        else -> println(result)
    }
}
