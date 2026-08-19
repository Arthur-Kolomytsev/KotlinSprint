package org.example.lesson18_task2

import kotlin.random.Random

open class Dice {

    open val numberOfFaces: Int = 0

    open fun rollDice() {
        val n = Random.nextInt(1, numberOfFaces + 1)
        println(n)
    }

}