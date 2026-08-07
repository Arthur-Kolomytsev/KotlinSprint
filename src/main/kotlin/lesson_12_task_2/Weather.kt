package org.example.lesson_12_task_2

class Weather(

    var dayTemp: Int,
    var nightTemp: Int,
    var isRain: Boolean,

) {

    fun showForecast() {
        println("dayTemp: $dayTemp")
        println("nightTemp: $nightTemp")
        println("isRain: $isRain")
        println()
    }

}