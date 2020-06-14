fun main(){

    println("Type in the number to find the factorial: ")
    val factorial = readLine()!!.toInt()
    var n = 1

    for(i in 1..factorial)
    {
        n = i * n

    }

    println("Factorial for $factorial is $n")
}