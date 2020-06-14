

/*fun arrayManipulation(n: Int) {

        var listOfChars = charArrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'z')
            if (n in 0..7) {

            var afterN = ArrayList<Char>()
            var beforeN = ArrayList<Char>()

            for (char in listOfChars) {
                if (char <= listOfChars[n])
                    beforeN.add(char)

            }
            val remainder = listOfChars.count()
            var iAfterN = remainder - n - 1

            for (char in listOfChars) {
                if (char > listOfChars[n])
                    afterN.add(char)
            }

            val mergerOfArray = afterN + beforeN
            println(mergerOfArray)
        }
    }











}
*/
fun main(){
   arrayManipulation(2, charArrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'z'))
}
fun arrayManipulation(index:Int, listOfChars: CharArray){

    var maxLength = listOfChars.count()
    if (index in 0..maxLength) {

        var afterN = ArrayList<Char>()
        var beforeN = ArrayList<Char>()

        for (char in listOfChars) {
            if (char <= listOfChars[index])
                beforeN.add(char)
        }
        val remainder = maxLength
        var iAfterN = remainder - index - 1

        for (char in listOfChars) {
            if (char > listOfChars[index])
                afterN.add(char)
        }

        val mergerOfArray = afterN + beforeN
        println( mergerOfArray)

    } else
        println(("Error, out of range. Should be between 0 and $maxLength"))

}









/*


import kotlin.math.max

fun main(){

    arrayManipulation(2)


}

fun arrayManipulation(n: Int) {

    var listOfChars = charArrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'z')
    val maxSize = 7
    var afterN = ArrayList<Char>()
    var beforeN = ArrayList<Char>()

    for (i in 0..maxSize) {
        if (i <= n) {
            beforeN.add(listOfChars[i])

        }

    }
    val remainder = listOfChars.count()
    var iAfterN = remainder - n


    for(i in 0..maxSize){
        if(i >= iAfterN)
            afterN.add(listOfChars[i])
    }


    println(beforeN)
    println(afterN)

    val mergerOfArray = afterN + beforeN
    println(mergerOfArray)
}






*/









