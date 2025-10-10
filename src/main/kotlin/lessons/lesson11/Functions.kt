package ru.stimmax.lessons.lesson11
/*
fun имяФункции(параметры): ТипВозвращаемогоЗначения {
    // Тело функции
    return значение
}
*/

fun sum(a: Int, b: Int): Int {
    return a + b
}

//Если функция ничего не возвращает, то тип возвращаемого значения — Unit. Обычно его можно опустить
fun greetUser(name: String) {
    println("Hello, $name!")
}

//Kotlin позволяет определять функции одной строкой без использования фигурных скобок {} и оператора return, если функция проста.
fun multiply(a: Int, b: Int): Int = a * b


//Напишите функцию replaceString, которая принимает список строк и искомую строку.
// Функция должна перебрать список и заменить первое вхождение искомой строки на её версию в верхнем регистре,
// после чего завершить выполнение с помощью return без возврата значения.
fun replaceString(a:MutableList<String>, b: String) {
    for (i in a.indices) {
        if (a[i].contains(b)) {
            a[i] = a[i].replace(b, b.uppercase())
            println(a)
            return
        }
    }
    println(a)
}

//Создайте функцию findFirstEvenNumber, которая принимает список целых чисел. Функция должна выводить каждый номер.
// При нахождении первого чётного числа она должна вывести сообщение "Чётное число найдено" и завершить выполнение
// с помощью return без возврата значения.
fun findFirstEvenNumber(a: List<Int>) {
    for(item in a) {
        println(item)
        if (item % 2 == 0) {
            println("четное число найдено")
            return
        }
    }
}

fun main() {
    replaceString(mutableListOf("asdg", "swe"), "asd")
}
