package org.example.lesson_14_task_2

fun main() {

    val ship1 = ShipLiner2()
    val ship2 = ShipIceBreaker2()
    val ship3 = ShipCargo2()

    ship1.showShipInfo()
    ship1.load()

    ship2.showShipInfo()
    ship2.load()

    ship3.showShipInfo()
    ship3.load()

}