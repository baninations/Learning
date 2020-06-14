

fun main() {

    println("Continue example")
    for (num in 1..10) {
        if (num == 5)
            continue //Practically means go back or just skip code below and go back to the beginning again

        println(num)
    }


    println("Break example")
    for (num in 1..10) {
        if (num == 5)
            break //Practically means it will kill the loop /x...

        println(num)
    }

    println("========== End first part of app ==========")

    for (i in 1..8) {
        println("Loop number $i")
        for (i1 in 1..7){
            if (i1 == 5)
                break
        println(i1)

    }
}
    return // it will return to main, it wont finish the rest of the code

}