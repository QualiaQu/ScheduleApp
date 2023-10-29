package ru.thever4.lessons.lesson4_2

import java.time.LocalTime

data class Lesson(
    val name: String?,
    val lecturer: String?,
    val cabinet: String?,
    val startTime: LocalTime,
    val endTime: LocalTime
)

