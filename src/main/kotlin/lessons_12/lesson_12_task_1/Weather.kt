package org.example.lesson_12_task_1

class Weather() {

    var dayTemp: Int = 1
    var nightTemp: Int = 1
    var isRain: Boolean = false


    fun showForecast() {
        println("dayTemp: $dayTemp")
        println("nightTemp: $nightTemp")
        println("isRain: $isRain")
        println()
    }
}