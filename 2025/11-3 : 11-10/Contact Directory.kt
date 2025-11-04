var contacts = mutableMapOf<String, String>()

fun showContact() {
    if (contacts.isNotEmpty()) {
        contacts.entries.withIndex().forEach {
                (i, j) -> println("${i + 1}. ${j.key.replaceFirstChar { it.uppercase() }} - ${j.value}")
        }
    } else {
        println("Contact list is empty")
    }
}
fun addContact() {
    print("Enter manager name: ")
    val managerName = readln().lowercase()
    print("Enter phone number: ")
    val phoneNumber = readln()
    contacts[managerName] = phoneNumber
    println("Contact added")

    showContact()
}

fun searchContact() {
    if (contacts.isNotEmpty()) {
        showContact()

        print("Enter manager name: ")
        val managerName = readln().lowercase()
        if (managerName in contacts) {
            println("Name: ${managerName.replaceFirstChar { it.uppercase() }}, Number: ${contacts[managerName]}")
        } else {
            println("Contact doesn't exist")
        }
    } else {
        println("Contact is empty")
    }
}

fun removeContact() {
    if (contacts.isNotEmpty()) {
        showContact()

        print("Enter manager name: ")
        val managerName = readln().lowercase()
        if (managerName in contacts) {
            contacts.remove(managerName)
            println("Contact removed")
        } else {
            println("Contact doesn't exist")
        }

        showContact()

    } else {
        println("Contacts list is empty")
    }
}

fun main() {
    while(true) {
        println("""
            Contact Manager
            1) Add Contact
            2) Search Contact
            3) Remove Contact
            4) Terminate Program
        """.trimIndent())
        print("> ")
        val choice = readln().toIntOrNull()

        when (choice) {
            1 -> addContact()
            2 -> searchContact()
            3 -> removeContact()
            4 -> {
                println("Closing Program...")
                break
            }
            else -> {
                println("Invalid input, please try again.")
                continue
            }
        }
        println()
    }
}
