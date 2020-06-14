

fun main(){

    println("Give your age: ")
    val age = readLine()!!.toInt()

    if(age >= 18)
        println("You could apply for the Job")
    else
        println("You can not apply for the Job")

    println("END APP")
}