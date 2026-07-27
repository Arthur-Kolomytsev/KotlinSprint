package org.example.lesson_7

import kotlin.random.Random

fun main() {

    val chars = "abcdefghijklmnopqrstuvwxyz0123456789"

    var password = ""


    for (i in 0..6) {
        password += chars[Random.nextInt(chars.length)]
    }

    println(password)

}