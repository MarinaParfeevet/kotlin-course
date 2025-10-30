package ru.stimmax.lessons.lesson16.homeworks

//Класс “Корзина товаров”: содержит поле словаря из ID товаров и их количества.
//Базовый метод addToCart(itemId) добавляет одну единицу товара к уже существующим в корзине.
//Выполнить перегрузку addToCart который:
//Принимает два аргумента (itemId и количество amount)

//Принимает словарь из id и количества и добавляет всё в корзину

//Принимает список из id (добавляет по одной единице).

//Учесть, что если товар уже есть в корзине, нужно увеличить его количество, если нет - добавить.
//Попробуй создать корзину и положить в неё товар разными способами, потом распечатать корзину в консоль.
//Переопредели у корзины метод toString для красивого форматирования содержимого таблицы, включая итоговое количество
// артикулов и общее количество всего товара в корзине.

class Busket(var map: MutableMap<String, Int>) {

    fun addToCart(itemID: String) {
        if (map.containsKey(itemID)) {
            map[itemID] = map.getValue(itemID).plus(1)
        } else {
            map[itemID] = 1
        }
    }

    fun addToCart(itemID: String, amount: Int) {
        if (map.containsKey(itemID)) {
            val item = map.getValue(itemID).plus(amount)
            map.put(itemID, item)
        } else {
            map[itemID] = 1
        }
    }

    fun addToCart(itemMap: Map<String, Int>) {
        itemMap.forEach {
            if (map.containsKey(it.key)) {
                map[it.key] = map.getValue(it.key).plus(it.value)
            } else {
                map.put(it.key, 1)
            }
        }
    }

    fun addToCart(list: List<String>) {
        list.forEach {
            if (map.containsKey(it)) {
                map[it] = map.getValue(it).plus(1)
            } else map[it] = 1
        }
    }
}

fun main() {
    val map = mutableMapOf("qw" to 1, "as" to 2, "asd" to 4)
    val busket = Busket(map)
    busket.addToCart("qw")
    println(map)

    busket.addToCart("uiop")
    println(map)

    busket.addToCart("qw", 2)
    println(map)

    busket.addToCart(mapOf("qw" to 2, "po" to 3))
    println(map)

    busket.addToCart(listOf("po", "asd", "df"))
    println(map)


}
