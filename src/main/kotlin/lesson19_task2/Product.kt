package org.example.lesson19_task2

class Product(
    val name: String,
    val id: Int,
    val category: CategoryOfProducts,
    ) {

    fun showProductInfo(){
        println("Category of product: ${category.getCategory()}")
    }

}
