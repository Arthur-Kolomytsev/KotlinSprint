package org.example.lesson15_task2

fun main() {

    val temp = Temperature(temperature = 20)
    val precipitation = PrecipitationAmount(precipitationAmount = 100)

    val weatherServer = WeatherServer()

    weatherServer.showWeatherInfo(temp)
    weatherServer.showWeatherInfo(precipitation)

}