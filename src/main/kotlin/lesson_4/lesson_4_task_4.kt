package org.example.lesson_4

fun main() {

    val dayOfTraining = 5

    val isArmTraining = dayOfTraining % 2 != 0
    val isAbsTraining = dayOfTraining % 2 != 0

    val isBackTraining = dayOfTraining %2 == 0
    val isLegsTraining = dayOfTraining %2 == 0

    println(
        "Упражнения для рук: $isArmTraining\n" +
                "Упражнения для ног: $isLegsTraining\n" +
                "Упражнения для спины: $isBackTraining\n" +
                "Упражнения для пресса: $isAbsTraining"
    )

}