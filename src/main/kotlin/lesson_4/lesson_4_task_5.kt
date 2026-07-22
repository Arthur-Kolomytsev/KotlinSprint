package org.example.lesson_4

fun main() {

    print("The sheep is damage? true or false:")
    val input1 = readln()
    val isDamage = input1.toBoolean()

    print("How many crew members:")
    val input2 = readln()
    val crewMembers = input2.toInt()

    print("How many boxes of provision:")
    val input3 = readln()
    val provision = input3.toInt()

    print("The weather is good? true or false:")
    val input4 = readln()
    val isWeather = input4.toBoolean()

    val isSailingCondition1 = !isDamage && (crewMembers in 55..70) && (provision > 50)
    val isSailingCondition2 = (crewMembers == 70) && (provision >= 50) && isWeather

    val isSailing = isSailingCondition1 || isSailingCondition2

    if (isSailing) {
        println("The ship can leaving")
    } else {
        println("The ship can not leaving")
    }

}