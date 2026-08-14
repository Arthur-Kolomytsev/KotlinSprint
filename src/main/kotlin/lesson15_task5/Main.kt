package org.example.lesson15_task5

fun main() {

    val truck1 = Truck(name = "Truck-1", passengers = 1, cargo = 2)
    val car1 = PassengerCar(name = "Car-1", passengers = 2)
    val car2 = PassengerCar(name = "Car-1", passengers = 3)

    truck1.move()
    truck1.loadPassenger()
    truck1.transportPassengers()
    truck1.loadCargo()
    truck1.transportCargo()

    car1.move()
    car1.loadPassenger()
    car1.transportPassengers()

    car2.move()
    car2.loadPassenger()
    car2.transportPassengers()

}