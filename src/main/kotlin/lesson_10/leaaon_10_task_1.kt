package org.example.lesson_10

fun main() {


    val userResult = rollDice()
    println("Ход игрока $userResult")


    val compResult = rollDice()
    println("Ход омпьютера $compResult")

    when {
        userResult > compResult -> println("Победило человечество")
        userResult < compResult -> println("Победила машина")
        else -> println("Победила дружба")
    }
}


fun rollDice(): Int {
    return (1..6).random()
}