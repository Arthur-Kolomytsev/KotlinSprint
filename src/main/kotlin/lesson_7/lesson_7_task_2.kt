package org.example.lesson_7

import kotlin.random.Random

fun main() {

    do {
        var authorizationCode = ""
        repeat (4) {
            authorizationCode += Random.nextInt(0, 10)
        }
        println("Ваш код авторизации: $authorizationCode")
        print("Введите код авторизации: ")
        val userCode = readln()
        if (userCode == authorizationCode) {
            println("Добро пожаловать!")
            break
        }

    } while (true)

}