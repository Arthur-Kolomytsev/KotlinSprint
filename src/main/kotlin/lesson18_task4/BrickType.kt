package org.example.lesson18_task4

class BrickType(
    val length: Double,
    val width: Double,
    val high: Double,

    ) : Package() {

    override fun getArea(): Double {
        return 2 * (length * width + width * high + length * high)
    }
}