package org.example.lesson_5


fun main() {

    val name = "Zaphod"
    val password = "PanGalactic"

    print("Что ж, введи, пожалуйста, свое имя пользователя: ")
    val userName = readln()

    if (userName == name) {
        print("Пожалуйста, вводите свои данные: ")
        val userPassword = readln()
        if (userPassword == password) println("Вздыхает... Ваши данные проверены, и о, чудо, они верны..." +
                "Пользователь \"Zaphod\", вам разрешено входить на борт корабля \"Heart of Gold\"." +
                "Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов..." +
                "Меланхолический вздох. Надеюсь, вам понравится пребывание здесь больше, чем мне.")
        else println("Неверный пароль!")
    } else println("Пожалуйста зарегистрируйтесь")

}