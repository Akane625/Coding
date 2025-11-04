// Enhanced with DeepSeek

const val ADDITION = 1  // I don't see the use for constants
const val SUBTRACTION = 2
const val MULTIPLICATION = 3
const val DIVISION = 4
typealias BinaryOperation = (Float?, Float?) -> Float?  // Typealias (I don't see why do this)

fun addition(num1: Float?, num2: Float?): Float? = if ((num1 != null) && (num2 != null)) num1 + num2 else null

fun subtraction(num1: Float?, num2: Float?): Float? = if ((num1 != null) && (num2 != null)) num1 - num2 else null

fun multiplication(num1: Float?, num2: Float?): Float? = if ((num1 != null) && (num2 != null)) num1 * num2 else null

fun division(num1: Float?, num2: Float?): Float? {  // Improved division block
    return when {
        num1 ==null || num2 ==null -> null
        num2 ==0f -> {
            println("⚠️  Error: Division by zero is not allowed!")
            null
        }
        else -> num1 / num2
    }
}

fun readNumbers(): Pair<Float?, Float?> {  // This is how you tuple the vars
    print("Enter first number: ")
    val num1 = readln().toFloatOrNull()
    print("Enter second number: ")
    val num2 = readln().toFloatOrNull()

    return Pair(num1, num2)
}

fun isValidChoice(choice: Int?): Boolean = choice in ADDITION..DIVISION  // Restrict choice to 1..4

fun operation(choice: Int?): Float? {
    if (!isValidChoice(choice)) return null
    val (num1, num2) = readNumbers()  // Tuple unpack

    val operations: Map<Int, BinaryOperation> = mapOf(  // set typealias
        ADDITION to ::addition,
        SUBTRACTION to ::subtraction,
        MULTIPLICATION to ::multiplication,
        DIVISION to ::division
    )

    return operations[choice]?.invoke(num1, num2)  // call typealias
}

fun main() {
    println("""
        🧮 Simple Calculator
        1) Addition
        2) Subtraction
        3) Multiplication
        4) Division
    """.trimIndent())
    print("> ")
    val choice = readln().toIntOrNull()

    val result = operation(choice)
    when {
        choice == null -> println("❌ Invalid menu choice! Please enter 1-4.")  // Improved messages
        result == null -> println("❌ Invalid input! Check your numbers (division by zero not allowed).")
        else -> println("✅ Result: $result")
    }
}
