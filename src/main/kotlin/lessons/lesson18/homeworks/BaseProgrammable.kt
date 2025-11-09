package ru.stimmax.lessons.lesson18.homeworks

//Задача 3. Создай абстрактный класс для программируемого оборудования (с имплементацией соответствующего интерфейса и реализацией методов)
// и наследуй его от абстрактного класса включаемого оборудования.
abstract class BaseProgrammable : BasePower(), Programmable {

    override fun programAction(action: String) {
        if (isOn) {
            println("Запрограммировал действие - $action")
        }
    }

    override fun execute() {
        if (isOn) {
            println("Выполнение действия ")
        }
    }
}
