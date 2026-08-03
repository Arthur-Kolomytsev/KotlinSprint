package org.example.lesson_10

import kotlin.collections.List

const val LOGIN = "Artur"
const val PASSWORD = "123456"

fun main() {

    println(checkAuthorization("Artur", "123456"))

    print("Enter login: ")
    val userLogin = readln()

    print("Enter password: ")
    val userPassword = readln()

    val token = checkAuthorization(userLogin, userPassword)

    if (token != null) {
        println(getProducts(token))
    } else {
        println("User not found")
    }

}


var validToken: String? = null

fun checkAuthorization(login: String, password: String): String? {

    if (login == LOGIN && password == PASSWORD) {
        val token = StringBuilder()
        val listOfsymbols = ('A'..'Z').toList() + ('a'..'z').toList() + ('0'..'9').toList()
        repeat(32) {
            token.append(listOfsymbols.random())
        }
        validToken = token.toString()
        return validToken
    } else return null

}


fun getProducts(token: String): List<String>? {
    if (token != validToken) {
        return null
    } else return listOf("p1", "p2", "p3")
}




