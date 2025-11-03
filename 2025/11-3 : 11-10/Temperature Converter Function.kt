fun convert(celsius: Float?): Any {
    return if (celsius != null) {
        (celsius * (9f / 5f)) + 32
    } else {
        "Need a number"
    }

}

fun main() {
    print("Enter temperature in °C: ")
    val celsius = readln().toFloatOrNull()

    println("Temperature in °F: ${convert(celsius)}")
}
