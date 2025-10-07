package ru.stimmax.lessons.lesson10

fun main() {
    val pair = 1 to "a"

    val emptyMap = mapOf<String, String>()

    val capitals = mapOf("Россия" to "Москва", "Франция" to "Париж")
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")

    //Создание изменяемого словаря:
    val mutableCapitals = mutableMapOf("Россия" to "Москва", "Франция" to "Париж")

    //Добавление и удаление элементов:
    mutableCapitals["Германия"] = "Берлин"
    mutableCapitals.remove("Франция")

   // Доступ к элементам:
    val capitalOfRussia = capitals["Россия"]

   // Перебор элементов: ЦИКЛ
    for ((country, capital) in capitals) {
        println("$country: $capital")
    }

    //Условия:
    if ("Россия" in capitals) {
        println("Столица России: ${capitals["Россия"]}")
    }

    //уникальность ключей
    val map1 = mutableMapOf("a" to 1, "b" to 2)
    map1["a"] = 3  // значение по ключу "a" теперь будет 3, а не 1

    // Ключи и Null
    //В Kotlin ключи в словарях могут быть null, хотя это и не является обычной практикой. Использование null в качестве ключа следует рассматривать осторожно, так как это может привести к ошибкам в логике программы и затруднить отладку:
    val mapWithNullableKey = mutableMapOf<String?, Int>(null to 1)

    //Неуникальность значений
    //В отличие от ключей, значения в словаре могут быть неуникальными. Разные ключи могут быть связаны с одним и тем же значением:
    val map2 = mutableMapOf("a" to 1, "b" to 1, "c" to 2)

}
