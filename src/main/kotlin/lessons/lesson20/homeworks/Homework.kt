package ru.stimmax.lessons.lesson20.homeworks

import kotlin.math.absoluteValue

//1.Определите функцию-расширение для массива чисел, которая не принимает аргументов и возвращает пару из чисел - первое
// и последнее. Если массив был пуст то вернуть пару из null значений.
fun Array<Int>.task1(): Pair<Int?, Int?> {
    return if (this.isEmpty()) Pair(null, null)
    else this[0] to this.last()
}

//2.Создайте функцию-расширение для изменяемого списка элементов:
//с дженериком T ограниченным интерфейсом Comparable<T> которая принимает булево значение
//возвращает этот же список только в виде неизменяемого
//сам изменяемый список при этом должен стать отсортированным по возрастанию, если в функцию передано true и по
// убыванию, если false (используем функции sort() и sortDescending()
fun <T : Comparable<T>> MutableList<T>.task2(check: Boolean): List<T> {
    if (check) {
        sort()
    } else {
        sortDescending()
    }
    return this.toList()
}

//3.Создайте функцию-расширение для nullable словаря с дженериком:
//Ключ является дженериком
//Значение является списком из дженериков
//Принимает целое число
//Возвращает nullable словарь из ключей изначального словаря приведённых к строке через toString()
//Значений из nullable дженерика, взятых из изначального ключа-списка по индексу из аргумента, если такого индекса нет
// - значением будет null
fun <T> Map<T, List<T>>?.task3(number: Int): Map<String, T?>? {
    return this?.map { it }?.associate { it.key.toString() to it.value.getOrNull(number) }
}

//4.Реализуйте метод расширения within для класса Number, который проверяет, что текущее число отклоняется от
// эталонного не более допустимого значения. Метод принимает два параметра: other — число для сравнения и deviation —
// максимально допустимое отклонение. Метод должен возвращать true, если разница между текущим числом и числом для
// сравнения не превышает заданное отклонение. Протестируйте функцию на разных типах чисел. Для получения отклонения,
// у разницы чисел нужно вызвать свойство absoluteValue.
fun Number.within(other: Number, deviation: Number): Boolean {
    val dif = (this.toDouble() - other.toDouble()).absoluteValue
    return dif <= deviation.toDouble()
}

//5.Реализуйте для класса String два метода расширения: encrypt и decrypt. Метод encrypt должен сдвигать каждый символ
// исходной строки на заданное число позиций вперед по таблице Unicode, а метод decrypt — на то же число позиций назад.
// Оба метода принимают один параметр base типа Int, который определяет величину сдвига. Протестируйте вашу реализацию,
// убедившись, что после шифрования и последующей расшифровки строка возвращается к исходному состоянию.
//Сдвиг по таблице Unicode реализуется простым прибавлением или вычитанием размера сдвига к char символу.
fun String.encrypt(base: Int): String {
    return map { it + base }.joinToString("")
}

fun String.decrypt(base: Int): String {
    return map { it - base }.joinToString("")
}

//6.Многие уже знают любимую игру в Твиттере - собирание разных слов из букв через ответы (но мы то знаем что слово
//только одно, но не будем его называть). Напиши метод расширения строки, который будет принимать список имён
//пользователей и выводить в консоли исходную строку побуквенно в верхнем регистре в столбик: имя автора и букву под ним.

fun String.twitter(list: List<String>) {
    var i = 0
    this.forEach {
        println(list[i])
        println(it.uppercase())
        i++
        if (i >= list.size) {
            i = 0
        }
    }
}

fun main(args: Array<String>) {
    println(mutableListOf(3, 6, 8, 1, -9).task2(false))

    println("abc".encrypt(2))
    println("abc".encrypt(2).decrypt(2))
    println("efz".decrypt(1))

    "abcd".twitter(listOf("anna bob", "tom cruse"))

}
