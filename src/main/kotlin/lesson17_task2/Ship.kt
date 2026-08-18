package org.example.lesson17_task2

class Ship(_name: String, _averageSpeed: Int, _homePort: String) {

    var name = _name
        set(value) = println("Warning! You can't change the name of ship.")

    val averageSpeed = _averageSpeed

    val homePort = _homePort

    fun showInfo() {
        println("Ship: $name\n" +
                "Average Speed: $averageSpeed\n" +
                "Home Port: $homePort\n")
    }

}


fun main() {

    val ship = Ship("NAME-1", 10, "Portugal")
    ship.showInfo()
    ship.name = "NAME-1"
    ship.showInfo()

}