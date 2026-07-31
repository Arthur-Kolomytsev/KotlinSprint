package org.example.lesson_9

fun main() {

    print("Введите список ингредиентов: ")
    val useringr = readln()

    val ingr = useringr.split(",")

    val sortedIngr = ingr.sorted()
     println(sortedIngr)

}