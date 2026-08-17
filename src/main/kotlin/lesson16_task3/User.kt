package org.example.lesson16_task3

import kotlin.random.Random

class User(private val login: String) {

    private val password: String = "1234"

    fun validatePassword(input: String): Boolean = input == password

}


fun main() {

    val user1 = User(login = "user-1")
    val password = "1234"

    println(user1.validatePassword(password))

}
