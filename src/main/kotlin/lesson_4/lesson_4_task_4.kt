package org.example.lesson_4

fun main() {

    val dayOfTraining = 5

    val isArmTraining = dayOfTraining == 5
    val isAbsTraining = dayOfTraining == 5

    val isBackTraining = dayOfTraining != 5
    val isLegsTraining = dayOfTraining != 5

    println(
        "Упражнения для рук: $isArmTraining\n" +
                "Упражнения для ног: $isLegsTraining\n" +
                "Упражнения для спины: $isBackTraining\n" +
                "Упражнения для пресса: $isAbsTraining\n"
    )

}