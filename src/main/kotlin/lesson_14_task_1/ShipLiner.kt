package org.example.lesson_14_task_1

class ShipLiner(
    override val name: String = "",
    override val speed: Int = 10,
    override val loadCapacity: Int = 1000,
    override val passengerCapacity: Int = 50,

    ) : Ship(name, speed, loadCapacity, passengerCapacity)




