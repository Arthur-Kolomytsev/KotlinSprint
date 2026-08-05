package org.example.lesson_11_task_4

class Recipe(

    val name: String,
    val listOfIngredients: MutableList<Ingredient>,
    val amount: Int,
    val item: String,
    val numberOfPortion: Int,
    val isFavourites: Boolean = false

) {

}