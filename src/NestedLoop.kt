// Example of null safety too
fun main(){


    for(i in 1..10) {



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

