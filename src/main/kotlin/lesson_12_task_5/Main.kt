package org.example.lesson_12_task_5

import org.example.lesson_12_task_3.WeatherK
import kotlin.random.Random

fun main() {

    val listWeatherK = mutableListOf<WeatherK>()

    repeat(30) {
        val t1 = Random.nextInt(273, 303)
        val t2 = Random.nextInt(273, 303)
        val b = Random.nextBoolean()

        listWeatherK.add(WeatherK(t1, t2, b))
    }

    val listDayTemp = listWeatherK.map { it.dayTemp }
    val listNightTemp = listWeatherK.map { it.nightTemp }
    val listIsRain = listWeatherK.map { it.isRain }

    println("Average day temperature: ${listDayTemp.average().toInt()}")
    println("Average night temperature: ${listNightTemp.average().toInt()}")
    println("Raining days: ${listIsRain.count { it }}")

}