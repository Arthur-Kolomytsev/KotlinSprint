package org.example.lesson17_task5

class User(login: String, password: String) {

    var login: String = login
        set(value) {
            field = value
            println("Login successfully changed")
        }

    var password: String = password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }

}

fun main() {
    val user = User(login = "user1234", password = "12345")
    println(user.login)
    println(user.password)
    user.password = "054321"
    user.login = "USER"
    println(user.login)
}