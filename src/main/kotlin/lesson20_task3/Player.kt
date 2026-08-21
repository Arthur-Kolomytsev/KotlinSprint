package org.example.lesson20_task3

class Player(val hasKey: Boolean)


fun main() {

    val checkKey: (Player) -> String = { if (it.hasKey) "Игрок открыл дверь" else "Дверь заперта" }

}