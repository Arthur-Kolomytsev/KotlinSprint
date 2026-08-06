package org.example.lesson_11_task_5

class Message private constructor(
    val authorId: Int,
    val message: String,


    ) { class Builder{

    private var authorId: Int = 0
    private var message = ""

    fun setAuthorId(authorId: Int) = apply { this.authorId = authorId }

    fun setMessage(msg: String) = apply { this.message = msg }

    fun build(): Message {
        return Message(authorId, message)
    }


}
}