package org.example.lesson_11_task_5

fun main() {

    val forum = Forum()

    val user1 = forum.createNewUser("Bob")
    val user2 = forum.createNewUser("Anna")

    val message1 = forum.createNewMessage(1, "Hello from Bob")
    val message2 = forum.createNewMessage(2, "Hello from Anna")
    val message3 = forum.createNewMessage(1, "Hello from Bob2")
    val message4 = forum.createNewMessage(2, "Hello from Anna2")

    forum.printThread()

}