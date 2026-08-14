package org.example.lesson15_task5

open class Car(
    val name: String,

) : Moveable, PassengerTransporter {

    override var currPassengers = 0
    override var maxPassengers = 3

    override fun move() {
        println("$name is moving")
    }

    override fun transportPassengers() {
        println("$name transport $currPassengers passengers")
    }

}
