package org.example.lesson_3

fun main() {

    var from = "E2"
    var to = "E4"
    var chessMoveNumber = 1

    var chessMove = "[$from-$to;$chessMoveNumber]"
    println(chessMove)

    from = "D2"
    to = "D3"
    chessMoveNumber = 2

    chessMove = "[$from-$to;$chessMoveNumber]"
    println(chessMove)


}