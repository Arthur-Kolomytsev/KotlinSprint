package org.example.lesson_9

fun main() {

    print("Введите ингредиенты: ")
    val userIngr = readln()


    val ingr = userIngr.split(", ")
    val sortedIngr = ingr.sorted()

    println(sortedIngr)

}