package ru.stimmax.lessons.lesson18.homeworks



//Задача 4. Создай абстрактный класс оборудования с возможностью устанавливать температуру и открываться и с
// наследованием от программируемого оборудования. Также имплементируй интерфейсы.
abstract class BaseTempRegulatableAndOpenable : BaseProgrammable(), TemperatureRegulatable, Openable {
    override fun open() {
        println("Открыл")
    }

    override fun close() {
        println("Закрыл")
    }

    override fun setTemperature(temp: Int) {
        if (temp <= maxTemperature) {
            println("Установил температуру на $temp")
        } else {
            println("Температура превышает максимальную. Установил температуру на $maxTemperature как максимально доступную")
        }
    }

    override val maxTemperature: Int = 40

}
