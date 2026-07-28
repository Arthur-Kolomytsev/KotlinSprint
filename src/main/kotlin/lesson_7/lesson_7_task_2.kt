package org.example.lesson_7

import kotlin.random.Random

fun main() {

    do {
        val authorizationCode = Random.nextInt(1000, 10000).toString()
        println("Ваш код авторизации: $authorizationCode")
        print("Введите код авторизации: ")
        val userCode = readln()
        if (userCode == authorizationCode) {
            println("Добро пожаловать!")
            break
        }
    } while (true)

}