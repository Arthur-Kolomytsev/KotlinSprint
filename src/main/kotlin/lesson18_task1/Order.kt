package org.example.lesson18_task1

class Order(val number: Int) {

    var nameOfProduct: String = ""
    var products: MutableList<String> = mutableListOf()


    fun addProducts(s: String) {
        nameOfProduct = s
        println("Заказан товар: [$nameOfProduct]")
    }

    fun addProducts(list: List<String>) {
        val l = list.toMutableList()
        products.addAll(l)
        print("Заказаны следующие товары: ")
        println(products.joinToString(", ") { "[$it]" })
    }
}

fun main() {

    val order1 = Order(1)
    val order2 = Order(2)

    order1.addProducts("Milk")
    order2.addProducts(listOf("Milk", "Salt", "Bred"))

}
