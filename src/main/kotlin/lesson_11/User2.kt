package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = ""

    ) {

    fun printInfo() {
        println("id: $id\n" +
                "login: $login\n" +
                "password: $password\n" +
                "email: $email\n" +
                "bio: $bio\n")
    }


    fun changePassword() {
        print("Enter a password: ")
        val userPassword = readln()
        if (userPassword != password) {
            println("Incorrect password")
            return
        }
        else {
            print("Enter a new password: ")
            val newUserPassword = readln()
            password = newUserPassword
            println("Password successfully changed")
        }

    }

    fun inputBio() {
        print("Add information about yourself: ")
        bio = readln()
    }

}