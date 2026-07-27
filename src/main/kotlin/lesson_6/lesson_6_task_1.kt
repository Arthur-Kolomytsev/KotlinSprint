package org.example.lesson_6

fun main() {


    print("Придумайте логин: ")
    val login = readln()

    print("Придумайте пароль: ")
    val password = readln()

    do {
        print("Введите свой логин: ")
        val userLogin = readln()
        print("Введите свой пароль: ")
        val userPassword = readln()
        if (userLogin == login && userPassword == password) {
            println("Авторизация прошла успешно")
            break
        }
    } while (true)
}

