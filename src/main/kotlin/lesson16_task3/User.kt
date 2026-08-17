package org.example.lesson16_task3

import kotlin.random.Random

class User(private val login: String, private val password: String) {

    fun validatePassword(input: String): Boolean = input == password

}


fun main() {

    val password = readln()

    val user1 = User(login = "user-1", password = password)

    println(user1.validatePassword(password))

}
