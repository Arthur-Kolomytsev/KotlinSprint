package org.example.lesson_4

fun main() {

    val maxWeight = 35
    val minWeight = 100
    val maxVolume = 100

    val weight_1 = 20
    val volume_1 = 80

    val weight_2 = 50
    val volume_2 = 100

    println(
        "Груз с весом $weight_1 кг и объемом $volume_1 л соответствует категории 'Average': ${weight_1 > minWeight && weight_1 <= maxWeight && volume_1 < maxVolume}\n" +
                "Груз с весом $weight_2 кг и объемом $volume_2 л соответствует категории 'Average': ${weight_2 > minWeight && weight_2 <= maxWeight && volume_2 < maxVolume}"
    )

}

