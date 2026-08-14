package org.example.lesson15_task2

class PrecipitationAmount(
    val precipitationAmount: Int,
) : WeatherStationStats() {

    override fun showWeatherInfo() {
        println("Amount of precipitation: $precipitationAmount")
    }
}