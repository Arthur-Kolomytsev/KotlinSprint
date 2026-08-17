package org.example.lesson16_task3

class User(private val login: String) {

    private val password = "1234"

    fun validatePassword(input: String): Boolean = input == password

}

fun main() {
    val u1 = User(login = "user-1")
    println(u1.validatePassword("1234"))

}
