package org.example.lesson_9

import kotlin.arrayOf

fun main() {

    val ingredients = listOf("Помидор", "Лук", "Перец", "Яйца")

    println("В рецепте есть следующие ингредиенты: $ingredients")

    ingredients.forEach {
        it
        println(it)
    }
}