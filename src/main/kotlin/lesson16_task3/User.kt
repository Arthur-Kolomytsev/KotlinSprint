package org.example.lesson16_task3

import kotlin.random.Random

class User(
    private val login: String,
    private val password: Int,
    ) {

    fun validatePassword(input: Int): Boolean = input == password

}

fun main() {

    val password = Random.nextInt()

    val u1 = User(login = "user-1", password = password)

    println(u1.validatePassword(password))

}
