package org.example.lesson_8

fun main() {

    print("Введите количество ингредиентов: ")
    val numberOfIngredients = readln().toInt()

    val arrayOfIngredients = Array(numberOfIngredients) { "1" }

    for (i in arrayOfIngredients.indices) {
        print("Добавьте ингредиент: ")
        val ingr = readln()
        arrayOfIngredients[i] = ingr
    }

    println(arrayOfIngredients.joinToString(", "))

}