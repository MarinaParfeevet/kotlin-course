package ru.stimmax.lessons.lesson18.homeworks

//Задача 2. Создай абстрактный класс для включаемого оборудования и имплементируй соответствующий интерфейс с
// реализацией методов (достаточно println с выполняемым действием).

abstract class BasePower : Powerable {
    protected var isOn = false
    override fun powerOn() {
        isOn = true
        println("Устройство включено")

    }

    override fun powerOff() {
        isOn = false
        println("Устройство выключено")
    }
}
