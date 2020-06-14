package com.car.maintain

class Car(val type: String, var model: String, val price: Double, val milesDrive: Int, val owner: String){


    init {
        println("Object class is created")
    }

    fun getCarPrice(): Double{

        return price- (milesDrive.toDouble()*10)

    }

        }
    fun main(){


       /* val car1 = Car("BMW", "760i", 57999.99,475, "Alban Mramori")
        car1.model = "850i"
        println(car1.type)
        println(car1.owner)
        println(car1.getCarPrice())

        val car2 = Car("Toyota", "2019", 39000.0,10, "Jena Mramori")
        println(car2.type)
        println(car2.owner)
        println(car2.getCarPrice())
*/

        val listOfCar = arrayListOf<Car>()
        listOfCar.add(Car("BMW", "760i", 57999.99,475, "Alban Mramori"))
        listOfCar.add(Car("Toyota", "2019", 39000.0,10, "Jena Mramori"))

        for(car:Car in listOfCar){
            println("------------------")
            println(car.owner)
            println(car.getCarPrice())

        }

    }

