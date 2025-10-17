package ru.stimmax.lessons.lesson13

fun main() {

    val fruitsPrices = mapOf("apple" to 2.99, "banana" to 1.99, "cherry" to 3.99)

//Доступ к Элементам Словаря через Map.Entry

    for (entry in fruitsPrices.entries) {
        println("Key: ${entry.key}, Value: ${entry.value}")
    }

    for ((key, value) in fruitsPrices) {
        println("Key: $key, Value: $value")
    }

  //  Получение Элементов
           // entries, keys, values
    val entries = fruitsPrices.entries
    val keys = fruitsPrices.keys
    val values = fruitsPrices.values
    println(entries)
    println(keys)
    println(values)

        // getOrElse, getValue, getOrDefault
    val priceOfPearOrElse = fruitsPrices.getOrElse("pear") { 9999.99 }
    val priceOfApple = fruitsPrices.getValue("apple") // если значение not nullable, если возможно null используем fruitsPrices[".."]
    val priceOfPearOrDefault = fruitsPrices.getOrDefault("pear", 0.0)

//     Изменение состава словаря
    val fruitsWithoutBanana = fruitsPrices - "banana" // создание нового словаря в котором нет "banana"
    val fruitsWithPineapple = fruitsPrices + ("pineapple" to 3.5) // создание нового словаря с дополнительной парой
    val mutableFruits = fruitsPrices.toMutableMap() // Создание нового изменяемого словаря с теми же значениями
    mutableFruits["kiwi"] = 2.75 // Добавление элемента
    mutableFruits.putAll(mapOf("lime" to 1.1, "avocado" to 1.9)) // Добавление словаря
    mutableFruits + mapOf("lime" to 1.1, "avocado" to 1.9) // Не добавляет данные в существующий словарь а создаёт новый, в который включены данные из обоих словарей
    mutableFruits.remove("apple") // Удаление элемента
    mutableFruits.clear() // Очистка словаря

    //   Проверка наличия элементов

        // containsKey, containsValue, isEmpty, isNotEmpty
    val containsApple = fruitsPrices.containsKey("apple")
    val containsValue1_5 = fruitsPrices.containsValue(1.5)
    val isEmpty = fruitsPrices.isEmpty()
    val isNotEmpty = fruitsPrices.isNotEmpty()
    val areAllFruitsExpensive = fruitsPrices.all { it.value > 1.0 }
    val isAnyFruitCheap = fruitsPrices.any { it.value < 1.0 }

// Фильтрация и преобразование

       // filter, filterKeys, filterValues, filterNot, count
    val filteredByPrice = fruitsPrices.filter { it.value > 1.0 }
    val filteredByKeys = fruitsPrices.filterKeys { it.startsWith("a") }
    val filteredByValues = fruitsPrices.filterValues { it < 2.0 }
    val filteredNotApple = fruitsPrices.filterNot { it.key == "apple" }
    val countExpensiveFruits = fruitsPrices.count { it.value > 1.5 }

       //  map, mapKeys, mapValues
    val increasedPrices = fruitsPrices.mapValues { it.value * 1.1 } // можно также менять тип, например, с Int в String
    val fruitNamesUppercase = fruitsPrices.mapKeys { it.key.uppercase() }
    val fruitsList = fruitsPrices.map { "${it.key} costs ${it.value}" }

       // Преобразование в Map и MutableMap
    val toMap = mutableFruits.toMap()
    val toMutableMap = fruitsPrices.toMutableMap()


  //  Итерация с forEach

     // С использованием деструктуризации
    fruitsPrices.forEach { (fruit, price) ->
        println("$fruit costs $price")
    }

      // С использованием it как объекта Map.Entry

            fruitsPrices.forEach {
                println("${it.key} costs ${it.value}")
            }

    //   Размер словаря
            //size и count
    fruitsPrices.size // количество ключей
    fruitsPrices.count() // тоже количество ключей
    fruitsPrices.count { it.value > 2 } // количество ключей если сначала применить фильтрацию по условию

}
