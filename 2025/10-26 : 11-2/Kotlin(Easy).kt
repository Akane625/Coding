import kotlin.random.Random	

fun max(list: Array<Int>): Int{
    var high = list[0]
    for (i in list) {
        if (i > high) {
            high = i
        }
    }
    return high
}

fun min(list: Array<Int>): Int{
    var low = list[0]
    for (i in list) {
        if (i < low) {
            low = i
        }
    }
    return low
}

fun main() {
    val numbers = Array(10) {Random.nextInt(1, 100)}
    println("List: ${numbers.contentToString()}")
    println("Sorted List: ${numbers.sortedArray().contentToString()}")
    println("Highest Number: ${max(numbers)}")
    println("Lowest Number: ${min(numbers)}")
}
