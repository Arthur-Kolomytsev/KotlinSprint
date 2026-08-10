package org.example.lesson_13_task_4

class Contact(
    var name: String,
    var phoneNumber: Long,
    var company: String?,

    ) {


    override fun toString(): String {
        return "Contact(name='$name', phoneNumber=$phoneNumber, company=$company)"
    }

}
