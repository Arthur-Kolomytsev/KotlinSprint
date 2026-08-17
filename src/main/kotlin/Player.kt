package org.example

class Player(
    val name: String,
    private var health: Int,
    private var power: Int
) {

    fun damage(damage: Int) {
        health -= damage
        if (health <= 0) death()
    }

    fun treatment(treatment: Int) {
        if (health > 0) health += treatment
    }

    private fun death() {
        health = 0
        power = 0
    }

    fun showInfo() {
        println(
            "Player: \"$name\"\n" +
                    "Health = $health\n" +
                    "Power = $power\n"
        )
    }

}

fun main() {

    val player = Player(name = "X", health = 100, power = 10)
    player.showInfo()
    player.damage(80)
    player.treatment(100)
    player.showInfo()
    player.damage(50)
    player.showInfo()
    player.damage(70)
    player.showInfo()

}