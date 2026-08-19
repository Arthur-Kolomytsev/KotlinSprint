package org.example.lesson18_task4

class Box(val side: Double) : Package() {

    override fun getArea(): Double {
        return 6 * side * side
    }
}