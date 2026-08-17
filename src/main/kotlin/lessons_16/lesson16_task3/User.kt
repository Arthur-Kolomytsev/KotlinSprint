package org.example.lesson16_task3


class User(private val login: String, private val password: String) {

    fun validatePassword(input: String): Boolean = input == password

}


fun main() {


    val userLogin = readln()
    val userPassword = readln()

    val user = User(login = userLogin, password = userPassword)

    val input = readln()

    println(user.validatePassword(input))

}
