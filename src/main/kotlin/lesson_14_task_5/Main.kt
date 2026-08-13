package org.example.lesson_14_task_5

fun main() {

    val chat = Chat()

    chat.addMessage(text = "Hello!", author = "Anna") // 1
    chat.addMessage(text = "Hello!", author = "Bob") // 2
    chat.addMessage(text = "Hello!", author = "Max") // 3
    chat.addThreadMessage(text = "Hello!", author = "Tim", 1)
    chat.addThreadMessage(text = "Hello!", author = "Tim", 1)

    chat.printChat()

}