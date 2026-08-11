package org.example.lesson_13_task_5

fun main() {

    print("Enter a name: ")
    val userName = readln()

    print("Enter a phone number: ")
    try {
        val userPhoneNumber = readln().toLong()
    } catch (e: NumberFormatException) {
        println(e.javaClass.simpleName)
    }

}