package org.example.lesson21_task2

fun main() {

    val list = listOf(1, 2, 3, 4, 5, 6)
    println(list.evenNumbersSum())

}

fun List<Int>.evenNumbersSum(): Int {
    var result = 0
    this.forEach { if (it % 2 == 0) result += it }
    return result
}
