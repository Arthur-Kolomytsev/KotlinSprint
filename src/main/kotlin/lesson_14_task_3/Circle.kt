package org.example.lesson_14_task_3

class Circle(
    val radius: Int,
    override val color: String,

) : Figure(color) {

    override fun calculateField(): Int {
        return (radius * radius * PI).toInt()
    }


    override fun calculatePerimeter(): Int {
        return (2 * radius * PI).toInt()
    }
}