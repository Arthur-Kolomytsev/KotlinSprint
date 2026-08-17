package org.example.lesson16_task2

class Circle(private val radius: Double) {

    private val pi = 3.14

    var length = 0.0
        private set

    var field = 0.0
        private set

    fun calculateLength() {
        length = 2 * pi * radius
    }

    fun calculateField() {
        field = pi * radius * radius
    }

}

fun main() {

    val c = Circle(radius = 1.5)

    c.calculateLength()
    c.calculateField()

    println(c.length)
    println(c.field)

}