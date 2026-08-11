package org.example.lesson_14_task_1

class ShipIceBreaker(

    name: String,
    speed: Int,
    capacity: Int

) : Ship(name, speed, capacity) {

    fun breakIce() {
        println("Break the ICE")
    }

}