package org.example.lesson_8

fun main() {

    val arrayOgIngredients = arrayOf("Помидор", "Лук", "Перец", "Яйца")

    print("Введите ингредиент: ")
    val userIngredient = readln()

    val found = arrayOgIngredients.contains(userIngredient)

    if (found) {
        println("Ингредиент $userIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
