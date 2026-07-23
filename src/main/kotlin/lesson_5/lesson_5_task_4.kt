package org.example.lesson_5


fun main() {

    val userName = "Zaphod"
    val userPassword = "PanGalactic"

    print("Enter your name: ")
    val name = readln()
    val password: String

    if (name == userName) {
        print("Enter a password: ")
        password = readln()
        if (password == userPassword) println("Welcome!") else println("Invalid password")
    } else println("You need to sign out!")

}