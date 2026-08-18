package org.example.lesson17_task1

class Quiz(private val _question: String, private var _answer: String) {

    val question: String
        get() = _question

    var answer: String
        set(value) {
            _answer = value
        }
        get() = _answer


}

