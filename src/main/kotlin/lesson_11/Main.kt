package org.example.lesson_11

fun main() {

    val user1 = User(id = 111, login = "user1", password = "12345")
    val user2 = User(id = 222, login = "user2", password = "54321")

    println("user1 id: ${user1.id}\n" +
            "user1 login: ${user1.login}\n" +
            "user1 password: ${user1.password}")

    println()

    println("user2 id: ${user2.id}\n" +
            "user2 login: ${user2.login}\n" +
            "user2 password: ${user2.password}")

}