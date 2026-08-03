package org.example.lesson_10

fun main() {

    print("Введите длину пароля: ")

    println(loginGenerator(readln().toInt()))

}

fun loginGenerator(length: Int): String {
    val digits = ('0'..'9').toList()
    val specialChars = " !\"#$%&'()*+,-./".toList()
    var password = ""

    for(i in 0 until  length) {
        if (i % 2 == 0) password += digits.random()
        else password += specialChars.random()
    }

    return password
}
