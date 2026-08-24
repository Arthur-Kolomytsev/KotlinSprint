package org.example.lesson21_task1

fun String.vowelCount(): Int {
    val vowels = listOf('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U')
    return count {it in vowels}
}

fun main() {

    val s = "Hello"
    println(s.vowelCount())

}