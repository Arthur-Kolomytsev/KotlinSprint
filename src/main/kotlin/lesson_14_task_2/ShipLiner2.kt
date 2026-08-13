package org.example.lesson_14_task_2

class ShipLiner2(
    override val name: String = "Liner",
    override val speed: Int = 10,
    override val passengerCapacity: Int = 50,
    override val cargoCapacity: Int = 100,

    ) : Ship2() {

    override fun load() {
        println("Extends a horizontal gangway from the waist")
    }

    override fun showShipInfo() {
        println("Name: $name\n" +
                "Speed: $speed\n" +
                "Passenger Capacity: $passengerCapacity\n" +
                "Cargo Capacity: $cargoCapacity")
        println()
    }
}




