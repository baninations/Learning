

fun main(){
    println("Give in food ID to order: ")
    val foodId = readLine()!!.toInt()

    /*
    when(foodId){


        1 -> {
            println("Cucumber")
        }

        2 -> println("Chocolate")

        95 -> println("Burger, cheat day!!!")
        else ->
            println("pick food man")

            when{

            foodId in 1..9 -> println("Healthy foods")
            foodId in 10..19 -> println("Not so OK foods")
            foodId in 100..999 -> println("You should not eat that!!")
            else -> println("Choose a valid foodId given to you in your card")

*/




    when (foodId) {
        in 1..9 -> println("Healthy foods")
        in 10..19 -> println("Not so OK foods")
        in 100..999 -> println("You should not eat that!!")
        else -> println("Choose a valid foodId given to you in your card")
    }

}