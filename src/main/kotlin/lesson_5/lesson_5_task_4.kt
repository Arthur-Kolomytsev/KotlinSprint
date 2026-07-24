package org.example.lesson_5


fun main() {

    var name = "Zaphod"
    var password = "PanGalactic"

    println("Пожалуйста, вводите свои данные")
    print("Введите ваше имя: ")
    val userName = readln()

    if (userName == name) {
        print("Введите ваш пароль: ")
        val userPassword = readln()
        if (userPassword == password) println("Пользователь \"$name\", вам разрешено входить на борт корабля \"Heart of Gold\"")
        else println("Неверный пароль!")
    }

    if (userName != name) {
        println("Пожалуйста зарегистрируйтесь")
        print("Введите ваше имя: ")
        name = readln()
        print("Введите ваш пароль: ")
        password = readln()
    }

}