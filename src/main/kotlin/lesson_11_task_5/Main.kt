package org.example.lesson_11_task_5

fun main() {

    val forum = Forum()

    val user1 = forum.createNewUser("Bob")
    val user2 = forum.createNewUser("Anna")

    val message1 = forum.createNewMessage(user1.userId, "Hello from Bob")
    val message2 = forum.createNewMessage(user2.userId, "Hello from Anna")
    val message3 = forum.createNewMessage(user1.userId, "Hello from Bob2")
    val message4 = forum.createNewMessage(user2.userId, "Hello from Anna2")

    forum.printThread()

}