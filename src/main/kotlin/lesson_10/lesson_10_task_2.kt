package org.example.lesson_10

fun main() {

    print("Введите логин: ")
    val userLogin = readln()

    print("Введите пароль: ")
    val userPassword = readln()

    if (!validateLogin(userLogin) || !validatePassword(userPassword)) {
        println("Логин или пароль недостаточно длинные")
    }

}

fun validateLogin (log: String): Boolean {
    return log.length >= 4
}

fun validatePassword (pass: String): Boolean {
    return pass.length >= 4
}