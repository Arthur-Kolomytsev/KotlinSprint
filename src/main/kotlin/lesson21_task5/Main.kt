package org.example.lesson21_task5

fun main() {

    val map = mapOf<String, Int>(
        "power" to 100,
        "speed" to 30,
        "life" to 3
    )

    println(map.maxCategory())


}

fun Map<String, Int>.maxCategory(): String? {
    return maxByOrNull { it.value }?.key
}
