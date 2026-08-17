package org.example.lesson16_task1

import kotlin.random.Random


class Dice {
    private val randomNumber = Random.nextInt(1, 7)

    fun getNumber() {
        println(randomNumber)
    }


}

fun main() {

    Dice().getNumber()

}