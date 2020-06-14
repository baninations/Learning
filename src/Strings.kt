
fun main(){

    val message = " Welcome to New York "
    val name = "Alban"
    val allMessage = "$name, $message"
    println(allMessage[0])
    println(allMessage.toLowerCase())
    println(allMessage.toUpperCase())
    println(message.trim())
    println(message)
    val tokens = message.trim().split(" ")

        println("Tokens: $tokens") // Or create a for loop to print each one of them separately
    for(token in tokens){
        println("Tokens: $token")

    }
        println("A more complex Token ============================================")
    for(token in tokens){
        if(!(token.contains("to")) || token.contains("York"))
        println("Tokens: $token")

    }



}














/*fun main(){

    var count = 0
    val str = "May the force be with you."
    println(str)

    val str1 = "My dad\b said \\the \t funniest \r thing, \"he said \" A joke "
    println(str1)

    val rawString = """|A long time ago,
        |in a galaxy
        |far far away... 
        |BUMM BUMM BUMMMM """.trimMargin()

    val rawString1 = """>A long time ago,
        >in a galaxy
        >far far away... 
        >BUMM BUMM BUMMMM """.trimMargin(marginPrefix = ">")

    println(rawString)
    println(rawString1)

    for (char in str ){
        println(char)

    }

    val contentEqual = str.contentEquals("May the force be with you.")
    println(contentEqual)

    val contains = str.contains("force")
    println(contains)

    val constains1 = str.contains("may", true)
    println("Second version when it ignores case, upper or lower $constains1")


    val upperCase = str.toUpperCase()
    println(upperCase)
    println("${str.toLowerCase()} or even maybe again to upper case, like this, ${str.toUpperCase()}")

    val num = 6

    println(num.toString())

    val subsequence = str.subSequence(4,14)
    println("print just the range of indexes: \" $subsequence \" ")

    val countChars = "Count us all"
    val thisone = countChars.length
    println(thisone)




}


 */