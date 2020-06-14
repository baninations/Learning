fun main(){


    println("Type in the year: ")

    var year = readLine()!!.toInt()
    val check = 4

    if(year % check == 0)
        println("$year is a leap year")
    else
        println("$year is not a leap year")

}