class PersonalFinanceCalculatorT {  //R is added because we can not write same class again.
    val transactionList = mutableListOf<Transaction>()
    fun printGreeting() {
        println("Greetings! I am your personal finance calculator.")
    }
    fun saveTransaction(transaction: Transaction) {
        transactionList.add(transaction)
    }
}