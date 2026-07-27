package org.example.lesson_6

fun main() {

    print("Введите количество секунд: ")
    var seconds = readln().toInt()

    while (seconds > 0) {
        Thread.sleep(1000)
        seconds--
    }

    println("Прошло $seconds секунд")

}