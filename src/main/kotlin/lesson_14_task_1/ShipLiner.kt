package org.example.lesson_14_task_1

class ShipLiner(

    override val name: String = "Liner",
    override val speed: Int = 10,
    override val passengerCapacity: Int = 50,
    override val cargoCapacity: Int = 100,

) : Ship()




