package org.example.lesson20_task2

class User(val name: String, var health: Int) {

    override fun toString(): String {
       return "Name: $name, Health: $health"
    }

}


fun main() {

    val user = User("X1", 50)
    println(user)

    val getHealth: (User) -> Unit = { it.health = 100 }

    getHealth(user)
    println(user)

}