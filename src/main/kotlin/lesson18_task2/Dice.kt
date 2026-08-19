package org.example.lesson18_task2

open class Dice {

    open val numberOfFaces: Int = 0

    open fun rollDice() {
        println("Roll the dice with $numberOfFaces faces")
    }

}