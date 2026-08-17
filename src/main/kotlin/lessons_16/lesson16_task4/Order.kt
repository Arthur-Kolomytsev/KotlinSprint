package org.example.lesson16_task4

class Order(
    private val number: Int,
    private var isReady: Boolean,
) {

    private fun changeStatus(status: Boolean) {
        isReady = status
    }

    fun sendOrder(status: Boolean) {
        changeStatus(status)
    }
}
