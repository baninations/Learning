
fun main(){

    println("Type in a number to check if it is Even or Odd")
    val inputNum = readLine()!!.toInt()
    val check = inputNum % 2
    if(check == 0)
        println("$inputNum is an Even number")
    else
        println("$inputNum is an Odd number")

}