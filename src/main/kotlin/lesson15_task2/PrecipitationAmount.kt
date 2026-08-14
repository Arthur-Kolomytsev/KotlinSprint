package org.example.lesson15_task2

class PrecipitationAmount(
    val precipitationAmount: Int,
) : WeatherStationStats(precipitationAmount) {

    override fun showWeatherInfo() {
        println("Amount of precipitation: $info")
    }
}