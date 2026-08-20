package org.example.lesson19_task2

enum class CategoryOfProducts {
    CLOTHES {
        override fun getCategory(): String {
            return CLOTHES.name
        }
    },
    STATIONERY {
        override fun getCategory(): String {
            return STATIONERY.name
        }
    },
    OTHER {
        override fun getCategory(): String {
            return OTHER.name
        }
    };

    abstract fun getCategory(): String
}

