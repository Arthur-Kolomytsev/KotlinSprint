package org.example.lesson20_task4

fun main() {

    val list1 = listOf<String>("X0", "X1", "X2", "X3", "X4")

    val actions = list1.map { { println("Нажат элемент $it") } }

    actions.forEachIndexed { index, function ->
        if ((index + 1) % 2 == 0) {
            function()
        }
    }

}