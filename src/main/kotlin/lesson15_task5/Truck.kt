package org.example.lesson15_task5

class Truck(
    name: String,

    ) : Car(name), PassengerTransporter, CargoTransporter {

    override var currCargo = 0
    override var maxCargo = 2
    override var maxPassengers = 1

    override fun transportCargo() {
        println("$name transport $currCargo cargo")
    }

}

