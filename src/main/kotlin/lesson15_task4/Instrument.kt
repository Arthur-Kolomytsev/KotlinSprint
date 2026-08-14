package org.example.lesson15_task4

class Instrument(
    name: String,
    stock: Int
) : Product(name, stock), Searchable {

    override fun search() {
        println("Выполняется поиск")
    }
}