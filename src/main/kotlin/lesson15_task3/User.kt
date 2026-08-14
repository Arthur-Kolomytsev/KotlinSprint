package org.example.lesson15_task3

abstract class User(val name: String) {
    open fun read() {
        println("$name is reading message")
    }

    open fun write() {
        println("$name is writing message")
    }
}