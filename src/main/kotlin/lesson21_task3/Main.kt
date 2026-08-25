package org.example.lesson21_task3

fun main() {

    val player1 = Player("X", 85)
    val player2 = Player("X", 100)

    println(player1.isHealthy())
    println(player2.isHealthy())

}

class Player(val name: String, var currentHealth: Int) {
    val maxHealth = 100
}

fun Player.isHealthy(): Boolean { return this.currentHealth == this.maxHealth }