package org.example.lesson_13_task_3

fun main() {

    val contacts = listOf<PhoneBook3>(
        PhoneBook3(name = "Anna", phoneNumber = 11, company = "company-1"),
        PhoneBook3(name = "Ivan", phoneNumber = 12, company = "company-2"),
        PhoneBook3(name = "Bob", phoneNumber = 13, company = "company-3"),
        PhoneBook3(name = "Alice", phoneNumber = 14, company = null),
        PhoneBook3(name = "Max", phoneNumber = 15, company = "company-5"),
    )

    val result1 = contacts.mapNotNull { it.company }.distinct()

    println(result1)

}