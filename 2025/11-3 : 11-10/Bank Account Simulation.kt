class BankAccount(
    val accountNumber: String,
    val accountHolder: String,
    var accountBalance: Float
) {
    fun deposit(amount: Float) {
        accountBalance += amount
        println("Deposited: $$amount | New Balance: $$accountBalance")
    }

    fun withdraw(amount: Float) {
        if (amount > accountBalance) {
            println("Insufficient balance")
        } else {
            accountBalance -= amount
            println("Withdrawn: $$amount | New Balance: $$accountBalance")
        }

    }

    fun checkBalance(): Float {
        return accountBalance
    }
}

fun main() {
    val user = BankAccount("123456789","John Doe", 1000f)

    while(true) {
        println("""
            Bank Account
            Account Number: ${user.accountNumber}
            User: ${user.accountHolder}
            
            1) Deposit
            2) Withdraw
            3) Check Balance
            4) Eject Card
        """.trimIndent())
        print("> ")
        val choice =  readln().toIntOrNull()

        when (choice) {
            1 -> {
                print("Enter amount: ")
                val amount = readln().toFloatOrNull()
                if (amount != null && amount > 0) {
                    user.deposit(amount)
                } else {
                    println("Please enter a valid amount")
                }
            }
            2 -> {
                print("Enter amount: ")
                val amount = readln().toFloatOrNull()
                if (amount != null && amount > 0) {
                    user.withdraw(amount)
                } else {
                    println("Please enter a valid amount")
                }
            }
            3 -> println("Current Balance: ${user.checkBalance()}")
            4 -> {
                println("Dispensing card...")
                break
            }
            else -> println("Invalid input, please enter a number from 1-4")
        }
    }
}
