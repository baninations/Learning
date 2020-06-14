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