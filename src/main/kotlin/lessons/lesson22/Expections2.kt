package ru.stimmax.lessons.lesson22

//Шаг 1: Определение собственного исключения
//
//Для начала создадим класс исключения, наследуясь от RuntimeException или другого подходящего базового класса исключений.
class OrderException(message: String) : RuntimeException(message)

//Шаг 2: Использование собственного исключения
//
//Далее, используем наше собственное исключение в коде приложения для более точной реакции на конкретные ошибки.
fun placeOrder(orderDetails: String) {
    if (orderDetails.isBlank()) {
        throw OrderException("Детали заказа не указаны.")
    }
    // Логика оформления заказа
    println("Заказ оформлен: $orderDetails")
}

//Так же, при создании собственных исключений, можно использовать сразу набор из конструкторов, что позволит расширить
// возможности использования исключения.

class CustomException : RuntimeException {
    constructor(message: String) : super(message)
    constructor(message: String, cause: Throwable) : super(message, cause)
    constructor(cause: Throwable) : super(cause)
}

fun main() {
    try {
        placeOrder("") // Попытка оформить заказ с пустыми деталями
    } catch (e: OrderException) {
        println("Ошибка при оформлении заказа: ${e.message}")
    }
}
