package ru.stimmax.lessons.lesson13

fun main() {

    val food = mapOf(
        "Овощи" to listOf("Картофель", "Морковь", "Лук"),
        "Фрукты" to listOf("Яблоки", "Груши", "Апельсины"),
        "Ягоды" to listOf("Виноград", "Клубника", "Голубика"),
        "Орехи" to listOf("Арахис", "Фундук", "Макадамия"),
        "Зелень" to listOf(),
    )

    val a: List<String>? = food["Овощи"]
    for ((key, value) in food) {
        println("$key -> $value")
    }

    food.forEach{ println("${it.key} -> ${it.value}") }

    val b:List<String> = food.getValue("Фрукты")
    val c:List<String> = food.getOrDefault("Крупы", listOf())
    val d:List<String> = food.getOrElse("Рыба") {
        println("значение не найдено")
        listOf()
    }

    if (!food.contains("Мясо") && !food.contains("Рыба")) {
        println(" продукты для вегана")
    }

    val list = food.map { "${it.key}: [${it.value.joinToString(separator = ",")}]" }
}

