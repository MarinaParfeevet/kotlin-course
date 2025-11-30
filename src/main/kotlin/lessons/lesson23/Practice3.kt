package ru.stimmax.lessons.lesson23

//Задание 3
//Создай функцию-расширение класса String, которая принимает число и символ и возвращает true если строка короче этого
// числа и содержит переданный символ. Трансформируй в анонимную функцию, потом в лямбду с типом
fun String.example03(arg: Int, symbol: Char): Boolean {
    return length < arg && contains(symbol)
}
fun main() {
    val e3 = fun String.(arg: Int, symbol: Char): Boolean {
        return length < arg && contains(symbol)
    }
    val e33: String.(Int, Char) -> Boolean = { arg, symbol ->
        length < arg && contains(symbol)
    }
}
