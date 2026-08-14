package org.example.lesson15_task5

interface CargoTransporter {
    var currCargo: Int
    var maxCargo: Int

    fun loadCargo(i: Int) {
        if (i > maxCargo) currCargo = maxCargo
        else currCargo += i
    }


    fun unloadCargo(i: Int) {
        currCargo -= i
    }

    fun transportCargo()
}