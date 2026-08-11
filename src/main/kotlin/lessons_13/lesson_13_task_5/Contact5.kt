package org.example.lesson_13_task_5

class Contact5(
    val name: String,
    val phoneNumber: Long,

    ) {


    override fun toString(): String {
        return "Contact(name='$name', phoneNumber=$phoneNumber)"
    }

}