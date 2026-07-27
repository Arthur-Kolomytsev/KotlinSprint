package org.example.lesson_6

import kotlin.random.Random

fun main() {

    val luckyNumber = Random.nextInt(1,10)

    var attempt = 5

    do {
        print("Введите свой номер: ")
        val userNumber = readln().toInt()
        if (userNumber == luckyNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            println("Не угадал")
            println("Оставшееся количесвто попыток: ${--attempt}")
        }
    } while (attempt > 0)

    println("Было загадано число $luckyNumber")

}

