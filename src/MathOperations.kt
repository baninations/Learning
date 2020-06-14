fun main(){

    println("Enter number 1: ")
    val num1 = readLine()!!.toInt()
    println("Enter number 2: ")
    val num2 = readLine()!!.toInt()
    //or you could just initialize the variables
    //val num1 = 20
    //val num2 = 4

    val sum = num1 + num2
    println("Sum: $sum")

    val sub = num1 - num2
    println("Sum: $sub")

    val mul = num1 * num2
    println("Sum: $mul")

    val div = num1 / num2
    println("Sum: $div")

}