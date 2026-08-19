package org.example.lesson18_task3

abstract class Animal(open val name: String) {

    abstract fun eat()

    open fun sleep() {
        println("$name sleep")
    }

}