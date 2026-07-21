package org.example.lesson_4

const val OPTIMAL_HUMIDITY = 20

fun main() {

    val isSunnyDay = true
    val isOpenTent = true
    val humidity = 20
    val season = "Winter"


    println(
        "Благоприятные ли условия сейчас для роста бобовых?${
            isSunnyDay && isOpenTent
                    && humidity == OPTIMAL_HUMIDITY
                    && season != "Winter"
        }"
    )
}

