

fun main(){

    println("Enter your grade: ")
    val grade = readLine()!!.toInt()

    if(grade >= 90) {
        println("A")
    }
    if(grade >=80 && grade < 90)
        println("B")
    if(grade in 70..79)
        println("C")

    if(grade <= 69)
        println("Fail")

    println("End of App")


}