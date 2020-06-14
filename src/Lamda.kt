
// Lamda expresison instead of full function. compare this with the below function
    val sumi = {num1:Int, num2: Int ->
    num1+num2}

// normal function
fun sum(Num1: Int, Num2: Int): Int{
    return Num1 + Num2
}


fun main(){

    val addNums = sum(3,4)
    println(addNums)

    println(sumi(3,4))


    println("---------------------------------------------------")
    val listOfNumbers = listOf(10,15,22,34,80)

    for(number in listOfNumbers)
        println("$number")
println("---------------------------------------------------")
  // Lamda version of For loop like the one above
    listOfNumbers.forEach{number ->
        println("$number")
    }



}