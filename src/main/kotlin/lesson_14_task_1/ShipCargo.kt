package org.example.lesson_14_task_1

class ShipCargo(

    override val name: String = "Cargo Ship" ) : Ship(name) {

    val speed: Int = 1
    val loadCapacity: Int = 5000


}

