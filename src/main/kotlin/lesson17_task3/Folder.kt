package org.example.lesson17_task3

class Folder (_name: String, var numberOfFiles: Int, private var isSecret: Boolean) {

    val name = _name
        get() = if (isSecret) {
            "\"Secret folder\", number of files = 0"
        } else "Folder \"$field\", number of files = $numberOfFiles"

}


fun main() {

    val folder1 = Folder("myFolder", 10, true)
    println(folder1.name)

    val folder2 = Folder("Work", 15, false)
    println(folder2.name)

}