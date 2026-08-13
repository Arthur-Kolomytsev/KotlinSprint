package org.example.lesson_14_task_5

class Chat() {

    private val messages = mutableListOf<Message>()
    private var nextId = 1

    fun addMessage(text: String, author: String) {
        val m = Message(nextId++, text, author)
        messages.add(m)
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        val m = ChildMessage(nextId++, text, author, parentMessageId)
        messages.add(m)
    }

    fun printChat() {
        val grouped = messages.groupBy { if (it is ChildMessage) it.parentMessageId else it.id }
        for (group in grouped.values) {
            for (m in group) {
                if (m is ChildMessage) println("\t" + m.text)
                else println(m.text)
            }
        }
    }
}

