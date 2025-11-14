package ru.stimmax.lessons.lesson19.homeworks

//1.Напиши функцию getMiddleElement с дженериком, которая будет принимать список и возвращать средний элемент,
// если он существует, иначе возвращать null. Например, у списка из четырёх элементов - среднего элемента нет.
fun <T> getMiddleElement(list: List<T>): T? {
    val size = list.size
    if (size % 2 == 0) return null
    return list[size / 2]
}

//2.Напиши класс ListHolder, который будет хранить список элементов типа T и иметь метод для добавления нового
// элемента и получения всех элементов в виде неизменяемого списка.
class ListHolder<T>() {
    var list = mutableListOf<T>()

    fun addElement(element: T) {
        list.add(element)
    }

    fun getListHolder(): List<T> {
        return list.toList()
    }
}

//3.Создай интерфейс Mapper с двумя дженериками, который будет определять методы для преобразования:
//элементов одного типа в элементы другого типа
//списка элементов одного типа в список элементов другого типа
interface Mapper<T, R> {
    fun convertType(el: T): R
    fun convertList(list: List<T>): List<R>
}

//4.Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper с типами String и List<String>.
// Метод преобразования должен разбивать входящую строку по символу пробела и возвращать список из полученных слов.
// Метод преобразования списков с аналогичной механикой.
class PhrasesToListOfStrings() : Mapper<String, List<String>> {
    override fun convertType(el: String): List<String> {
        return el.split(" ")
    }

    override fun convertList(list: List<String>): List<List<String>> {
        return list.map { convertType(it) }
    }
}

//5.Создай функцию transposition с двумя дженериками, которая принимает словарь с дженериками и возвращает словарь,
// в котором ключ и значения поменялись местами.
fun <T, R> transposition(map: Map<T, R>): Map<R, T> {
    val result = mutableMapOf<R, T>()
    for (el in map) {
        result[el.value] = el.key
    }
    return result.toMap()
}

//6.Напиши интерфейс Validator с дженериком с функцией валидации, которая будет принимать элемент с типом дженерика
// и возвращать булево значение.
interface Validator<R> {
    fun validate(el: R): Boolean
}

//7.Создай класс StringValidator и имплементируй интерфейс Validator с типом String?. Реализуй проверку, что строка
// не является null, не пустая и не состоит из одних пробелов.
class StringValidator() : Validator<String?> {
    override fun validate(el: String?): Boolean {
        return !el.isNullOrBlank()
    }
}

//8.Создай класс OddValidator и имплементируй интерфейс Validator типизированный по Int. Реализуй проверку, что число чётное.
class OddValidator() : Validator<Int> {
    override fun validate(el: Int) = el % 2 == 0
}

//9.Создай класс ListValidator с дженериком, ограниченным типом Number, имплементируй интерфейс Validator
// типизированный по типу List с nullable типом дженерика класса
//Реализуй проверку:
//Ни один элемент списка не является null
//Ни один элемент приведённый к типу Double не равен 0.0
class ListValidator<R : Number>() : Validator<List<R?>> {
    override fun validate(el: List<R?>): Boolean {
        return el.all {it != null && it.toDouble() !=0.0 }
    }
}

fun main() {
    println(getMiddleElement(listOf(1.0, 2.9, 8.9, 3.67, 5, 6, 7)))

    val number9 = ListValidator<Number>()
    println(number9.validate(listOf(22,null,5)))
}
