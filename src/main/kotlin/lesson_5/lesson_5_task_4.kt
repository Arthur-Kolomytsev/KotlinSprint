package org.example.lesson_5


fun main() {

    val name = "Zaphod"
    val password = "PanGalactic"

    val message = "Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля \"Heart of Gold\". " +
            "Вздыхает... Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. " +
            "Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. " +
            "Вздыхает ещё глубже... Да, вперед, пожалуйста, вводите свои данные..."
    print(message)

    print("Введите имя пользователя: ")

    val userName = readln()

    if (userName == name) {
        print("Введите пароль: ")
        val userPassword = readln()
        if (userPassword == password) {
            val welcomeMessage = "Ваши данные проверены, и о, чудо, они верны. " +
                    "Пользователь \"Zaphod\", вам разрешено входить на борт корабля \"Heart of Gold\"."

            println(welcomeMessage)
        }
        else println("Неверный пароль!")
    } else println("Пожалуйста зарегистрируйтесь")

}