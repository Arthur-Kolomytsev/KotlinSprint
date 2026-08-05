package org.example.lesson_11

fun main() {

//    val user1 = User(id = 111, login = "user1", password = "12345", email = "user1@gmail.com")
//    val user2 = User(id = 222, login = "user2", password = "54321", email = "user2@gmail.com")
//
//    println("user1 id: ${user1.id}\n" +
//            "user1 login: ${user1.login}\n" +
//            "user1 password: ${user1.password}\n" +
//            "user1 email: ${user1.email}")
//
//    println()
//
//    println("user2 id: ${user2.id}\n" +
//            "user2 login: ${user2.login}\n" +
//            "user2 password: ${user2.password}\n" +
//            "user2 email: ${user2.email}")

    val user = User2(id = 222, login = "user2", password = "54321", email = "user2@gmail.com")


    user.printInfo()
    user.inputBio()
    user.changePassword()
    user.printInfo()

}