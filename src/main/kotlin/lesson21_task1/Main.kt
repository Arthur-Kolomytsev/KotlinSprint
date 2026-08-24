package org.example.lesson21_task1

fun String.vowelCount(): Int {
    val listOfVowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
    var count: Int = 0

    this.toCharArray().forEach { if (it in listOfVowels) count++ }

    return count

}

fun main() {

    val s = "Hello"
    println(s.vowelCount())

}