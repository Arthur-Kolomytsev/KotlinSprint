package org.example.lesson_12_task_3

class Weather(dayTempK: Int, nightTempK: Int, isRain: Boolean) {

    var dayTemp = (dayTempK - 273.15).toInt()
    var nightTemp = (nightTempK - 273.15).toInt()
    var isRain = isRain



    fun showForecast() {
        println("dayTemp: $dayTemp")
        println("nightTemp: $nightTemp")
        println("isRain: $isRain")
        println()
    }

}
