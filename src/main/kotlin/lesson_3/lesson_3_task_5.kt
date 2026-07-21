package org.example.lesson_3

fun main() {

    val chessMove = "D2-D4;0"
    val parseChessMove = chessMove.split("-", ";")

    val from = parseChessMove[0]
    val to = parseChessMove[1]
    val numberOfMove = parseChessMove[2]

    println(from)
    println(to)
    println(numberOfMove)

}