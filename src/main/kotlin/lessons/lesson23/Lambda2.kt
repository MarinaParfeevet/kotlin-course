package ru.stimmax.lessons.lesson23

//Шаг 1: Основной класс
class OrderProcessor(val deliveryAddress: String) {
    fun calculateDeliveryTime(productId: Int): String {
        val deliveryTimeDays = when (productId) {
            in 1..100 -> 3
            else -> 5
        }
        return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
    }
}
//Шаг 2: Расширение класса
//Теперь, вынесем функцию calculateDeliveryTime в расширение класса OrderProcessor:

fun OrderProcessor.calculateDeliveryTime(productId: Int): String {
    val deliveryTimeDays = when (productId) {
        in 1..100 -> 3
        else -> 5
    }
    return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
}

//Шаг 3: Анонимная функция
//Преобразуем calculateDeliveryTime в анонимную функцию с контекстом OrderProcessor:
val calculateDeliveryTime2 = fun OrderProcessor.(productId: Int): String {
    val deliveryTimeDays = when (productId) {
        in 1..100 -> 3
        else -> 5
    }
    return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
}

//Шаг 4: Лямбда выражение
//Теперь преобразуем анонимную функцию в лямбда выражение с контекстом:
val calculateDeliveryTime: OrderProcessor.(Int) -> String = {
    val deliveryTimeDays = when (it) {
        in 1..100 -> 3
        else -> 5
    }
    "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
}

//Использование
fun main() {
    val op = OrderProcessor("my address")
    calculateDeliveryTime(op, 34)
// или
    op.calculateDeliveryTime(34)
}
