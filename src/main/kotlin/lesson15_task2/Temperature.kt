package org.example.lesson15_task2

class Temperature(
    val temperature: Int,
) : WeatherStationStats() {

    override fun showWeatherInfo() {
        println("Temperature: $temperature")
    }
}
