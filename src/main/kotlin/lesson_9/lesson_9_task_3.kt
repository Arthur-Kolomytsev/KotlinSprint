package org.example.lesson_9

fun main() {

    val recipe = mutableListOf(2, 50, 15)

    print("Введите количество порций: ")
    val amount = readln().toInt()

    val recipe2 = recipe.map { it * amount }

    val eggs = recipe2[0]
    val milk = recipe2[1]
    val oil = recipe2[2]

    println("На $amount порций вам понадобится: Яиц – $eggs, молока – $milk, сливочного масла – $oil")

}