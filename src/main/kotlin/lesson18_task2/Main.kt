package org.example.lesson18_task2

fun main() {

    val dice1 = Dice4Faces()
    val dice2 = Dice6Faces()
    val dice3 = Dice8Faces()

    val dices = listOf<Dice>(dice1, dice2, dice3)

    dices.forEach { it.rollDice() }

}