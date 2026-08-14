package org.example.lesson15_task1

class Duck : Swimmable, Flyable {
    override fun fly() {
        println("Duck is flying")
    }

    override fun swim() {
        println("Duck is swimming")
    }
}
