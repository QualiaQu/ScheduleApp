package ru.thever4.lessons.lesson4_2

enum class Days {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    override fun toString(): String {
        return when (this) {
            MONDAY -> "Понедельник"
            TUESDAY -> "Вторник"
            WEDNESDAY -> "Среда"
            THURSDAY -> "Четверг"
            FRIDAY -> "Пятница"
            SATURDAY -> "Суббота"
            SUNDAY -> "Воскресенье"
        }
    }
}

