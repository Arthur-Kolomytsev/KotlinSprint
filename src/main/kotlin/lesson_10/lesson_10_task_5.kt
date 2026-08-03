package org.example.lesson_10

import kotlin.collections.List

const val LOGIN = "Artur"
const val PASSWORD = "123456"

fun main() {

    val userLogin = "Artur"
    val userPassword = "123456"
    val token = checkAuthorization(userLogin, userPassword)

    if (getProducts(token) == null) println("Пользователь не зарегистрирован")
    else println(getProducts(token))


}


fun checkAuthorization(login: String, password: String): String? {

    if (login == LOGIN && password == PASSWORD) {
        val token = StringBuilder()
        val listOfsymbols = ('A'..'Z').toList() + ('a'..'z').toList() + ('0'..'9').toList()
        repeat(32) {
            token.append(listOfsymbols.random())
        }
        return token.toString()
    } else return null

}


fun getProducts(token: String?): List<String>? {
    if (token != null) {
        return listOf("Помидоры", "Соль", "Огурцы")
    } else return null
}








