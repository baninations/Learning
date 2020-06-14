package com.car.maintain



open class CarOptions(){

    var type:String? = null
    var model:String? = null
    //var price: Double? = null
    private var price: Double? = null
    var milesDrive: Int? = null
    var owner: String? = null


        constructor(type: String, model: String, price: Double, milesDrive: Int, owner: String): this() {
            this.type = type
            this.model = model
            this.price = price
            this.milesDrive = milesDrive
            this.owner = owner

        }

    constructor(type: String, model: String, price: Double, milesDrive: Int): this() {
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive


    }

    open fun getCarPrice(): Double{

        return price!!- (milesDrive!!.toDouble()*10)

    }
// Make a private var/val accessible :D
    fun getPrice(): Double{
        return this.price!!
    }

}
fun main(){


     val car1 = CarOptions("BMW", "760i", 57999.99,475, "Alban Mramori")
     car1.model = "850i"
     println(car1.type)
     println(car1.owner)
     println(car1.getCarPrice())

     val car2 = CarOptions("Toyota", "2019", 39000.0,10)
     println(car2.type)
     println(car2.owner)
     println(car2.getCarPrice())

}

