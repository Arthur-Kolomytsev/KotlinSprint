package org.example.lesson_14_task_3

class Circle(
    val radius: Double,
    override val color: String,

) : Figure(color) {

    override fun calculateField(): Double {
        return radius * radius * PI
    }


    override fun calculatePerimeter(): Double {
        return 2 * radius * PI
    }
}