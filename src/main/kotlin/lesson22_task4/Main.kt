package org.example.lesson22_task4

fun main() {

}


data class MainScreenState(val data: String, val isLoading: Boolean = false)


class MainScreenViewModel(val mainScreenState: MainScreenState) {

    fun loadData() {
        val state1 = mainScreenState.copy(data = "")
        val state2 = mainScreenState.copy(data = "", isLoading = true)
        val state3 = mainScreenState.copy(data = "loaded data")
    }
}