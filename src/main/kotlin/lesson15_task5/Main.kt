package org.example.lesson15_task5

fun main() {

    val truck = Truck(name = "Truck-1")
    val car1 = PassengerCar(name = "Car-1")
    val car2 = PassengerCar(name = "Car-2")


    truck.loadPassenger(1)
    truck.loadPassenger(1)
    truck.transportPassengers()

    truck.loadCargo(1)
    truck.loadCargo(1)
    truck.transportCargo()

    car1.loadPassenger(2)
    car2.loadPassenger(2)
    car1.transportPassengers()
    car2.transportPassengers()


}