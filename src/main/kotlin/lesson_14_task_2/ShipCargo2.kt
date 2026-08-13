package org.example.lesson_14_task_2

class ShipCargo2(
    override val name: String = "Cargo Ship",
    override val speed: Int = 5,
    override val passengerCapacity: Int = 10,
    override val cargoCapacity: Int = 200,

    ) : Ship2() {

    override fun load() {
        println("Activates the loading crane\n")
    }

}

