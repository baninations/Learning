package Training
fun main(){

    println("Which should be the end number: ")
    var n = readLine()!!.toInt()
    var t1 = 0
    var t2 = 1



    for(i in 0..n){

       print("$t1 +")
        val sum = t1 + t2
        t1 = t2
        t2 = sum

    }
}