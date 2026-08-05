package org.example.lesson_11_task_3


class Room(
    val cover: String,
    val title: String,
    val listOfUsers: MutableList<User>,

    ) {

    fun addUser(u: User){
        listOfUsers += u
    }

    fun updateUserStatus(name: String, s: String){
        listOfUsers.find { it.name == name }?.updateStatus(s)
    }


}