package org.example.lesson_11_task_3

class User(
    val name: String,
    val avatar: String,
    var status: String = ""
) {

    fun updateStatus(s: String) {
        status = s
    }


}