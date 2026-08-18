package org.example.lesson17_task3

class Folder (_name: String, _numberOfFiles: Int, private var isSecret: Boolean) {

    val name = _name
        get() = if (isSecret) "Secret folder" else field


    val numberOfFiles = _numberOfFiles
        get() = if (isSecret) 0 else field

}


fun main() {

    val folder1 = Folder("myFolder", 10, true)
    println(folder1.name)
    println(folder1.numberOfFiles)

    val folder2 = Folder("Work", 15, false)
    println(folder2.name)
    println(folder2.numberOfFiles)

}