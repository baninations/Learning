
fun main(){
//First check condition, then run the code
    println("For loop")
    for(i in 1..10 step 1)
        println("Counter $i")
//First check the condition then run the code
    println("While loop")

    var i=1
    while (i<=10){

        println("Counter $i")
      //  i++
      //  i=i+1
        i += 1

        println("Do While loop")
        i=1
        // First run the code then check the condition, Its actually logical.
        do{
            println("Counter $i")
            i += 1


        }while (i<=10)
    }
}