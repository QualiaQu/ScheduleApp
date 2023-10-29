package ru.thever4.lessons.lesson4_2


object ScheduleDataStorage {
    val scheduleFirstWeek = listOf(
        Day(
            ofWeek = Days.TUESDAY,
            listOf(
                Lesson(
                    name = "ЭКОНОМИКА ПРОГРАММНОЙ ИНЖЕНЕРИИ (ЛЕК.)",
                    lecturer = "ТКАЧ Е.С",
                    cabinet = "АУД. 221 (Л.З.) (2 корпус)"
                ),
                Lesson(
                    name = null,
                    lecturer = null,
                    cabinet = null
                ),
                Lesson(
                    name = "БАЗЫ И ХРАНИЛИЩА ДАННЫХ (ЛЕК.)",
                    lecturer = "БАРАБАНЩИКОВ И.В.",
                    cabinet = "АУД. 413"
                ),
                Lesson(
                    name = "БАЗЫ И ХРАНИЛИЩА ДАННЫХ (ЛЕК.)",
                    lecturer = "БАРАБАНЩИКОВ И.В.",
                    cabinet = "АУД. 413"
                ),
            )

        ),
        Day(
            ofWeek = Days.WEDNESDAY,
            listOf(
                Lesson(
                    name = "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕННЫМ ЦИКЛОМ ПО (ЛЕК.)",
                    lecturer = "Андрей и Влад",
                    cabinet = "200"
                ),
                Lesson(
                    name = "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕННЫМ ЦИКЛОМ ПО (ПР.)",
                    lecturer = "Андрей и Влад",
                    cabinet = "200"
                ),
            )
        ),
        Day(
            ofWeek = Days.THURSDAY,
            listOf(
                Lesson(
                    name = "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕННЫМ ЦИКЛОМ ПО (ЛЕК.)",
                    lecturer = "Андрей и Влад",
                    cabinet = "200"
                ),
                Lesson(
                    name = "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕННЫМ ЦИКЛОМ ПО (ПР.)",
                    lecturer = "Андрей и Влад",
                    cabinet = "200"
                ),
            )
        )
    )
}
