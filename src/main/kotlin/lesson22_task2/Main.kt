package org.example.lesson22_task2

fun main() {

    val book = RegularBook("name-1", "author-1")

    val dataBook = DataBook("name-2", "author-2")


    println(book) //  в обычном классе метод toString() не переопределен и вызывает реализацию по умолчанию ПолноеИмяКласса@ХешКод
    println(dataBook) // в data классе метод toString() переопределен и выводит объект в читаемом виде

}

class RegularBook(val name: String, val author: String)

data class DataBook(val name: String, val author: String)