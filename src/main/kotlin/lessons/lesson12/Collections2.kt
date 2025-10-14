package ru.stimmax.lessons.lesson12

fun main() {


    val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)

    val positive = mutableListOf<Int>()

    //foreach
    for (i in numbers) {
        val isPositive = i > 0
        if (isPositive) {
            positive.add(i)
        }
    }
    numbers.forEach {
        // it - это специальная переменная в Kotlin для
        // хранения значения коллекции из текущей итерации
        val isPositive = it > 0
        if (isPositive) {
            positive.add(it)
        }
    }

    //filters
    fun filter(collection: List<Int>): List<Int> {
        val result = mutableListOf<Int>()
        for (i in collection) {
            if (i in 7..17) result.add(i)
        }
        return result
    }

    val list = listOf(8, 56, 23, 87, 12, 18, 11)
    val filtered1 = filter(list)
    println(filtered1)

    val filtered2 = list.filter {
        it in 7..17
    }
    println(filtered2)

    val positiveNumbers = numbers.filter { it > 0 }
    println(positiveNumbers) // Вывод: [2, 4]

    val notPositiveNumbers = numbers.filterNot { it > 0 }
    println(notPositiveNumbers) // Вывод: [-1, -3, -5]


    //filternotnull
    val nullableList = listOf(1, null, 2, null, 3)
    val nonNullList = nullableList.filterNotNull()
    println(nonNullList) // Вывод: [1, 2, 3]

//first and last
    val setOfNumbers = setOf(3, 4, 5, -5, 14)
    val firstElement = setOfNumbers.first()
    val lastElement = setOfNumbers.last()
    println(firstElement)
    println(lastElement)


    val firstPositive = numbers.firstOrNull { it > 0 }
    println(firstPositive) // Вывод: 2
    val nullable = numbers.firstOrNull { it > 1000 }
    println(nullable) // Вывод: null
    val elementOrElse =
        numbers.getOrElse(10) { -1 } //возвращает элемент по индексу или значение по умолчанию, если индекс вне диапазона списка.
    println(elementOrElse) // Вывод: -1

//map
    val incrementedNumbers = numbers.map { it + 1 } //Увеличить каждое число в списке на 1.
    println(incrementedNumbers) // Вывод: [0, 3, -2, 5, -4]

    val numberSquareMap =
        numbers.associate { it to it * it } //Создать словарь, где каждому числу соответствует его квадрат.
    println(numberSquareMap) // Вывод: {-1=1, 2=4, -3=9, 4=16, -5=25}

    //flatten Склеивает каждую коллекцию в коллекции между собой в одну общую коллекцию.
    val multipleList = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6)
    )
    val flattenList = multipleList.flatten()
    println(flattenList)

//flattenMap Выполняет одновременно преобразование вложенных коллекций и склеивание в одну общую коллекцию.
    val flattenListAfterMapping = multipleList.flatMap { list ->
        list.map { it * 2 }
    }
    println(flattenListAfterMapping)


    //Преобразует все элементы коллекции в строки и объединяет их в одну строку с заданным разделителем.
    val numbersString = numbers.joinToString(separator = " , ")
    println(numbersString) // Вывод: "-1, 2, -3, 4, -5"

//sorted
    val sortedNumbers = numbers.sorted()
    println(sortedNumbers) // Вывод: [-5, -3, -1, 2, 4]

    //sorted descending
    val sortedDescendingNumbers = numbers.sortedDescending()
    println(sortedDescendingNumbers) // Вывод: [4, 2, -1, -3, -5]

    println(numbers.size)

    if (numbers.isEmpty()) { //isEmpty, isNotEmpty
        println("Коллекция пуста")
    } else {
        println("В коллекции ${numbers.size} значений")
    }

    //contains
    if (numbers.contains(42)) {
        println("Коллекция содержит ответ на главный вопрос")
    } else {
        println("В коллекции нет ответа на главный вопрос")
    }

//in
    if (42 in numbers) {
        println("Коллекция содержит ответ на главный вопрос")
    } else {
        println("В коллекции нет ответа на главный вопрос")
    }


    //containsAll Проверяет вхождение одной коллекции в другую.
    if (setOfNumbers.containsAll(listOf(4, 3))) {
        println("Коллекция содержит числа 4 и 3, при этом порядок не имеет значения")
    } else {
        println("В коллекции нет одного из чисел либо всех проверяемых чисел")
    }


    //sum
    val sumOfNumbers = numbers.sum()
    println(sumOfNumbers) // Вывод: -3

    //average
    val averageOfNumbers = numbers.average()
    println(averageOfNumbers) // Вывод: -0.6

    //maxOrNull и minOrNull
    val maxNumber = numbers.maxOrNull()
    println(maxNumber) // Вывод: 4
    val minNumber = numbers.minOrNull()
    println(minNumber) // Вывод: -5

    //groupBy
    //Группирует элементы коллекции по заданному критерию.
    val groupedBySign = numbers.groupBy { if (it > 0) "Positive" else "Negative" }
    println(groupedBySign) // Вывод: {"Negative"=[-1, -3, -5], "Positive"=[2, 4]}

    //distinct Возвращает список, содержащий только уникальные элементы из исходного списка.
    val distinctNumbers = listOf(1, 2, 2, 3, 3, 3, 4).distinct()
    println(distinctNumbers) // Вывод: [1, 2, 3, 4]


    // take Возвращает первые n элементов списка
    println(numbers.take(3)) // Вывод: [1, 2, 3]

    //takeLast Возвращает последние n элементов
    println(numbers.takeLast(3)) // Вывод: [3, 4, 5]

    // drop Возвращает всю коллекцию за исключением первых нескольких элементов
    println(numbers.drop(2)) // [-3, 4, -5, 8, 264]
}
