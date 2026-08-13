package org.example.lesson_14_task_3

const val PI: Double = 3.14

abstract class Figure(open val color: String) {

    abstract fun calculateField(): Int
    abstract fun calculatePerimeter(): Int
}
