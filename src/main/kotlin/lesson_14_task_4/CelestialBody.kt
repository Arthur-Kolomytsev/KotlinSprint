package org.example.lesson_14_task_4

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isLanding: Boolean,
) {

    open fun showInfo() {
        println("Name: $name\n" +
                "Has Atmosphere: $hasAtmosphere\n" +
                "You can landing: $isLanding\n")
    }

}