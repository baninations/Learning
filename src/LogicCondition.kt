/*
>
<
>=
<=
!=
==

==================================================================
And Gate
 (&&)=
 {
 True && True = True
 False && True = False
 True && False = False
 False && False = False
 }
 =================================================================
 OR Gate
 (||)=
 {
 True && True = True
 False && True = True
 True && False = True
 False && False = False
 }
 =================================================================
 NOT Gate
 (!)=
 {
 True = False
 False = True
 }
=================================================================




     */
fun main(){

    /*  var cond = (3>2)
    println(cond)
    */
    /*  var cond = (3>2)
    println(cond)

    val num = 10
    println(num >= 1 || num <=10)


    val age = readLine()!!.toInt()

    println(age <= 60 ||  age >= 18)


    val age = 22

    println( !(age == 22) )



    val age = 22
    println(age > 18 && age < 58)


    val age = 22
    println(age in 18..58)
*/

    println("please give in your age: ")
    var age = readLine()!!.toInt()
    println(age in 18..30)


}