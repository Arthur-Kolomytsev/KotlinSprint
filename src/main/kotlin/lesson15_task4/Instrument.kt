package org.example.lesson15_task4

class Instrument(
    name: String
) : Product(name), Searchable {
    override fun search() {
        println("Searching process")
    }
}