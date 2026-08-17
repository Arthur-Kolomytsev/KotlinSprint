package org.example.lesson16_task2

class Circle(private val radius: Double) {

    private val pi = 3.14

    var circumference = 0.0
        private set

    var area = 0.0
        private set

    fun calculateLength() {
        circumference = 2 * pi * radius
    }

    fun calculateField() {
        area = pi * radius * radius
    }

}

fun main() {

    val c = Circle(radius = 1.5)

    c.calculateLength()
    c.calculateField()

    println(c.circumference)
    println(c.area)

}