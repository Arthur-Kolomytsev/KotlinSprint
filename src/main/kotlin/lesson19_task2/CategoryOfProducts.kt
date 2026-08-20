package org.example.lesson19_task2

enum class CategoryOfProducts {
    CLOTHES {
        override fun getCategory(): String = "Clothes"
    },
    STATIONERY {
        override fun getCategory(): String = "Stationery"
    },
    OTHER {
        override fun getCategory(): String = "Other"
    };

    abstract fun getCategory(): String
}

