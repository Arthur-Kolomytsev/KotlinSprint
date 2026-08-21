package org.example.lesson20_task4

fun main() {

    val list1 = listOf<String>("X0", "X1", "X2", "X3", "X4")

    val clickList = list1.map { "Нажат элемент $it" }

    for (i in 1..clickList.size) {
        if (i % 2 == 0) {
            println(clickList[i])
        }
    }

}