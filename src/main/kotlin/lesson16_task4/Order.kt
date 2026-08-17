package org.example.lesson16_task4

class Order(
    private val number: Int,
    private var isReady: Boolean,
) {

    private fun changeStatus(): Boolean {
        if (isReady) {
            return false
        }
        else return true
    }

    fun sendOrder(status: Boolean) {
        isReady = changeStatus()
    }
}
