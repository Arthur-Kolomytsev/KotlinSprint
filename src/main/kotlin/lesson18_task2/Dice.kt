package org.example.lesson18_task2

import kotlin.random.Random

open class Dice {

    open val numberOfFaces: Int = 0

    open fun rollDice() {
        val n = Random.nextInt(0, numberOfFaces)
        println(n)
    }

}