package org.example.lesson18_task3

class Cat(override val name: String) : Animal(name) {

    override fun eat() {
        println("$name -> eat fish")
    }

}