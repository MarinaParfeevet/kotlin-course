package ru.stimmax.lessons.lesson06

fun main() {
    val number = 10
    if (number > 5) {
        println("Число больше 5")
}

    if (number < 0) {
        println("Число отрицательное")
    } else if (number == 0) {
        println("Число равно 0")
    } else {
        println("Число положительное")
    }


    // последовательности, диапазон
    val intRange = 1..10
    val intRangeUntil = 1 until 10
    val downTo = 10 downTo 1
    val charRange = 'd'..'r'

    //Оператор проверки вхождения в диапазон. Используя in или !in можно проверить входит ли проверяемое значение в диапазон или не входит.
    val inRange = 2 in intRange
    val notInRange = 2 !in intRange


    val score = 95
    when (score) {
        in 90..100 -> println("Отлично")
        in 80..89 -> println("Хорошо")
        in 70..79 -> println("Удовлетворительно")
        else -> println("Нужно подучить")
    }

    //или
    when  {
        score  in 90..100 -> println("Отлично")
    }


    val a = 5
    val b = 6
    val max = if (a > b) a else b

// when как функция
    val result = when (score) {
        in 90..100 -> "Отлично"
        in 80..89 -> "Хорошо"
        in 70..79 -> "Удовлетворительно"
        else -> "Нужно подучить"
    }
    println(result)
}
