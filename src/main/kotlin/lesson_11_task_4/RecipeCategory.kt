package org.example.lesson_11_task_4

class RecipeCategory(

    val id: String,
    val name: String,
    val description: String,
    val isFavourites: Boolean = false,
    val imageUrl: String,
    val listOfIngredients: MutableList<Recipe>,



) {

}