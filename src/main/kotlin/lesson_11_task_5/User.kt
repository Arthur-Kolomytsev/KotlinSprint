package org.example.lesson_11_task_5

class User private constructor(
    val userId: Int,
    val userName: String,


    ) { class Builder {

    private var userId: Int = 0
    private var userName: String = ""

    fun setUserId(userId: Int) = apply { this.userId = userId }

    fun setUserName(userName: String) = apply { this.userName = userName }

    fun build(): User {
        return User(userId, userName)
    }


}

}