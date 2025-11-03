fun celsiusToFahrenheit(temperature: Float): Float = (temperature * (9f / 5f)) + 32

fun fahrenheitToCelsius(temperature: Float): Float = (temperature - 32) * (5f / 9f)

fun celsiusOrFahrenheit(temperature: Float) {
    print("Is it in °C or °F: ")
    val choice = readln().uppercase()

    return when (choice) {
        "C" -> println("Temperature in Fahrenheit: %.2f°F".format(celsiusToFahrenheit(temperature)))
        "F" -> println("Temperature in Celsius: %.2f°C".format(fahrenheitToCelsius(temperature)))
        else -> println("Invalid choice")
    }
}

fun main() {
    print("Enter temperature: ")
    val temperature = readln().toFloatOrNull()

    if (temperature != null) {
        celsiusOrFahrenheit(temperature)
    }
    else {
        println("Invalid input, please enter a number")
    }
}
