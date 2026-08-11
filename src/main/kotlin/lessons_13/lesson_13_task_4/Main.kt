package org.example.lesson_13_task_4

fun main() {

    val contacts = mutableListOf<Contact>()

    print("Enter user name: ")
    val userName = readln()

    print("Enter a phone number: ")
    val userPhoneNumber = readln().toLongOrNull()

    print("Enter a name of company: ")
    val input = readln()
    val userCompany = if (input.isBlank()) null else input


    val contact1 = addContact(userName, userPhoneNumber, userCompany)

    if (contact1 != null) {
        contacts.add(contact1)
    }

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
