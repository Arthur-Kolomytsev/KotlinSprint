package org.example.lesson17_task1

class Quiz(_question: String, _answer: String) {

    val question = _question
        get() = field

    var answer = _answer
        set(value) {
            field = value
        }
        get() = field

}

fun main() {

    val quiz = Quiz("Question", "Answer")

    println(quiz.question)
    println(quiz.answer)

}

