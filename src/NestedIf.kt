

fun main()
{
    println("Enter your grade: ")
    val grade = readLine()!!.toInt()

    if(grade > 90)
        if(grade >= 95)
            println("A+")
    else
        println("A-")
    else if(grade in 80..89)
        println("B")
    else if (grade in 70..79)
        if(grade in 70..74)
           println("C-")
    else
        println("C")

}