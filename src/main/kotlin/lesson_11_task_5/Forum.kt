package org.example.lesson_11_task_5

class Forum {
    private val users = mutableListOf<User>()
    private val messages = mutableListOf<Message>()
    private var userId = 1


    fun createNewUser(userName: String): User {
        val user = User.Builder()
            .setUserId(userId)
            .setUserName(userName)
            .build()

        users.add(user)
        userId++
        return user
    }

    fun createNewMessage(authorId: Int, message: String): Message? {
        val exists = users.any { it.userId == authorId }

        if (!exists) return null

        val msg = Message.Builder()
            .setAuthorId(authorId)
            .setMessage(message)
            .build()

        messages.add(msg)
        return msg
    }

    fun printThread() {
        for (i in 0 until users.size) {
            for (j in 0 until messages.size) {
                if (users[i].userId == messages[j].authorId) {
                    println("${users[i].userName}: ${messages[j].message}")
                }
            }
        }

    }

}