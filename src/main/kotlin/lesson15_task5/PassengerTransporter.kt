package org.example.lesson15_task5

interface PassengerTransporter {
    var currPassengers: Int
    var maxPassengers: Int

    fun loadPassenger(i: Int) {
        if (i > maxPassengers || (currPassengers + i) > currPassengers) currPassengers = maxPassengers
        else currPassengers += i
    }

    fun unloadPassenger(i: Int) {
        if ((currPassengers - i) < 0) currPassengers = 0
        currPassengers -= i
    }

    fun transportPassengers()
}

