package lessons.lesson08.homeworks

fun main() {
// ------------------------- Работа с массивами Array -------------------------

    // 1. Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val numbers = arrayOf(1, 2, 3, 4, 5)

    // 2. Создайте пустой массив строк размером 10 элементов.
    val emptyStrings = Array(10) { "" }

    // 3. Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val doubles = Array(5) { 0.0 }
    for (i in doubles.indices) {
        doubles[i] = i * 2.0
    }

    // 4. Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    val multiplied = Array(5) { 0 }
    for (i in multiplied.indices) {
        multiplied[i] = i * 3
    }

    // 5. Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val nullableStrings = arrayOf<String?>(null, "Привет", "Kotlin")

    // 6. Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val massive = arrayOf(1, 2, 3, 4, 5)
    val copy = Array(massive.size) { 0 }
    for (i in massive.indices) {
        copy[i] = massive[i]
    }

    // 7. Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
    val arr1 = arrayOf(10, 20, 30, 40)
    val arr2 = arrayOf(1, 2, 3, 4)
    val result = Array(arr1.size) { 0 }
    for (i in result.indices) {
        result[i] = arr1[i] - arr2[i]
    }

    // 8. Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
    val searchArray = arrayOf(1, 3, 5, 7, 9)
    var index = 0
    var foundIndex = -1
    while (index < searchArray.size) {
        if (searchArray[index] == 5) {
            foundIndex = index
            break
        }
        index++
    }
    println("Индекс элемента 5: $foundIndex")

    // 9. Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    val nums = arrayOf(1, 2, 3, 4, 5)
    for (n in nums) {
        val type = if (n % 2 == 0) "чётное" else "нечётное"
        println("$n — $type")
    }

    // 10. Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент
    val strings = arrayOf("кот", "собака", "кошка", "лошадь")
    findSubstring(strings, "ош")


    // ------------------------- Работа со списками List -------------------------

    // 1. Создайте пустой неизменяемый список целых чисел.
    val emptyList = listOf<Int>()

    // 2. Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val words = listOf("Hello", "World", "Kotlin")

    // 3. Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val mutableNums = mutableListOf(1, 2, 3, 4, 5)

    // 4. Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    mutableNums.add(6)
    mutableNums.add(7)
    mutableNums.add(8)

    // 5. Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val mutableWords = mutableListOf("Hello", "World", "Kotlin")
    mutableWords.remove("World")

    // 6. Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val mutableNums2 = mutableListOf(1, 2, 3, 4)
    for (num in mutableNums) println(num)

    // 7. Создайте список строк и получите из него второй элемент, используя его индекс.
    val wordList = listOf("Hello", "World", "Kotlin")
    val secondWord = words[1]
    println("Второй элемент: $secondWord")

    // 8. Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент с индексом 2 на новое значение).
    mutableNums[2] = 99

    // 9. Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val list1 = listOf("A", "B", "C")
    val list2 = listOf("D", "E")
    val list3 = mutableListOf<String>()
    for (el in list1) list3.add(el)
    for (el in list2) list3.add(el)

    // 10. Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val intList = listOf(3, 8, 1, 9, 5)
    var min = intList[0]
    var max = intList[0]
    for (el in intList) {
        if (el < min) min = el
        if (el > max) max = el
    }
    println("min = $min, max = $max")

    // 11. Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val listOfInt = listOf(3, 8, 1, 9, 5)
    val newList = mutableListOf<Int>()
    for (i in listOfInt) {
        if (i % 2 == 0) newList.add(i)
    }
    println("Чётные: $newList")

    // ------------------------- Работа с множествами Set -------------------------

    // 1. Создайте пустое неизменяемое множество целых чисел.
    val emptySet = setOf<Int>()

    // 2. Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val intSet = setOf(1, 2, 3)

    // 3. Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    val mySet = mutableSetOf("Kotlin", "Java", "Scala")

    // 4. Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    mySet.add("Swift")
    mySet.add("Go")

    // 5. Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val numSet = mutableSetOf(1, 2, 3, 4)
    numSet.remove(2)

    // 6. Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    for (item in numSet) println(item)

    // 7. Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка. Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
    val resultCheck = containsString(mySet, "Kotlin")
    println("Есть ли строка в множестве: $resultCheck")

    // 8. Создайте множество строк и конвертируйте его в изменяемый список строк с использованием цикла.
    val setToConvert = setOf("a", "b", "c")
    val convertedList = mutableListOf<String>()
    for (item in setToConvert) {
        convertedList.add(item)
    }
    println("Множество как список: $convertedList")
}


// Поиск подстроки в массиве строк
fun findSubstring(arr: Array<String>, query: String) {
    for (item in arr) {
        if (item.contains(query)) {
            println("Найдено: $item")
        }
    }
}

// Проверка, содержится ли строка в множестве
fun containsString(set: Set<String>, word: String): Boolean {
    for (item in set) {
        if (item == word) return true
    }
    return false
}
