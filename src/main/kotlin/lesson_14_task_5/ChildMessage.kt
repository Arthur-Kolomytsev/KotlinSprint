package org.example.lesson_14_task_5

class ChildMessage(
    id: Int,
    text: String,
    author: String,
    val parentMessageId: Int,
) : Message(id, text, author) {

    override fun toString(): String {
        return "$id, $author: $text"
    }
}