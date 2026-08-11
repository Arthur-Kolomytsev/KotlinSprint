package org.example.lesson_14_task_1

class ShipCargo(

    override val name: String = "Cargo Ship",
    override val speed: Int = 1,
    override val loadCapacity: Int = 5000,
    passengerCapacity: Int = 20,

) : Ship(name, speed, loadCapacity, passengerCapacity)

