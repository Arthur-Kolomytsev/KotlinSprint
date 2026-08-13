package org.example.lesson_14_task_3

fun main() {

    val figures = listOf<Figure>(
        Rectangle(color = "Black", width = 2, hight = 2),
        Rectangle(color = "White", width = 2, hight = 3),
        Rectangle(color = "Black", width = 1, hight = 4),
        Circle(color = "White", radius = 1),
        Circle(color = "Black", radius = 2),
        Circle(color = "White", radius = 3)
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