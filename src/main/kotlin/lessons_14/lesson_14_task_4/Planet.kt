package org.example.lesson_14_task_4

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isLanding: Boolean,
    val sputniks: List<Sputnik>,
    ) : CelestialBody(name, hasAtmosphere, isLanding)

{
    fun showSputniks(sputniks: List<Sputnik>) : String {
        val result = sputniks.map { it.name }.toString()
        return result
    }

    override fun showInfo() {
        println("Name: $name\n" +
                "Has Atmosphere: $hasAtmosphere\n" +
                "You can landing: $isLanding\n" +
                "Sputniks: ${showSputniks(sputniks)}")
    }
}