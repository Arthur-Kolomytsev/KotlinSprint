package org.example.lesson_11_task_3

class User(
    val name: String,
    var staus: String = ""
) {

    fun updateStatus(s: String) {
        staus = s
    }



}