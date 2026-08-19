package org.example.lesson18_task5

class Screen() {

    fun drawPoint(x: Int, y: Int): String {
        return "Drew point with coordinates X=$x, Y=$y"
    }

    fun drawPoint(x: Double, y: Double): String {
        return "Drew point with coordinates X=$x, Y=$y"
    }

    fun drawCircle(x: Int, y: Int): String {
        return "Drew circle with coordinates X=$x, Y=$y"
    }

    fun drawCircle(x: Double, y: Double): String {
        return "Drew circle with coordinates X=$x, Y=$y"
    }

    fun drawSquare(x: Int, y: Int): String {
        return "Drew square with coordinates X=$x, Y=$y"
    }

    fun drawSquare(x: Double, y: Double): String {
        return "Drew square with coordinates X=$x, Y=$y"
    }

}