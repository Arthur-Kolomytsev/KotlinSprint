package org.example.lesson15_task5

interface PassengerTransporter {
    var currPassengers: Int

    fun loadPassenger(i: Int) {
        currPassengers += i
    }

    fun unloadPassenger(i: Int) {
        currPassengers -= i
    }

    fun transportPassengers()
}

