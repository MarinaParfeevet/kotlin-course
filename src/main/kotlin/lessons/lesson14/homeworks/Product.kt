package ru.stimmax.lessons.lesson14.homeworks
//Покупка: продукт. Создайте дата класс для продукта, который будет представлять продукт в магазине. У него должны
// быть свойства “название”, “цена”, “количество”.

data class Product(
    var name: String,
    var price: Double,
    var amount: Int
)
