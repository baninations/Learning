fun main() {

    println("Please enter the number of Subjects: ")
    var maxSize = readLine()!!.toInt()
    var listOfGrades: Array<Int> = Array(maxSize) { 0 }
    var listOfSubjects: Array<String> = Array(maxSize) { "" }

    for (i in 0 until maxSize) {
        var j = 0
        println("Type the name of your Subject ${i + 1}: ")
        listOfSubjects[i] = readLine()!!.toString()
        println("Type the grade for ${listOfSubjects[i]}")
        listOfGrades[j] = readLine()!!.toInt()
        j++
    }

    for(i in 0 until maxSize){
        var j=0
        println("You are graded in ${listOfSubjects[i]} with a ${listOfGrades[j]} .")
        j++

    }


}
/*

fun main(){

    println("How many placeholders do you need in your array: ")
    val maxSize = readLine()!!.toInt()

    /* println("Pets App, without Array:  ")
    val pet1 = readLine()!!.toString()
    val pet2 = readLine()!!.toString()
    val pet3 = readLine()!!.toString()

    println("Your pets Are: \n $pet1 \n $pet2 \n $pet3")
*/
    // Write app in array
    println("Pets App with array: ")
    var listOfPets: Array<String> = Array(maxSize){""}

    for(i in 0 until maxSize){
        println("Enter pet name number $i: ")
        listOfPets[i] = readLine()!!.toString()
    }

    for(i in 0 until maxSize) {
        println("Pet number :$i ${listOfPets[i]}")

        println("this is your third choice: ${listOfPets[2]}")


        /*   var listOfPets: Array<String> = Array(3){""}
           listOfPets[0] = readLine()!!.toString()
           listOfPets[1] = readLine()!!.toString()
           listOfPets[2] = readLine()!!.toString()
       */
    }


}
*/


