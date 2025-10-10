package ru.stimmax.lessons.lesson10

fun main() {

    //Задачи на работу со словарём
    //1.Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val map1 = mapOf<Int, Int>()

    //2.Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val map2 = mapOf(2.5f to 2.3, 4.0f to 7.89)

    //3.Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val map3 = mutableMapOf<Int, String>()
    var map4 = mutableMapOf(4 to "stroka", 1 to "string", 89 to "hello")

    //4.Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    map4[11] = "new string"

    //5.Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
    var item = map4[89]
    println(item)

    //6.Удалите определенный элемент из изменяемого словаря по его ключу.
    map4.remove(4)
    println(map4)

    //7.Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val map5 = mutableMapOf(2.4 to 1, 5.7 to 0, 8.6 to 2, 6.6 to 2)
    for ((double, inter) in map5) {
        if (inter == 0) {
            println("бесконечность")
        }
        else println(double / inter)
    }

    //8.Измените значение для существующего ключа в изменяемом словаре.
    map5[5.7] = 99
    println(map5)

    //9.Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val map6 = mapOf(1 to 'a', 2 to 'b', 3 to 'c', 4 to 'd')
    val map7 = mapOf(1 to 'e', 5 to 'f', 6 to 'g')
    val map8 = mutableMapOf<Int, Char>()
    for ((key, value) in map6) {
        map8[key] = value
    }
    for ((key, value) in map7) {
        map8[key] = value
    }
    println(map8)

    //10.Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
    val map9 = mutableMapOf<String, List<Int>>()
    map9["odin"] = listOf(1, 3, 5)
    map9["dva"] = listOf(11, 33, 55, 66)
    println(map9)

    //11.Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь.
    // Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку.
    // Распечатай полученное множество.
    val map10 = mutableMapOf<Int, MutableSet<String>>()
    map10[1] = mutableSetOf("a", "b", "z")
    map10[2] = mutableSetOf("d")
    map10[3] = mutableSetOf("c", "cat want to eat")
    val mySet = map10[2]
    mySet?.add("dog want to eat cat")
    println(mySet.toString())
    println(map10)

    //12.Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.
    val map11 = mapOf(
        Pair(1,2) to 11,
        Pair(2,3) to 22,
        Pair(5,5) to 5,
        Pair(3,5) to 33,
        Pair(4,6) to 44)
    for ((pair, value) in map11) {
        if (pair.first ==5 || pair.second ==5) println("key $pair -> value $value")
    }

    //Задачи на подбор оптимального типа для словаря
    //1.Словарь библиотека: Ключи - автор книги, значения - список книг
    val library = mutableMapOf<String, MutableSet<String>>()

    //2.Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val plantsBook = mapOf<String, Set<String>>()

    //3.Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val championship = mapOf<String, Set<String>>()

    //4.Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
    val medical = mutableMapOf<String, MutableSet<String>>()

    //5.Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
    val travellers = mutableMapOf<String, MutableMap<String, MutableSet<String>>>()

}
