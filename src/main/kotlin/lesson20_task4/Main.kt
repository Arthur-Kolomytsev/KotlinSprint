package org.example.lesson20_task4

fun main() {

    val list1 = listOf<String>("X0", "X1", "X2", "X3", "X4")

    val clickList = list1.map { { println("Нажат элемент $it") } }

    clickList.forEachIndexed { index, function ->
        if (index % 2 == 0) {
            function()
        }
    }

}