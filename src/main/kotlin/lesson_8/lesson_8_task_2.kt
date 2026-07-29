package org.example.lesson_8

fun main() {

    val arrayOgIngredients = arrayOf("Помидор", "Лук", "Перец", "Яйца")

    print("Введите ингредиент: ")
    val userIngredient = readln()

    var found = false

    for (i in arrayOgIngredients.indices) {
        if (arrayOgIngredients[i] == userIngredient) {
            found = true
            break
        }
    }
    if (found) {
        println("Ингредиент $userIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
