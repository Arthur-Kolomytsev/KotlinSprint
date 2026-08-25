package org.example.lesson22_task2

fun main() {

    val book = RegularBooks("name-1", "author-1")

    val dataBook = DataBooks("name-2", "author-2")


    println(book) //  в обычном классе метод toString() не переопределен и вызывает реализацию по умолчанию ПолноеИмяКласса@ХешКод
    println(dataBook) // в data классе метод toString() переопределен и выводит объект в читаемом виде

}

class RegularBooks(val name: String, val author: String)

data class DataBooks(val name: String, val author: String)