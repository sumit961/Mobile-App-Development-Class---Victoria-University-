class PersonalFinanceCalculator {
    val transactionList = mutableListOf<Transaction>()
    fun printGreeting() {
        println("Greetings! I am your personal finance calculator.")
    }

    fun saveTransaction(transaction: Transaction) {
        transactionList.add(transaction)
    }

    fun printAllTransactions() {
        transactionList.forEach {
            println("${it.name} $${it.getValue()}")
        }
    }
}