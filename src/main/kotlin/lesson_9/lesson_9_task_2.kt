package org.example.lesson_9

fun main() {

    val ingredients = mutableListOf("Помидор", "Лук", "Яйца")

    println("В рецепте есть базовые ингредиенты: $ingredients")

    println("Желаете добавить еще?")
    val userAnswer = readln()

    if (userAnswer.equals("yes", ignoreCase = true)) {
        print("Какой ингредиент вы хотите добавить?")
        val userIngr = readln()
        ingredients.add(userIngr)
        println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
    }
}