package org.example.lesson_8

fun main() {

    val arrayOgIngredients = arrayOf("I1", "I2", "I3", "I4")

    println(arrayOgIngredients.contentToString())

    println("Какой ингредиент вы хотите заменить?")
    val oldIngr = readln()

    if (oldIngr in arrayOgIngredients) {
        print("Какой ингредиент вы хотите добавить?")
        val newIngr = readln()
        arrayOgIngredients[arrayOgIngredients.indexOf(oldIngr)] = newIngr
    } else println("Такого ингредиента в рецепте нет")

    println("Готово! Вы сохранили следующий список: ${arrayOgIngredients.contentToString()}")

}
