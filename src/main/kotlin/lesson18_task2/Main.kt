package org.example.lesson18_task2

fun main() {

    val dice1 = Dice_4()
    val dice2 = Dice_6()
    val dice3 = Dice_8()

    val dices = listOf<Dice>(dice1, dice2, dice3)

    dices.forEach { it.rollDice() }

}