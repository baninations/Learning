package Training

fun main(){

    //  capitalizeSentences()
    //  getOddNumbers()
    //  reverseArray(arrayOf(1,5,76,2,4,5))
    //  isPalindromeOrNor(arrayOf(1,2,3,4,5,4,3,2,1))
        flattenListOf()
}

fun capitalizeSentences(){
    var flower = "flower"
    var house = "this is a house"



    println(house.capitalize())
}
fun getOddNumbers(){

    var numbers = arrayListOf<Int>(1,5,7,21,324,2356,23,4)

    for(num in numbers)
       if( num % 2 == 0)
        println(num)



}
fun reverseArray(listOfNumber: Array<Int>){

    var length = listOfNumber.size -1
    for(i in length downTo 0){
      println(listOfNumber[i])
   }


}
fun isPalindromeOrNor(listOfNumbers: Array<Int>){

    var length: Int  = listOfNumbers.size
    var middle: Int = length / 2
    var beforeN = ArrayList<Int>()
    var afterN = ArrayList<Int>()

    println(length)

   for(i in 0..length){
       if(i < middle)
       beforeN.add(listOfNumbers[i])
   }

    for(i in length -1 downTo 0){
        if (i > middle)
            afterN.add(listOfNumbers[i])
    }

    if(beforeN == afterN)
     println("True")
    else
     println("False")
}

fun flattenListOf(){

    var kali = (listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8))))
    var newArray1 = arrayListOf<Any>()
    var newArray2 = arrayListOf<Any>()
    var newArray3 = arrayListOf<Any>()
    var newArray4 = arrayListOf<Any>()
    var newArray5 = arrayListOf<Any>()

    newArray1.add(kali[0])
    newArray2.add(kali[1])
    newArray3.add(kali[2])
    println(kali[2])
    println(newArray3[0])

    newArray4.add(newArray3[0])
    println(newArray4[0])


   // println("$newArray1 \n $newArray2 \n $newArray3")


}