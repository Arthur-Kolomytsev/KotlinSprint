package org.example.lesson18_task3


fun main() {

    val fox = Fox("fox")
    val dog = Dog("dog")
    val cat = Cat("cat")

    val animals = listOf<Animal>(fox, dog, cat)
    animals.forEach { it.eat() }

}
