package org.example.lesson16_task3


class User(private val login: String, private val password: String) {

    fun validatePassword(input: String): Boolean = input == password

}


fun main() {


    val password = "12345"

    val user1 = User(login = "user-1", password = password)

    val input = readln()

    println(user1.validatePassword(input))

}
