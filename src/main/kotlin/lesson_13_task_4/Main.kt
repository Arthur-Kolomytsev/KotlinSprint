package org.example.lesson_13_task_4

fun main() {

    val contact1 = addContact(name = "Anna", phoneNumber = 11, company = "company-1")
    val contact2 = addContact(name = "Bob", phoneNumber = null, company = "company-2")
    val contact3 = addContact(name = "Tom", phoneNumber = 13, company = null)

    val contacts = listOf<Contact?>(contact1, contact2, contact3)

    contacts.forEach {
        println(it)
    }

}


fun addContact(name: String, phoneNumber: Long?, company: String? = null): Contact? {
    if (phoneNumber == null) {
        println("Добавьте номер телефона для контакта $name")
        return null
    }

    return Contact(name, phoneNumber, company)
}
