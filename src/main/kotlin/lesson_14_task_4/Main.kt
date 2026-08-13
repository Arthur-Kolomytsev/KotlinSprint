package org.example.lesson_14_task_4

fun main() {

    val sputnik1 = Sputnik(name = "Fobos", hasAtmosphere = false, isLanding = false)
    val sputnik2 = Sputnik(name = "Deimos", hasAtmosphere = false, isLanding = false)

    val planetMars = Planet(name = "Mars", hasAtmosphere = false, isLanding = true, sputniks = listOf(sputnik1, sputnik2))

    planetMars.showInfo()

}