var container = mutableMapOf<String, Double>()

fun viewExpenses(): String {
    return if (container.isNotEmpty()) {
        container.entries.withIndex().joinToString("\n") { (i, entry) ->
            "${i + 1}.) ${entry.key} ₱${"%.2f".format(entry.value)}"
        }
    } else {
        "Tracker is empty"
    }
}

fun addExpense() {
    print("Add expense: ")
    val expense = readln().trim()
    if (expense.isEmpty()) {
        println("Please enter an expense")
        return
    }

    print("Add expense price: ")
    val price = readln().toDoubleOrNull()
    if (price != null && price > 0) {
        container[expense] = price
        println("$expense added")
    } else {
        println("Please enter a valid positive number")
    }
}

fun removeExpense() {
    if (container.isEmpty()) {
        println("Tracker is empty")
        return
    }

    print("Enter name of expense to remove: ")
    val name = readln().trim()
    if (container.remove(name) != null) {
        println("$name removed")
    } else {
        println("$name not found")
    }
}

fun main() {
    while (true) {
        println("""
        Expense Tracker
        
        ${viewExpenses()}
        
        Total Spent: ₱${"%.2f".format(container.values.sum())}
        Average Expense: ₱${if (container.isNotEmpty()) "%.2f".format(container.values.average()) else "0.00"}
        Highest Expense: ₱${container.values.maxOrNull()?.let { "%.2f".format(it) } ?: "0.00"}
        Lowest Expense: ₱${container.values.minOrNull()?.let { "%.2f".format(it) } ?: "0.00"}
        
        1) Add Expense
        2) Remove Expense
        3) End program
    """.trimIndent())
        print("> ")
        val choice = readln().trim()

        when (choice) {
            "1" -> addExpense()
            "2" -> removeExpense()
            "3" -> {
                println("Shutting down...")
                break
            }
            else -> println("Invalid choice")
        }
        println()
    }
}
