package org.example.lesson18_task3

class Fox(override val name: String) : Animal(name) {

    override fun eat() {
        println("$name -> eat berries")
    }

}