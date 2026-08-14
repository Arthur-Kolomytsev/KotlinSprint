package org.example.lesson15_task5

interface PassengerTransporter {
    var currPassengers: Int
    var maxPassengers: Int

    fun loadPassenger(i: Int) {
        if (i > maxPassengers) currPassengers = maxPassengers
        else currPassengers += i
    }

    fun unloadPassenger(i: Int) {
        currPassengers -= i
    }

    fun transportPassengers()
}

