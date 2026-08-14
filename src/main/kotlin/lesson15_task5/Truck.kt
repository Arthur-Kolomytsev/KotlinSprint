package org.example.lesson15_task5

class Truck(
    name: String,
    passengers: Int,
    val cargo: Int,

    ) : Car(name, passengers), PassengerTransporter, CargoTransporter {

    override fun loadCargo() {
        println("$name loaded $cargo cargo")
    }

    override fun transportCargo() {
        println("$name transport $cargo cargo")
    }

}

