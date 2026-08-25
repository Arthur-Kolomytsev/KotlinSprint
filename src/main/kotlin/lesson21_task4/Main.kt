package org.example.lesson21_task4

import java.io.File

fun main() {

    val fileName = "example.txt"
    val file = File(fileName)

    file.writeWordToFile("Hello")


}

fun File.writeWordToFile(word: String) {
    this.writeText(word)
}

