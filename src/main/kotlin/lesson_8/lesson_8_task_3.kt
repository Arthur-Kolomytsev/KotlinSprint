package org.example.lesson_8

fun main() {

    val arrayOgIngredients = arrayOf("Помидор", "Лук", "Перец", "Яйца")

    println("Какой ингредидиент вы хотите найти?")
    val userIngredient = readln()

    val found = arrayOgIngredients.contains(userIngredient)

    if (found) {
        println("Этот ингредиент в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
