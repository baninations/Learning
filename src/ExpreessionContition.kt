fun main(){

    val isMarried = true
    val GPA = 4.0

    val isQualified = if (isMarried == false && GPA > 3.5) 1 else 0

    println(isQualified)

    val isGood = when(GPA){

         4.0 -> true
        else -> false
    }


        println(isGood)

}