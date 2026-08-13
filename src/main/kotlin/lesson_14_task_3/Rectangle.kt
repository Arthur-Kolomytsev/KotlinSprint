package org.example.lesson_14_task_3

class Rectangle(
    val width: Double,
    val height: Double,
    override val color: String,

    ) : Figure(color) {

    override fun calculateField(): Double {
        return width * height
    }


    override fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }


}