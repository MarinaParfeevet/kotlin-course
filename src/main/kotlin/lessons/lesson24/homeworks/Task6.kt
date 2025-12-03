package ru.stimmax.lessons.lesson24.homeworks

//Задание 6. Сама не делала 6 задачу, копи-паст
//Напиши функцию colorizeWords которая печатает слова из длинного предложения разбитого по пробелу разным цветом. Правило
// подбора цвета для каждого слова нужно передавать в виде функции, которая принимает слово и возвращает это же слово но
// уже "в цвете" через функцию colorize.
//
//Функция colorizeWords должна расширять строку и эту же строку и обрабатывать.
//
//Напиши несколько функций обработки слов:
//
//цвет слова зависит от его характеристик (для каждой характеристики отдельный цвет):
//начинается с большой буквы
//длина меньше трёх символов
//длина больше 6 символов
//длина кратна двум
//для всех прочих отдельный цвет.
//цвет слова выбирается по очереди из списка цветов для каждого слова через счётчик. Когда счётчик доходит до края списка
// слов - он обнуляется и начинается заново.
//цвет слова выбирается по очереди из списка цветов для каждого слова через счётчик. Счётчиком управляет функция,
// находящаяся в изменяемой переменной. Сначала это функция с инкрементом счётчика. Когда счётчик доходит до края списка
// цветов, нужно заменить функцию счётчика на функцию с декрементом. Когда счётчик доходит до нуля - заменить функцию
// счётчика на функцию с инкрементом и так далее.
//Создай переменную с длинным текстом (например из этого урока) и вызови у этой переменной функцию colorizeWords и
// передай в неё по очереди каждую из функций, проверь результат в консоли.

object Colors {
    const val RESET = "\u001B[0m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}

fun String.colorize(color: String): String {
    return "$color$this${Colors.RESET}"
}

fun String.colorizeWords(fnc: (String) -> String) {
    val result = split(" ").joinToString(" ") {
        it.colorize(fnc(it))
    }
    println(result)
}

fun main() {
    val colors = listOf(Colors.RED, Colors.BLUE, Colors.GREEN, Colors.PURPLE, Colors.YELLOW, Colors.CYAN)

    val text =
        "Напиши функцию colorizeWords которая печатает слова из длинного предложения разбитого по пробелу разным цветом. Правило подбора цвета для каждого слова нужно передавать в виде функции, которая принимает слово и возвращает это же слово но уже \"в цвете\" через функцию colorize."

    val ex1 = { word: String ->
        when {
            word[0].uppercase()[0] == word[0] -> Colors.YELLOW
            word.length < 3 -> Colors.BLUE
            word.length > 6 -> Colors.GREEN
            word.length % 2 == 0 -> Colors.RED
            else -> Colors.PURPLE
        }
    }

    var counter = 0

    val ex2 = { _: String ->
        if (counter >= colors.size) counter = 0
        colors[counter++]
    }

    var counterFunction = { counter++ }

    val ex3 = { _: String ->
        if (counter == colors.size - 1) {
            counterFunction = { counter-- }
        }
        if (counter < 0) {
            counter++
            counterFunction = { counter++ }
        }
        colors[counterFunction()]
    }

    text.colorizeWords(ex1)

    text.colorizeWords(ex2)

    counter = 0

    text.colorizeWords(ex3)
}
