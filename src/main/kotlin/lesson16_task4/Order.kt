package org.example.lesson16_task4

class Order(
    private var number: Int,
    private var isReady: Boolean,
) {

    private fun changeStatus() {
        if (isReady) {
            isReady = false
        }
        else isReady = true
    }

    fun sendOrder(status: Boolean) {
        changeStatus()
    }
}
