package org.example.lesson_14_task_1

class ShipCargo(

    override val name: String = "Cargo Ship",
    override val speed: Int = 5,
    override val passengerCapacity: Int = 10,
    override val cargoCapacity: Int = 200,

) : Ship()

