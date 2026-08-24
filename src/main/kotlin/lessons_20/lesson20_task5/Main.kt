package org.example.lesson20_task5


fun main() {

    val robot = Robot()

    robot.say()

    robot.setModifier { s -> s.split(" ").reversed().joinToString(" ") }

    robot.say()

}


class Robot {

    val phrases = listOf(
        "Hello world",
        "I am robot",
        "Blue sea",
        "Dog is friend of human",
        "lll aaa ggg bbb"
    )

    var myModifier: (String) -> String = { it }

    fun say() {
        val phrase = phrases.random()
        println(myModifier(phrase))
    }

    fun setModifier(mod: (String) -> String) {
        myModifier = mod
    }
}


