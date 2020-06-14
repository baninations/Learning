fun main(){


    for(i in 1..3) {

        println("Give any number and we'll check if it is positive or negative, give the number: ")
        val num = readLine()!!.toDouble()

        if(num < 0)
            println("Number is Negative" +
                    "")
        else
            if(num > 0)
                println("Number is positive")
            else
                println("Number is 0")
    }
}







