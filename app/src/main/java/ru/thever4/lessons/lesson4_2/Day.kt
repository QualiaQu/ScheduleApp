package ru.thever4.lessons.lesson4_2

data class Day(
    val ofWeek: Days,
    val startsWith: Int,
    val lessons: List<Lesson>
)