package org.example.lesson_10


fun main() {

    var userScore = throwDice()
    var compScore = throwDice()
    var countUserWin = game(userScore, compScore)

    var isGame = true

    while (isGame) {
        print("Хотите бросить кости еще раз? Введите Да или Нет: ")
        val answer = readln()

        if (answer == "Да") {
            userScore = throwDice()
            compScore = throwDice()
            countUserWin += game(userScore, compScore)
        } else isGame = false
    }

    println("Пользователь выиграл $countUserWin партий")

}

fun throwDice(): Int = (1..6).random()

fun game(user: Int, computer: Int): Int {
    if (user > computer) return 1
    else return 0
}
