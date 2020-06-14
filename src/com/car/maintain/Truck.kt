
/*   Something about VISIBILITY modifiers

   private -> only inside the class
   protected -> Inherit but not access to it
   public aka as nothing

 */


// Override methods only if they are open

package com.car.maintain
class Truck: CarOptions{

    var subType: String? = null

    constructor(type: String, model: String, price: Double, milesDrive: Int, owner: String, subType: String):super
        (type, model, price, milesDrive, owner) {

            this.subType = subType
    }

    constructor(type: String, model: String, price: Double, milesDrive: Int, subType: String):super
        (type, model, price, milesDrive) {

        this.subType = subType

    }
// Overriding
    override fun getCarPrice(): Double{

        return this.getPrice()!!- (milesDrive!!.toDouble()*20)

    }



}
fun main(){


    val truck1 = Truck("BMW", "760i", 57999.99,475, "Alban Mramori", "Dump Car")
    truck1.model = "850i"
    println(truck1.type)
    println(truck1.owner)
    println(truck1.owner  + " osht 28 vjeqar dhe" +
            "kerrin e ka  ${truck1.type} " + "  " + " ${truck1.model}")
    println(truck1.getCarPrice())

    val truck2 = Truck("Toyota", "2019", 39000.0,10, "Garbage")
    println(truck2.type)
    println(" ${truck1.owner} e posedon edhe 1 kerr te tipit" +
            "${truck2.type} dhe model ${truck2.model}")
    println(truck2.owner)
    println(truck2.getCarPrice())
}