package org.example.lesson22_task5

import java.time.LocalDateTime

fun main() {

    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "It is the closest star system to the Sun",
        eventDateTime = LocalDateTime.now(),
        distanceFromEarth = 4.37
    )

    val name = alphaCentauri.component1()
    val description = alphaCentauri.component2()
    val eventDateTime = alphaCentauri.component3()
    val distanceFromEarth = alphaCentauri.component4()


    println("Name: $name")
    println("Description: $description")
    println("Date and Time: $eventDateTime")
    println("Distance from Earth: $distanceFromEarth")

}

data class GalacticGuide(
    val name: String,
    val description: String,
    val eventDateTime: LocalDateTime,
    val distanceFromEarth: Double,
)