package org.example.lesson18_task3

class Dog(override val name: String) : Animal(name) {

    override fun eat() {
        println("$name -> ест кости")
    }

}