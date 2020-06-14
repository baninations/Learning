import java.util.*

fun main(){

    println(" Give your birth year: ")
    var InputAge = readLine()!!.toInt()

    val CurrentYear = Calendar.getInstance().get(Calendar.YEAR)
    val FindMyAge = CurrentYear-InputAge

    println("You should be $FindMyAge years old!")
}