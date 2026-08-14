package org.example.lesson15_task5

interface CargoTransporter {
    var currCargo: Int
    var maxCargo: Int

    fun loadCargo(i: Int) {
        if (currCargo + i > maxCargo) currCargo = maxCargo
        else currCargo += i
    }


    fun unloadCargo(i: Int) {
        if ((currCargo - i) < 0) currCargo = 0
        else currCargo -= i
    }

    fun transportCargo()
}