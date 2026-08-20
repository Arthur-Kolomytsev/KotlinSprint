package org.example.lesson19_task2

class Product(
    val name: String,
    val id: Int,
    val category: CategoryOfProducts,
    ) {

    fun showProductInfo(){
        println("Product name: $name\n" +
                "Product id: $id\n" +
                "Product category: ${category.getCategory()}")
    }

}
