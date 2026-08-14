package org.example.lesson15_task2

class Temperature(
    val temperature: Int,
) : WeatherStationStats(temperature) {

    override fun showWeatherInfo() {
        println("Temperature: $temperature")
    }
}
