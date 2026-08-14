package org.example.lesson15_task3

class AdminUser(
    name: String,
) : User(name), Deleteable {
    override fun delete() {
        println("$name deleted the message")
    }
}