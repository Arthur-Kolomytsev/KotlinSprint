package org.example.lesson_11_task_4

class Recipe(

    val id: String,
    val name: String,
    val listOfIngredients: MutableList<Ingredient>,
    val unit: String,
    val amount: Int,
    val isFavourites: Boolean = false,
    val imageUrl: String,

) {

}