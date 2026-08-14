package org.example.lesson15_task5

interface PassengerTransporter {
    var currPassengers: Int
    val maxPassengers: Int

    fun loadPassenger(i: Int) {
        if (currPassengers + i > maxPassengers) currPassengers = maxPassengers
        else currPassengers += i
    }

    fun unloadPassenger(i: Int) {
        if ((currPassengers - i) < 0) currPassengers = 0
        else currPassengers -= i
    }

    fun transportPassengers()
}

