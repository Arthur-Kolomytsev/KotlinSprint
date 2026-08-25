package org.example.lesson22_task1

fun main() {

    val book1 = RegularBook("name-1", "author-1")
    val book2 = RegularBook("name-1", "author-1")

    val dataBook1 = DataBook("name-2", "author-2")
    val dataBook2 = DataBook("name-2", "author-2")

    println(book1 == book2) // false так как оператор == для обычных классов сравнивает ссылки на объект
    println(dataBook1 == dataBook2) // true так как оператор == для data классов сравнивает объекты по их состоянию

}

class RegularBook(val name: String, val author: String)

data class DataBook(val name: String, val author: String)
