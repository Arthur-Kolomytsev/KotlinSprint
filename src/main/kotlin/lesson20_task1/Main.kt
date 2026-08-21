package org.example.lesson20_task1

fun main() {

    val greet: (String) -> String = { "С наступающим Новым Годом, $it!" }

    println(greet("Art"))


}