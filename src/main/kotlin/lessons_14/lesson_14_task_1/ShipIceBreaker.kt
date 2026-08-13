package org.example.lesson_14_task_1

class ShipIceBreaker(

    override val name: String = "IceBreaker",
    override val speed: Int = 5,
    override val passengerCapacity: Int = 10,
    override val cargoCapacity: Int = 50,

) : Ship() {

    fun breakIce() {
        println("Break the ICE")
    }

}