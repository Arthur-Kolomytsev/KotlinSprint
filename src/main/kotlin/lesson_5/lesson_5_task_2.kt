package org.example.lesson_5

const val AGE_OG_MAJORITY = 18

fun main() {

    print("Enter your year of birth:")
    val userYearOfBirth = readln().toInt()
    val userAge = 2026 - userYearOfBirth

    if (userAge >= AGE_OG_MAJORITY) println("Показать экран со скрытым контентом")
//    else if (userAge == 16 || userAge == 17) println("Show limited content")
//    else println("Back to main screen")

}