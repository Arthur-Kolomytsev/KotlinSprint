package org.example.lesson_5

const val LUCKY_NUMBER_ONE = 10
const val LUCKY_NUMBER_TWO = 15


fun main() {

    print("Введите первое число: ")
    val numberOne = readln().toInt()

    print("Введите второе число: ")
    val numberTwo = readln().toInt()

    val isTwoNumbersMatched =
        (numberOne == LUCKY_NUMBER_ONE || numberOne == LUCKY_NUMBER_TWO) && (numberTwo == LUCKY_NUMBER_ONE || numberTwo == LUCKY_NUMBER_TWO) && (numberOne != numberTwo)

    val isOneNumbersMatched =
        (numberOne == LUCKY_NUMBER_ONE || numberOne == LUCKY_NUMBER_TWO) || (numberTwo == LUCKY_NUMBER_ONE || numberTwo == LUCKY_NUMBER_TWO)


    if (isTwoNumbersMatched) println("Поздравляем! Вы выиграли главный приз!")
    else if (isOneNumbersMatched) println("Вы выиграли утешительный приз!")
    else println("Неудача!")

    println("Счачтливые числа: $LUCKY_NUMBER_ONE и $LUCKY_NUMBER_TWO")


}