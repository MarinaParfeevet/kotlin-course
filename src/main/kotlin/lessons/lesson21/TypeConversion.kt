package ru.stimmax.lessons.lesson21

fun main() {
    val obj: Any = "Hello, World!"
    if (obj is String) {
        println("Объект является строкой")
    }
    if (obj !is Int) {
        println("Объект не является целым числом")
    }


//    Явное преобразование типов с as и as?
//    Для явного преобразования типов можно использовать оператор as. Однако следует быть осторожным: as может привести
//    к исключению ClassCastException, если объект не может быть приведён к указанному типу.

    val num: Any = 123
    val str: String = num as String // Выбросит ClassCastException


    // Для безопасного преобразования с возможностью получения null, если объект не принадлежит к нужному типу, можно
    // использовать оператор as?.

    val safeStr: String? = num as? String // safeStr будет равно null

//    Работа с нулевыми и не нулевыми типами
//    Преобразование типов в Kotlin тесно связано с системой типов, которая различает нулевые (nullable) и не нулевые
//    (non-nullable) типы.

    val nullableStr: String? = "Kotlin"
    val nonNullableStr: String = nullableStr as String // Явное приведение типа


   // Примеры
  //  Рассмотрим пример, где нужно обработать список объектов различных типов, и для каждого типа выполнить специфическое
    //  действие:

    val mixedList: List<Any> = listOf("Kotlin", 42, 3.14, "Java", true)
    for (item in mixedList) {
        when (item) {
            is String -> println("$item - строка длиной ${item.length}")
            is Int -> println("$item - целое число")
            is Double -> println("$item - вещественное число")
            else -> println("Неизвестный тип")
        }
    }
}
