package org.example.lesson_9

fun main() {

    val numberOfIng = 5
    val ingredients = mutableListOf<String>()

    repeat (numberOfIng) {
        print("Введите название ингредиента: ")
        val userIngr = readln()
        ingredients.add(userIngr)
    }

    ingredients.sort()
    val ingredients2 =ingredients.distinct()

    val result = ingredients2.joinToString(",")
    val finalResult = result.replaceFirstChar { it.uppercase() }

    println(finalResult)
}