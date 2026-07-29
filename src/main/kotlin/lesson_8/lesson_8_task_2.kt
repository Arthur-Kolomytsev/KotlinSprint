package org.example.lesson_8

fun main() {

    val arrayOgIngredients = arrayOf("Помидор", "Лук", "Перец", "Яйца")


    for (ingredient in arrayOgIngredients) {
        print("Введите ингредиент: ")
        val userIngredient = readln()
        if (ingredient == userIngredient) {
            println("Ингредиент $ingredient в рецепте есть")
        } else {
            println("Такого ингредиента в рецепте нет")
        }
    }

}