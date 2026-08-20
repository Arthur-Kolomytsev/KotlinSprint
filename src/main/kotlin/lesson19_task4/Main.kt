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


    fun loadMissile(m: Missile) = when(m) {
        Missile.BLUE -> damage = 5
        Missile.GREEN -> damage = 10
        Missile.RED -> damage = 20
    }

    fun fire(){
        println("Damage = $damage")
    }

}

enum class Missile {
    BLUE,
    GREEN,
    RED,
}