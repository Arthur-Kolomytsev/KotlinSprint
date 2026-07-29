package org.example.lesson_8

fun main() {

    val arrayOgIngredients = arrayOf("Помидор", "Лук", "Перец", "Яйца")

    print("Какой ингредиент вас интересует: ")
    val userIngredient = readln()

    for (ingredient in arrayOgIngredients) {
        if (ingredient == userIngredient) {
            println("Ингредиент $ingredient в рецепте есть")
            break
        } else {
            println("Такого ингредиента в рецепте нет")
            break
        }
    }

}