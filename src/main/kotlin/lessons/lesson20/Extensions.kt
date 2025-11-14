package ru.stimmax.lessons.lesson20

fun removeSpaces1(str: String): String {
    return str.replace(" ", "")
}
val result = removeSpaces1("String with spaces")



fun String.removeSpaces(): String {
    return this.replace(" ", "")
}
val result2 = "Hello, World!".removeSpaces() // "Hello,World!"



//Расширение List
//Допустим, вам нужен метод, который проверяет, является ли список пустым или все его элементы равны null:

fun <T> List<T?>.isElementsNullOrEmpty(): Boolean {
    return this.all { it == null } || this.isEmpty()
}
val list: List<Int?> = listOf(null, 4)
val isEmpty = list.isElementsNullOrEmpty() // true



//Преимущества:
//Повышение читаемости кода.
//Возможность добавить функциональность к классам, к исходному коду которых у вас нет доступа.
//Упрощение кода за счет уменьшения необходимости вспомогательных утилит или функций.

//Недостатки:
//Злоупотребление расширениями может сделать код трудным для понимания новыми разработчиками.
//Расширения не могут получить доступ к приватным или защищенным членам класса.
