package org.example.lesson19_task4

fun main() {

    val tank = Tank()
    tank.loadMissile(Missile.RED)
    tank.fire()
    tank.loadMissile(Missile.BLUE)
    tank.fire()
    tank.loadMissile(Missile.GREEN)
    tank.fire()

}

class Tank {

    var damage: Int = 0

    fun loadMissile(m: Missile) {
        damage = m.missileDamage
    }

    fun fire() {
        println("Damage = $damage")
    }

}

enum class Missile(val missileDamage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}