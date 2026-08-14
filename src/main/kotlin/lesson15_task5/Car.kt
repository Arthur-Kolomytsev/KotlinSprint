package org.example.lesson15_task5

open class Car(
    val name: String,
    val passengers: Int
) : Moveable, PassengerTransporter {

    override fun move() {
        println("$name is moving")
    }

    override fun loadPassenger() {
        println("$name loaded $passengers passengers")
    }

    override fun transportPassengers() {
        println("$name transport $passengers passengers")
    }

}
