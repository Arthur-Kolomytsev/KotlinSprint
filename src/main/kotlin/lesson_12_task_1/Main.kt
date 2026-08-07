package org.example.lesson_12_task_1

fun main() {

    val weather1 = Weather()
    weather1.dayTemp = 15
    weather1.nightTemp = 5
    weather1.isRain = true

    val weather2 = Weather()
    weather2.dayTemp = 25
    weather2.nightTemp = 15

    weather1.showForecast()
    weather2.showForecast()
}