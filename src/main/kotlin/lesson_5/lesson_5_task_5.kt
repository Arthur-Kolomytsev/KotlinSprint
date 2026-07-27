package org.example.lesson_5

fun main() {

    val luckyNumberOne = (0..42).random()
    val luckyNumberTwo = (0..42).random()
    val luckyNumberThree = (0..42).random()

    val luckyRandomNumbersList = mutableListOf<Int>()

    luckyRandomNumbersList.add(luckyNumberOne)
    luckyRandomNumbersList.add(luckyNumberTwo)
    luckyRandomNumbersList.add(luckyNumberThree)

    val userNumbersList = mutableListOf<Int>()

    print("Введите первое число: ")
    val numberOne = readln().toInt()
    userNumbersList.add(numberOne)

    print("Введите второе число: ")
    val numberTwo = readln().toInt()
    userNumbersList.add(numberTwo)

    print("Введите третье число: ")
    val numberThree = readln().toInt()
    userNumbersList.add(numberThree)

    val commonList = luckyRandomNumbersList.intersect(userNumbersList).toList()

    when {
        (commonList.size == 3) -> println("Вы угадали все три числа и выигпываете джекпот!")
        (commonList.size == 2) -> println("Вы угадали два числа и получаете крупный приз!")
        (commonList.size == 1) -> println("Вы угадали одно число и получаете утешительный приз")
        (commonList.size == 0) -> println("Вы не угадали ни одного числа.")
    }

    println(luckyRandomNumbersList)

}