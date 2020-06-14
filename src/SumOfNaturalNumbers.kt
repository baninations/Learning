fun main(){

    var n = readLine()!!.toInt()
    var j = 0

    for (i in 0..n){

        j=j+i
       println("There are $i loops in this for loop")
    }
    println("$j")

}