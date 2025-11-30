package ru.stimmax.lessons.lesson23

//Задание 2
//Создай функцию, которая принимает строку и возвращает его длину. Трансформируй
//в анонимную функцию
//в лямбда выражение с указанием типа
//в краткое лямбда выражение
fun example02(arg: String): Int {
    return arg.length
}
fun main() {
    val e2 = fun (arg: String): Int {
        return arg.length
    }
    val e22: (String) -> Int = {
        it.length
    }
    val e222 = { arg: String ->
        arg.length
    }
}
