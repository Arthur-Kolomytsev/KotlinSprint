package org.example.lesson_7

import kotlin.random.Random

fun main() {

    val chars = "abcdefghijklmnopqrstuvwxyz"
    val numbers = "0123456789"

    var password = ""


    for (i in 0..2) {
        password += chars[Random.nextInt(chars.length)]
        password += numbers[Random.nextInt(numbers.length)]
    }

    println(password)

}