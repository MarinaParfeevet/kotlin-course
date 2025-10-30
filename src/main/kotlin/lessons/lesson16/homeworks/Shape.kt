package ru.stimmax.lessons.lesson16.homeworks

import kotlin.math.sin

//Геометрические Фигуры и Их Площадь
//Абстрактный (базовый) класс: Shape с open методом area().
//Классы наследники: Circle, Square, Triangle.
//Метод area() возвращает 0.0.
//Переопределите метод area() в каждом классе-наследнике для расчета площади соответствующей фигуры.
//Подсказка: каждый класс должен иметь аргументы конструктора, позволяющие вычислить площадь (для круга это радиус,
// для квадрата это сторона, для треугольника это две стороны и угол между ними)
//Создай набор геометрических фигур и выведи в цикле их площадь

abstract class Shape {
    open fun area() = 0.0
}

class Circle(var radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * Math.pow(radius, 2.0)
    }
}

class Square(var a: Int) : Shape() {
    override fun area(): Double {
        return Math.pow(a.toDouble(), 2.0)
    }
}

class Triangle(var a: Int, var b: Int, var x: Double) : Shape() {
    override fun area(): Double {
        return (a * b * sin(x * Math.PI / 180)) / 2
    }
}

fun main() {
    val list = listOf(Circle(2.0), Square(5), Triangle(6, 7, 30.0))
    list.forEach { println(it.area()) }
}
