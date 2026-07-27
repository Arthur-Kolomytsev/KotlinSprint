package org.example.lesson_6

import kotlin.random.Random

fun main() {

    var attempt = 3

    do {
        val numberOne = Random.nextInt(1, 10)
        val numberTwo = Random.nextInt(1, 10)

        val result = numberOne + numberTwo

        print("Докажите, что вы не бот, напишите ответ: $numberOne + $numberTwo = ")
        val userResult = readln().toInt()
        if (userResult == result) {
            println("Добро пожаловать!")
            break
        }
        attempt--
    } while (attempt > 0)

    if (attempt == 0) println("Доступ запрещен")

}