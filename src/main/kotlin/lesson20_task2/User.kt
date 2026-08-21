package org.example.lesson20_task2

class User(val name: String, var health: Int) {

    val maxHealth = 100

    override fun toString(): String {
        return "Name: $name, Health: $health"
    }

}


fun main() {

    val user = User("X1", 50)
    println(user)

    val getHealth: (User) -> Unit = { it.health = it.maxHealth }

    getHealth(user)
    println(user)

}