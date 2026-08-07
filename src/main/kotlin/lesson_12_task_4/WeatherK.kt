package org.example.lesson_12_task_4

class WeatherKK(dayTempK: Int, nightTempK: Int, isRainParam: Boolean) {

    val dayTemp = (dayTempK - 273.15).toInt()
    val nightTemp = (nightTempK - 273.15).toInt()
    val isRain = isRainParam

    init {
        println("dayTemp: $dayTemp")
        println("nightTemp: $nightTemp")
        println("isRain: $isRain")
    }

}