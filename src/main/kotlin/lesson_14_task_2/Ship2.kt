package org.example.lesson_14_task_2

open class Ship2(
    open val name: String = "Ship",
    open val speed: Int = 10,
    open val passengerCapacity: Int = 10,
    open val cargoCapacity: Int = 100,
) {

    open fun load() {
        println("Loading process")
    }

    open fun showShipInfo() {
        println("Name: $name\n" +
                "Speed: $speed\n" +
                "Passenger Capacity: $passengerCapacity\n" +
                "Cargo Capacity: $cargoCapacity")
        println()
    }

}








