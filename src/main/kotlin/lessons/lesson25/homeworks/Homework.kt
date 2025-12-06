package ru.stimmax.lessons.lesson25.homeworks

//Задание 1. Функция высшего порядка.
//Создайте функцию timeTracker, которая принимает другую функцию в качестве аргумента и измеряет время её выполнения.
// Функция timeTracker должна возвращать затраченное время в миллисекундах. Для измерения времени используйте
// System.currentTimeMillis() до и после выполнения переданной функции.
fun timeTracker(fn: () -> Any): Long {
    val start = System.currentTimeMillis()
    fn()
    return System.currentTimeMillis() - start
}

fun main() {
    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }
    println(timeTracker(myFunction))
}
