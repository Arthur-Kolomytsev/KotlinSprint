package org.example.lesson_14_task_3

const val WHITE = "White"
const val BLACK = "Black"

fun main() {

    val figures = listOf<Figure>(
        Rectangle(color = BLACK, width = 2.0, height = 2.0),
        Rectangle(color = WHITE, width = 2.5, height = 3.5),
        Rectangle(color = BLACK, width = 1.0, height = 4.0),
        Circle(color = WHITE, radius = 1.0),
        Circle(color = BLACK, radius = 2.0),
        Circle(color = WHITE, radius = 3.5)
    )

    val blackPerimeterSum = figures
        .filter { it.color == "Black" }
        .sumOf { it.calculatePerimeter() }

    val whiteAreaSum = figures
        .filter { it.color == "White" }
        .sumOf { it.calculateField() }

    println(blackPerimeterSum)
    println(whiteAreaSum)

}