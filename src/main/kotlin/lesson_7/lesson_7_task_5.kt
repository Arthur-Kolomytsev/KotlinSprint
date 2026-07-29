package org.example.lesson_7

fun main() {

    val password = mutableListOf<Char>()

    val upperCaseLetter = ('A'..'Z').toList()
    val lowerCaseLetter = ('a'..'z').toList()
    val digits = ('1'..'9').toList()

    val allChars = upperCaseLetter + lowerCaseLetter + digits

    password += upperCaseLetter.random()
    password += lowerCaseLetter.random()
    password += digits.random()

    do {
        print("Enter a password length: ")
        val passwordLength = readln().toInt()
        if (passwordLength >= 6) {
            repeat(passwordLength - 3) {
                password += allChars.random()
            }
            break
        }
    } while (true)

    password.shuffle()

    val result = password.joinToString("")

    println(result)

}
