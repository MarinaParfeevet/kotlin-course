package ru.stimmax.lessons.lesson16.homeworks

import ru.stimmax.lessons.lesson16.Background
import ru.stimmax.lessons.lesson16.Colors
import ru.stimmax.lessons.lesson16.printColored

//Принтер
//Создай абстрактный принтер, который имеет абстрактный метод печати, принимающий в качестве аргумента строку.
//Создай классы наследники: лазерный и струйный
//Лазерный принтер должен разбивать фразу на слова по пробелу и выводить каждое слово отдельно чёрными буквами на белом
// фоне (хорошо работает на тёмной теме)
//Струйный принтер должен разбивать фразу на слова по пробелу и выводить каждое слово отдельно цветными буквами на
// цветном фоне. Слова должны быть разноцветны. Можно сделать список пар с цветом текста и фона и проходить циклически
// по этому списку при выводе текста. Проверить работу на длинном тексте

abstract class Printer {
    abstract fun printLine(str: String)
}

class Laser : Printer() {
    override fun printLine(str: String) {
        val list = str.split(" ")
        list.forEach { printColored(it, Colors.BLACK, Background.WHITE) }
    }
}

class Inkjet : Printer() {
    override fun printLine(str: String) {
        val list = str.split(" ")
        for (i in list.indices) {
            if (i % 2 == 0) {
                printColored(list[i], Colors.RED, Background.YELLOW)
            } else if (i % 3 == 0) {
                printColored(list[i], Colors.PURPLE, Background.RED)
            } else {
                printColored(list[i], Colors.GREEN, Background.BLUE)
            }
        }
    }
}

fun main() {
    val laser = Laser()
    val inkjet = Inkjet()
    val str =
        "это озорная и поучительная сказка о хлебном человечке, родившемся из последних крупиц муки: он радостно катится навстречу приключениям, поёт задорные песенки и с лёгкостью убегает от лесных зверей, пока на его пути не встречается хитрая и ласковая лиса. Весёлая история, наполненная ритмом и юмором, напоминает о том, что хвастовство и доверчивость имеют последствия"
    laser.printLine(str)
    println()
    inkjet.printLine(str)
}
