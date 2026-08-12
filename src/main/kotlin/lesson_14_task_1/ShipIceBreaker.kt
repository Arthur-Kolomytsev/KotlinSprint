package org.example.lesson_14_task_1

class ShipIceBreaker(

    override val name: String = "IceBreaker" ) : Ship(name) {

    val speed: Int = 2
    val passengerCapacity: Int = 50

    fun breakIce() {
        println("Break the ICE")
    }

}