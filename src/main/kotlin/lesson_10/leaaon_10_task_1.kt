package org.example.lesson_10

import kotlin.random.Random

fun main() {

    val userResult = rollDice()
    val compResult = rollDice()

    when {
        userResult > compResult -> println("Победило человечество")
        userResult < compResult -> println("Победила машина")
        else -> println("Победила дружба")
    }
}


fun rollDice(): Int {
    return Random.nextInt()
}