fun main() {
    val pfcInstance = PersonalFinanceCalculator()
    pfcInstance.printGreeting()
    println("\nEnter your name: ")
    val name = readln()
    println("\nEnter the sum of your current savings: ")
    val savings = readln()
    val person = Person(name = name, savings = savings.toDouble())
    var exit = "no"
    while (exit != "yes") {
        println("\n\nHi ${person.name} your current savings is $${person.savings}")
        println("\nDo you wish to exit ('yes' to exit): ")
        exit = readln()
    }
}