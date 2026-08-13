package org.example.lesson_14_task_3

class Rectangle(
    val width: Int,
    val hight: Int,
    override val color: String,

    ) : Figure(color) {

    override fun calculateField(): Int {
        return width * hight
    }


    override fun calculatePerimeter(): Int {
        return 2 * (width + hight)
    }


}