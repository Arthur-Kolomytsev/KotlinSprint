package org.example.lesson19_task5

class User private constructor(val name: String, val gender: Gender) {

    override fun toString(): String {
        return "[Name: $name; Gender: $gender]"
    }

    companion object {

        fun createUser(name: String, gender: String): User {
            val gender = if (gender == "man") Gender.MAN else if (gender == "woman") Gender.WOMAN else Gender.UNKNOWN
            return User(name, gender)

        }
    }
}

enum class Gender { MAN, WOMAN, UNKNOWN }

fun main() {

    val users = mutableListOf<User>()

    println("Enter users name (Name) ang gender (man / woman)\n")

    do {

        print("Please enter user name: ")
        val userName = readln()

        print("Please enter user gender (man / woman): ")
        val userGender = readln()

        val u = User.createUser(userName, userGender)
        users.add(u)

        if (users.size == 5) {
            println(users.joinToString(", "))
            break
        }

    } while (true)

}

