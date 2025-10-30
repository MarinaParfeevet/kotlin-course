package ru.stimmax.lessons.lesson16.homeworks

import ru.stimmax.lessons.lesson16.Background
import ru.stimmax.lessons.lesson16.Colors
import ru.stimmax.lessons.lesson16.printColored
import javax.swing.BoxLayout

//Класс “Логгер”: представляет из себя инструмент для вывода информации в консоль с разным префиксами уровня
// логирования (INFO, WARNING, ERROR, DEBUG)
//Базовый метод log(message) выводит в консоль сообщение message с префиксом INFO
//Выполнить перегрузку метода log, который:
//Принимает уровень логирования и сообщение. Выводит сообщения типа WARNING жёлтым цветом, а ERROR белым цветом
// на красном фоне.
//Принимает список сообщений и все их выводит с уровнем INFO
//Принимает объект типа Exception и выводит его поле message с префиксом уровня ERROR
//Попробуй создать логгер и добавить в него сообщения разными способами. Проверь вывод в консоли.

object LogLayout {
    const val INFO = "INFO"
    const val WARNING = "WARNING"
    const val ERROR = "ERROR"
    const val DEBUG = "DEBUG"
}

class Logger {
    fun log(message: String) {
        println("INFO: $message")
    }

    fun log(layout: String, message: String) {
        if (layout == LogLayout.WARNING) {
            printColored(message, Colors.YELLOW)
        } else if (layout == LogLayout.ERROR) {
            printColored(message, Colors.WHITE, Background.RED)
        } else {
            println("$layout: $message")
        }
    }

    fun log(list: List<String>) {
        list.forEach {
            println("${LogLayout.INFO}: $it")
        }
    }

    fun log(exc: Exception) {
        println("${LogLayout.ERROR}: ${exc.message}")
    }
}

fun main() {
    val logger = Logger()
    logger.log("Hello World")
    logger.log(LogLayout.WARNING, "Hello World")
    logger.log(listOf("Hello World", "Something went wrong"))
    val exc = Exception("ERROR !!!!")
    logger.log(exc)
}
