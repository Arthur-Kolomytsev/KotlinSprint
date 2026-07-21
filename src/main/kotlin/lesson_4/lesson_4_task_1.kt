package org.example.lesson_4


fun main() {

    val numberOfTables = 13

    val todayBooked = 13
    val tomorrowBooked = 9

    println("[Dostupno stolikov na segodnya: ${todayBooked < numberOfTables}]")
    println("[Dostupno stolikov na zavtra: ${tomorrowBooked < numberOfTables}]")

}