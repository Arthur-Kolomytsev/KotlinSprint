package org.example.lesson_13_task_2

class PhoneBook2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,

 ) {

    fun printContact() {
        val name = name
        val phoneNumber = phoneNumber
        val company = company ?: "<не указано>"

        println("Имя: $name\n" +
                "Номер: $phoneNumber\n" +
                "Компания: $company")
    }

}