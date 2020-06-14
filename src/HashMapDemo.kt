// For a fast query


fun main(){

    var listOfUsers = HashMap<Int,String>()
    listOfUsers[123] = "Hussein"
    listOfUsers[554] = "Jena"
    listOfUsers[12] = "Laya"

    println("Print ID 123: ${listOfUsers[123]}")

    for(key in listOfUsers.keys){
        println("$key: ${listOfUsers[key]}")
    }


}