package org.example.lesson_5


fun main() {

    var name = "Zaphod"
    var password = "PanGalactic"

    print("Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа: ")
    val userName = readln()

    if (userName == name) {
        print("Введите ваш пароль: ")
        val userPassword = readln()
        if (userPassword == password) println("Ваши данные проверены, и о, чудо, они верны... Пользователь \"$name\", вам разрешено входить на борт корабля \"Heart of Gold\"")
        else println("Неверный пароль!")
    } else println("Пожалуйста зарегистрируйтесь")

}