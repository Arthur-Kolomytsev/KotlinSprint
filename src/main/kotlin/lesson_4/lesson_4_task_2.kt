package org.example.lesson_4

const val MAX_WEIGHT = 100
const val MIN_WEIGHT = 35
const val MAX_VOLUME = 100


fun main() {

    val firstCargoWeight = 20
    val firstCargoVolume = 80

    val secondCargoWeight = 50
    val secondCargoVolume = 100

    println(
        "Груз с весом $firstCargoWeight кг и объемом $firstCargoVolume л соответствует категории 'Average':" +
                "${firstCargoWeight > MIN_WEIGHT && firstCargoWeight <= MAX_WEIGHT && firstCargoVolume < MAX_VOLUME}\n" +
                "Груз с весом $secondCargoWeight кг и объемом $secondCargoVolume л соответствует категории 'Average':" +
                "${secondCargoWeight > MIN_WEIGHT && secondCargoWeight <= MAX_WEIGHT && secondCargoVolume < MAX_VOLUME}"
    )

}

