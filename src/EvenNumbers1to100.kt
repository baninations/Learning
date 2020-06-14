fun main(){

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
