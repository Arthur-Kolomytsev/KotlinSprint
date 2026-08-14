package org.example.lesson15_task5

interface CargoTransporter {
    var currCargo: Int

    fun loadCargo(i: Int) {
        currCargo += i
    }


    fun unloadCargo(i: Int) {
        currCargo -= i
    }

    fun transportCargo()
}