package org.example.lesson_14_task_4

fun main() {

    val sputnik1 = Sputnik(name = "Fobos", hasAtmosphere = false)
    val sputnik2 = Sputnik(name = "Deimos", hasAtmosphere = false)

    val planetMars = Planet(name = "Mars", hasAtmosphere = false, sputniks = listOf(sputnik1, sputnik2))

}