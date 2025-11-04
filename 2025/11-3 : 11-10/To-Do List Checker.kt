var tasks = mutableListOf<String>()

fun addTask() {
    print("Enter task: ")
    val task = readln()
    tasks.add(task)
    println("Task has been recorded")
}

fun viewAllTasks() = if (tasks.isNotEmpty()) tasks.withIndex().forEach{ (index , item) -> println("${index + 1}: $item") } else println("To-Do List is Empty")

fun removeTask() {
    if (tasks.isNotEmpty()) {
        tasks.withIndex().forEach { (index, item) -> println("${index + 1}: $item") }
        print("What task do you want to remove (enter index): ")
        val remove = readln().toIntOrNull()

        when {
            remove == null -> println("Invalid input")
            remove < 1 || remove > tasks.size -> println("Out of range. (Number of tasks: ${tasks.size})")
            else -> {
                tasks.removeAt(remove - 1)
                println("Task has been removed")
            }

        }
    } else {
        println("To-Do List is Empty")
    }
}

fun main() {
    while (true) {
        println("""
        To-Do List:
        1) Add Task
        2) View All Tasks
        3) Remove Task
        4) End Program
        """.trimIndent())
        print("> ")
        val choice = readln().toIntOrNull()

        when (choice) {
            1 -> addTask()
            2 -> viewAllTasks()
            3 -> removeTask()
            4 -> {
                println("Terminating program...")
                break
            }
            else -> println("Invalid input")
        }
        println()
    }
}
