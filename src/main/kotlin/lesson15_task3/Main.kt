package org.example.lesson15_task3

fun main() {

    val admin = AdminUser("Artur")
    val user = RegularUser("Anna")

    admin.read()
    admin.write()
    admin.delete()

    user.read()
    user.write()

}