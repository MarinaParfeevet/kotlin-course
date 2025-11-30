package ru.stimmax.lessons.lesson23.homeworks

import ru.stimmax.lessons.lesson20.list

//1.Создай функцию, которая принимает список чисел и возвращает среднее арифметическое всех чётных чисел этого списка.
// С помощью require проверь, что список не пустой.
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Создай лямбда выражение без указания типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных (в том числе пустого).
fun getMiddle(list: List<Int>): Double {
    require(list.isNotEmpty())
    return list.filter { it % 2 == 0 }.average()
}

val getMiddle = fun(list: List<Int>): Double {
    require(list.isNotEmpty())
    return list.filter { it % 2 == 0 }.average()
}
val getMiddle2: (List<Int>) -> Double = { list ->
    require(list.isNotEmpty())
    list.filter { it % 2 == 0 }.average()
}
val getMiddle3: (List<Int>) -> Double = {
    require(it.isNotEmpty())
    it.filter { it % 2 == 0 }.average()
}
val getMiddle4 = { list: List<Int> ->
    require(list.isNotEmpty())
    list.filter { it % 2 == 0 }.average()
}

//2.Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа. Сделай проверку, что входящее
// число больше нуля. Подсказка: для парсинга символа в число можно использовать функцию digitToInt()
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Создай лямбда выражение без указания типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.
fun getSum(number: Long): Int {
    require(number >= 0)
    return "$number".sumOf { it.digitToInt() }
}

val getSum1 = fun(number: Long): Int {
    require(number >= 0)
    return "$number".sumOf { it.digitToInt() }
}
val getSum2: (Long) -> Int = { number ->
    require(number >= 0)
    "$number".sumOf { it.digitToInt() }
}
val getSum3: (Long) -> Int = {
    require(it >= 0)
    "$it".sumOf { it.digitToInt() }
}
val getSum4 = { number: Long ->
    require(number >= 0)
    "$number".sumOf { it.digitToInt() }
}

//3.Создай функцию-расширение списка чисел, которая будет возвращать множество дубликатов чисел (встречающихся в списке
// более одного раза).
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.
fun List<Int>.getSetDubl(): Set<Int> {
    return toSet().associate { element ->
        element to this.count { it == element }
    }.filter { it.value > 1 }
        .keys
}

val getDubl1 = fun List<Int>.(): Set<Int> {
    return toSet().associate { element ->
        element to this.count { it == element }
    }.filter { it.value > 1 }
        .keys
}
val getDubl2: List<Int>.() -> Set<Int> = {
    toSet().associate { element ->
        element to this.count { it == element }
    }.filter { it.value > 1 }
        .keys
}

fun main() {
    val task1 = listOf(1, 2, 3, 4, 5, 6)
    println(getMiddle4(task1))

    val task2 = 1234567788912345656
    println(getSum3(task2))

    val task3 = listOf(1,2,3,2,2,1)
    println(getDubl2(task3))
}
