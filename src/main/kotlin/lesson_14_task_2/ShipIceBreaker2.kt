package org.example.lesson_14_task_2

class ShipIceBreaker2(

    override val name: String = "IceBreaker",
    override val speed: Int = 5,
    override val passengerCapacity: Int = 10,
    override val cargoCapacity: Int = 50,

    ) : Ship2() {

    fun breakIce() {
        println("Break the ICE")
    }

    override fun load() {
        println("Open the gates on the stern side")
    }

    override fun showShipInfo() {
        println("Name: $name\n" +
                "Speed: $speed\n" +
                "Passenger Capacity: $passengerCapacity\n" +
                "Cargo Capacity: $cargoCapacity")
        println()
    }

}