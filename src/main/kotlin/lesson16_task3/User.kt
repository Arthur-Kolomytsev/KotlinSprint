package org.example.lesson16_task3

class User(
    private val login: String,
    private var password: String,

    ) {

    fun validatePassword(input: String): Boolean = input == password

}


fun main() {
    val u1 = User(login = "user-1", password = "1234")

    println(u1.validatePassword("1234"))

}
