import kotlin.math.max








/*fun main(){

    println("Enter the number of Subjects you have at school: ")
    var maxSize = readLine()!!.toInt()
    var listOfGrades: Array<Int> = Array(maxSize){0}
    var listOfSubjects: Array<String> = Array(maxSize){""}
    var j=0
    var avg = 0

    for(i in 0 until maxSize){
        println("Enter the name of subject number ${i+1}: ")
        listOfSubjects[i] = readLine()!!.toString()
        println("Enter the grade for ${listOfSubjects[i]}: ")
        listOfGrades[j] = readLine()!!.toInt()
        j++
    }
    j=0
    for(i in 0 until maxSize){
        println("In ${listOfSubjects[i]} Your grade is: ${listOfGrades[j]} ")
        avg = avg + listOfGrades[i] / maxSize
        j++

    }
    println("Average grade is: $avg")
}













/*
fun main() {

    println("Enter the number of the Subjects you have at school: ")
    var maxSize = readLine()!!.toInt()
    var listOfSubjects: Array<String> = Array(maxSize) { "" }
    var listOfGrades: Array<Int> = Array(maxSize) { 0 }
    var j = 0

    for (i in 0 until maxSize) {
        println("Enter your Subject number ${i + 1}: ")
        listOfSubjects[i] = readLine()!!.toString()
        println("Enter the grade for ${listOfSubjects[j]}: ")
        listOfGrades[j] = readLine()!!.toInt()
        j++
    }
    var value = 0
    j = 0
    for (i in 0 until maxSize) {
        println("In ${listOfSubjects[i]} You have scored ${listOfGrades[j]}")
        j++
        value += listOfGrades[i] / maxSize

    }
    println(value)

}







/*fun main(){

    println("Pets app")

    var listOfPets :Array<String> = Array(3){""} // If Int then initialize with 0

    for(i in 0 until 3){
        println("Enter pet ${i+1}: ")
        listOfPets[i] = readLine()!!.toString()
    }

    for(i in 0 until 3){
        println("Pet number ${i+1}: ${listOfPets[i]}")
    }

}



/*fun main(){

    println("Hey welcome to Arrays \n Please enter the number Subjects you have at school : ")
    var maxSize = readLine()!!.toInt()

    var subjects: Array<String> = Array(maxSize){""}
    var subjectNames: Array<String> = Array(maxSize){""}

    for(i in 0 until maxSize){
        println("Name of the Subject:  ")
        subjectNames[i] = readLine()!!.toString()

    }
    for (i in 0 until maxSize)
        println(" All of the Subjects ${subjectNames[i]}")

    }

/*fun main(){
    var num = 0


    for( i in 1..100){

        if(i % 2 == 0)
            println(i)

    }


    }

/*fun main() {

    var maxSize = readLine()!!.toInt()
    var listOfEvenNumber: Array<Int> = Array(maxSize) {0}

    for (i in 0 until maxSize) {
        println("Type your number in")
        listOfEvenNumber[i]= readLine()!!.toInt()
    }

    var result = listOfEvenNumber[1]+listOfEvenNumber[1]
    println("result: $result")


}

*/



// I did an additional task, I counted how many Even number there are between 1 and 100
/*fun main(){

    var count = 0


    println("Even numbers from 1 to 100")
    for(i in 1..100) {
        var check = i % 2
        if(check == 0) {
            println(i)
            count++
        }

    }
    println(count)
}


*/

/* Example of null safety too
fun main(){

    var condition: String = " "
loop@    for(i in 1..10) {
        println("For number $i. Enter your name")
        val name = readLine()!!.toString()
        println("Where you live")
        val LivingPlace = readLine()!!.toString()
        var petName: String = ""
        println("Enter number of pets: ")
        val numOfPets = readLine()!!.toInt()
        for (petID in 1..numOfPets) {
            println("Enter Pet:  $petID : ")
            petName = petName + readLine()!!.toString() + " , "
            println("Are there any more applicants? confirm with y/n ")
            condition = readLine()!!.toString()
            if(condition == "n")
                break@loop

        }

        println(" ======= User Info =========")
        println("Name: $name ")
        println("livePlace: $LivingPlace ")
        println("Pet name $petName")
        if(petName.contains("cat") || petName.contains("CAT") || petName.contains("Cat"))
            println("You have a cat haha, cat person")
        println(" =======   End    =========")



    }
}

*/