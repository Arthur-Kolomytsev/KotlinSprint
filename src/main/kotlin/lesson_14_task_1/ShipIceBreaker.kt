package org.example.lesson_14_task_1

class ShipIceBreaker(

    override val name: String = "IceBreaker",
    override val speed: Int = 2,
    override val loadCapacity: Int = 300,
    passengerCapacity: Int,

) : Ship(name, speed, loadCapacity, passengerCapacity) {

    fun breakIce() {
        println("Break the ICE")
    }

}