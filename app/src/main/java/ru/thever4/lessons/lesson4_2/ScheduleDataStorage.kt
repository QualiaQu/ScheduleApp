package ru.thever4.lessons.lesson4_2


object ScheduleDataStorage {
    val scheduleFirstWeek = listOf(
        Day(
            ofWeek = Days.TUESDAY,
            startsWith = 5,
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
            startsWith = 7,
            listOf(
                Lesson(
                    name = "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕННЫМ ЦИКЛОМ ПО (ЛЕК.)",
                    lecturer = "Андрей и Влад",
                    cabinet = "АУД. 200"
                ),
                Lesson(
                    name = "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕННЫМ ЦИКЛОМ ПО (ПР.)",
                    lecturer = "Андрей и Влад",
                    cabinet = "АУД. 200"
                ),
            )
        ),
        Day(
            ofWeek = Days.THURSDAY,
            startsWith = 6,
            listOf(
                Lesson(
                    name = "АНАЛИЗ ДАННЫХ (ЛЕК.)",
                    lecturer = "АЛЮКОВ С.В",
                    cabinet = "А-13"
                ),
                Lesson(
                    name = "БАЗЫ И ХРАНИЛИЩА ДАННЫХ (ПР.)",
                    lecturer = "БАРАБАНЩИКОВ И.В",
                    cabinet = "АУД. 132"
                ),
                Lesson(
                    name = "БАЗЫ И ХРАНИЛИЩА ДАННЫХ (ПР.)",
                    lecturer = "БАРАБАНЩИКОВ И.В",
                    cabinet = "АУД. 132"
                ),
        )

    ),
        Day(
            ofWeek = Days.FRIDAY,
            startsWith = 8,
            listOf(
                Lesson(
                    name = "РАЗРАБОТКА ИНТЕРНЕТ-ПРИЛОЖЕНИЙ (ПР.)",
                    lecturer = "ПАВЛИЧЕНКОВ Е.А",
                    cabinet = "АУД. 132"
                ),
            )

        ),
        Day(
            ofWeek = Days.SATURDAY,
            startsWith = 2,
            listOf(
                Lesson(
                    name = "ТЕХНОЛОГИИ ПРИКЛАДНОГО ПРОГРАММИРОВАНИЯ (ЛЕК.)",
                    lecturer = "ВЕРИГИН Н.В.",
                    cabinet = "АУД. 132"
                ),
                Lesson(
                    name = "ТЕХНОЛОГИИ ПРИКЛАДНОГО ПРОГРАММИРОВАНИЯ (ПР.)",
                    lecturer = "ВЕРИГИН Н.В.",
                    cabinet = "АУД. 132"
                ),
                Lesson(
                    name = "ТЕХНОЛОГИИ ПРИКЛАДНОГО ПРОГРАММИРОВАНИЯ (ПР.)",
                    lecturer = "ВЕРИГИН Н.В.",
                    cabinet = "АУД. 132"
                ),
                Lesson(
                    name = "ТЕХНОЛОГИИ ПРИКЛАДНОГО ПРОГРАММИРОВАНИЯ (ПР.)",
                    lecturer = "ВЕРИГИН Н.В.",
                    cabinet = "АУД. 132"
                ),
            )

        ),



    )

    val scheduleSecondWeek = listOf(
        Day(
            ofWeek = Days.TUESDAY,
            startsWith = 6,
            listOf(
                Lesson(
                    name = "ЭКОНОМИКА ПРОГРАММНОЙ ИНЖЕНЕРИИ (ПР.)",
                    lecturer = "ТКАЧ Е.С",
                    cabinet = "АУД. 304(2 корпус)"
                ),
                Lesson(
                    name = "ЭКОНОМИКА ПРОГРАММНОЙ ИНЖЕНЕРИИ (ПР.)",
                    lecturer = "ТКАЧ Е.С",
                    cabinet = "АУД. 304(2 корпус)"
                ),
            )
        ),
        Day(
            ofWeek = Days.WEDNESDAY,
            startsWith = 7,
            listOf(
                Lesson(
                    name = "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕННЫМ ЦИКЛОМ ПО (ЛЕК.)",
                    lecturer = "Андрей и Влад",
                    cabinet = "АУД. 200"
                ),
                Lesson(
                    name = "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕННЫМ ЦИКЛОМ ПО (ПР.)",
                    lecturer = "Андрей и Влад",
                    cabinet = "АУД. 200"
                ),
            )
        ),
        Day(
            ofWeek = Days.THURSDAY,
            startsWith = 6,
            listOf(
                Lesson(
                    name = "АНАЛИЗ ДАННЫХ (ПР.)",
                    lecturer = "АЛЮКОВ С.В",
                    cabinet = "АУД. 132Б"
                ),
                Lesson(
                    name = "АНАЛИЗ ДАННЫХ (ПР.)",
                    lecturer = "АЛЮКОВ С.В",
                    cabinet = "АУД. 132Б"
                ),
                Lesson(
                    name = "БАЗЫ И ХРАНИЛИЩА ДАННЫХ (ПР.)",
                    lecturer = "БАРАБАНЩИКОВ И.В",
                    cabinet = "АУД. 132А"
                ),
            )

        ),
        Day(
            ofWeek = Days.FRIDAY,
            startsWith = 7,
            listOf(
                Lesson(
                    name = "РАЗРАБОТКА ИНТЕРНЕТ-ПРИЛОЖЕНИЙ (ЛЕК.)",
                    lecturer = "ПАВЛИЧЕНКОВ Е.А",
                    cabinet = "АУД. 132"
                ),
                Lesson(
                    name = "РАЗРАБОТКА ИНТЕРНЕТ-ПРИЛОЖЕНИЙ (ПР.)",
                    lecturer = "ПАВЛИЧЕНКОВ Е.А",
                    cabinet = "АУД. 132"
                ),
            )

        ),
        Day(
            ofWeek = Days.SATURDAY,
            startsWith = 2,
            listOf(
                Lesson(
                    name = "ТЕСТИРОВАНИЕ ПРОГРАММНОГО ОБЕСПЕЧЕНИЯ (ПР.)",
                    lecturer = "БУЛАВИН Р.С",
                    cabinet = "АУД. 132"
                ),
                Lesson(
                    name = "ТЕСТИРОВАНИЕ ПРОГРАММНОГО ОБЕСПЕЧЕНИЯ (ПР.)",
                    lecturer = "БУЛАВИН Р.С",
                    cabinet = "АУД. 132"
                ),
            )

        ),
    )
}
