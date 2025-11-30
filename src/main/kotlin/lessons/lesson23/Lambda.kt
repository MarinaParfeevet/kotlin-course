package ru.stimmax.lessons.lesson23

// Обычное объявление функции
fun increment1(a: Int): Int {
    return a + 1
}

fun main() {
    // Анонимная функция, присвоенная переменной
    val increment2 = fun (a: Int): Int {
        return a + 1
    }

    println(increment1(2))
    println(increment2(2))

    // Лямбда выражение с явно указанным типом
    val increment3: (Int) -> Int = { a ->
        a + 1
    }

   // Упрощение лямбда выражения
// Лямбда выражение с использованием 'it' для однопараметрической лямбды
    val increment4: (Int) -> Int = {
        it + 1
    }

    //Ещё большее упрощение
// Лямбда выражение без явного указания типа
    val increment5 = { a: Int ->
        a + 1
    }


    //Пример простого метода
    fun findIndex(text: String, word: String, ignoreCase: Boolean = false): Int {
        return text.indexOf(word, 0, ignoreCase)
    }
   // Это функция, которая ищет индекс первого вхождения подстроки в строку с учетом или без учета регистра.
  //  Трансформация в анонимную функцию
  //Анонимные функции в Kotlin могут быть полезны для однократного использования. Они объявляются без имени и могут быть присвоены переменной.
    val findIndex2 = fun(text: String, word: String, ignoreCase: Boolean): Int {
        return text.indexOf(word, 0, ignoreCase)
    }
  //  Примечание: Анонимные функции не поддерживают значения по умолчанию для параметров. Все параметры должны быть явно указаны при вызове.

   // Трансформация в лямбда выражение
   // Лямбда выражения в Kotlin представляют собой сокращенную запись для анонимных функций и часто используются для создания компактного кода.
    val findIndex3: (String, String, Boolean) -> Int = { text, word, ignoreCase ->
        text.indexOf(word, 0, ignoreCase)
    }

    //Лямбда выражение без явного указания типов параметров:
    val findIndex = { text: String, word: String, ignoreCase: Boolean ->
        text.indexOf(word, 0, ignoreCase)
    }
}
