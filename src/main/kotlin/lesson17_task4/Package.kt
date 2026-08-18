package org.example.lesson17_task4

class Package(val number: Int, _location: String) {

    var countOfMoving = 0

    var location = _location
        set(value) {
            countOfMoving++
            field = value
        }

}

fun main() {

    val package1 = Package(1, "Moscow")

    println(package1.number)
    println(package1.location)
    println(package1.countOfMoving)
    println()
    package1.location = "Kazan"
    println(package1.number)
    println(package1.location)
    println(package1.countOfMoving)



}