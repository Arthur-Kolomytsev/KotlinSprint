package org.example.lesson15_task3

class AdminUser(
    name: String,
) : User(name), Deleteable {
    override fun deleteMessage() {
        println("$name deleted the message")
    }

    override fun deleteUser(u: User) {
        println("$name deleted user: ${u.name}")
    }
}