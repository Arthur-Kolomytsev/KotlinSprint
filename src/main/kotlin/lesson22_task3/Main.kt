package org.example.lesson22_task3

fun main() {

    val user = User("Ivan", 35, "Moscow")

    val(name, age, city) = user

    println(name)
    println(age)
    println(city)

}


data class User(
    val name: String,
    val age: Int,
    val city: String,
)