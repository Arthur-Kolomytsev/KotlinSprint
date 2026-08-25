package org.example.lesson21_task3

fun main() {

    val player1 = Player("X", 85, 100)
    val player2 = Player("X", 100, 100)

    println(player1.isHealthy())
    println(player2.isHealthy())

}

class Player(
    val name: String,
    val currentHealth: Int,
    val maxHealth: Int,
)

fun Player.isHealthy(): Boolean { return currentHealth == maxHealth }