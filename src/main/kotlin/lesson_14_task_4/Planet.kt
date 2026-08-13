package org.example.lesson_14_task_4

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isLanding: Boolean,
    val sputniks: List<Sputnik>,
    ) : CelestialBody(name, hasAtmosphere, isLanding)

