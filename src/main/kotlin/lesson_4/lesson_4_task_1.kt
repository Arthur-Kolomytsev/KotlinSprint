package org.example.lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {

    val todayBooked = 13
    val tomorrowBooked = 9

    println("[Доступность столиков на сегодня: ${todayBooked < NUMBER_OF_TABLES}]\n[Доступность столиков на завтра: ${tomorrowBooked < NUMBER_OF_TABLES}]")

}