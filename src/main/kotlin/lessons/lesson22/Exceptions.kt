package ru.stimmax.lessons.lesson22

import ru.stimmax.ru.stimmax.lessons.lesson22.SpecificException

fun main() {


//Синтаксис выбрасывания исключений
//Чтобы выбросить исключение, используйте ключевое слово throw, за которым следует экземпляр исключения:

    throw Exception("Сообщение об ошибке")
    throw Error("") // Критические ошибки, которые не требуют обработки, а требуют завершения прогараммы.Проблемы с
    // работой вирт машины, переполнение памяти, стека и тд, проверка состояния

// можно выкидывать исключение из переменной
    val exception = Exception("Сообщение об ошибке")
    throw exception

//Синтаксис отлова исключений
//Используйте блок try-catch для отлова исключений:
    try {
        // Код, который может выбросить исключение
    } catch (e: IndexOutOfBoundsException) {
        println(e.message)
        throw e // в таком случае выполнение прекратится и выбрасит исключение. Без throw выполнение продолжится и
        // выполнятся остальные catch. Finally выполнится в любом случае
    } catch (e: Exception) {
        return // finally выполнится перед return
    } finally {
        // Блок, который выполняется всегда, независимо от наличия исключения
    }
    //   Отлов исключений нескольких типов
    //         В Kotlin для одновременного отлова нескольких типов исключений используется конструкция when в блоке catch . Вот как это должно выглядеть на практике :

    try {
        // Код, который может выбросить исключения
    } catch (e: Exception) {
        when (e) {
            is IndexOutOfBoundsException, is NullPointerException-> {
                println("Обработано исключение типа IndexOutOfBoundsException")
            }

            is RuntimeException -> {
                println("Обработано исключение типа RuntimeException")
            }

            else -> throw e // Перебрасываем исключение дальше, если оно не соответствует обработанным типам
        }
    }
}
