package ru.stimmax.lessons.lesson25

//Задание 1
//Создай функцию, возвращающую целое число. В теле функции создай список чисел, выведи на печать сумму чисел списка,
// верни сумму чисел из функции. Сделай то же самое без создания переменных с использованием функции also и apply.
fun ex1(): Int {
    val list = listOf(1, 2, 3, 4, 5)
    val res = list.sum()
    return res
}

fun ex11(): Int {
    return listOf(1, 2, 3, 4, 5).sum()
        .apply { println(this) }
}

fun ex12(): Int {
    return listOf(1, 2, 3, 4, 5).sum()
        .also { println(it) }
}

//Задание 2
//Создай функцию, возвращающую число. В теле функции создай изменяемый список чисел, добавь в него ещё число, добавь
// ещё число, распечатай длину списка, верни сумму чисел списка из функции. Напиши то же самое без создания переменных
// используя функции with и run.
fun ex2(): Int {
    val list = mutableListOf(1, 2, 3, 4)
    list.add(5)
    list.add(6)
    println(list.size)
    val res = list.sum()
    return res
}

fun ex21(): Int {
    return with(mutableListOf(1, 2, 3, 4)) {
        add(5)
        add(6)
        println(size)
        sum()
    }
}

fun ex22(): Int {
    return mutableListOf(1, 2, 3, 4, 5).run {
        add(5)
        add(6)
        println(size)
        sum()
    }
}

//Задание 3
//Создай функцию, принимающую nullable список строк и возвращающую сумму длин слов предварительно выведя его на печать.
// Если список является null то вернуть ноль. Реши через if / else. Реши через let и also.
fun ex3(list: List<String>?): Int {
    if (list.isNullOrEmpty()) {
        println("zero")
        return 0
    } else {
        val res = list.sumOf { it.length }
        println(res)
        return res
    }
}

fun ex32(arg: List<String>?): Int {
    return (arg?.let { a ->
        a.sumOf { it.length }
    } ?: 0)
        .also { println(it) }
}

//Задание 4
//Создай класс UserConfig с полем id в конструкторе и двумя пустыми полями в теле класса: lang и country.
//Создай функцию, которая принимает id и объект типа UserConfig  nullable и возвращает новый объект UserConfig с
// переданным id и с заполненными полями lang и country если переданный в функцию объект UserConfig  не был null. Реши
// задачу через if / else и через подходящие scope функции, которые помогут избежать создания переменных и проверки на null.
