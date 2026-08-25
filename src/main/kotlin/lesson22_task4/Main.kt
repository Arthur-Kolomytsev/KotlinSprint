package org.example.lesson22_task4

fun main() {

}


class MainScreenViewModel(
    private var mainScreenState: MainScreenState = MainScreenState(data = "")
) {

    data class MainScreenState(val data: String, val isLoading: Boolean = false)

    fun loadData() {
        mainScreenState = mainScreenState.copy(data = "")
        mainScreenState = mainScreenState.copy(isLoading = true)
        mainScreenState = mainScreenState.copy(data = "loaded data", isLoading = false)
    }

}

