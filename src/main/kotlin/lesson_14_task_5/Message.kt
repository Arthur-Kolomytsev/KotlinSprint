package org.example.lesson_14_task_5

open class Message(
    val id: Int,
    val text: String,
    val author: String,
) {
    override fun toString(): String {
        return "$author: $text"
    }
}
