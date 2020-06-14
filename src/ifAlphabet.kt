fun main(){

    println("Write down a letter to check if it is a part of the alphabet, Letter: ")
    val letter = '2'

    if(letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z')
        println("This thing you typed is in the alphabet is a letter ")
    else
        println("Not in the alphabet")
}