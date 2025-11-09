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
            addToCart(it.key, it.value)
        }
    }

    fun addToCart(list: List<String>) {
        list.forEach {
            addToCart(it)
        }
    }

    override fun toString(): String {
        val countID = map.size
        val countAmount = map.values.sum()
        val list = map.map { "Артикул: ${it.key}  Количество: ${it.value}" }
            .joinToString(separator = "\n")
        return list + "Всего артикулов: $countID \n Всего товаров: $countAmount"
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
