package ru.stimmax.lessons.lesson15.homeworks

//Геометрические Фигуры
//Базовый класс: Геометрическая Фигура
//Производные классы: Многоугольник, Круг
//Дополнительное разветвление для Многоугольник: Треугольник, Четырехугольник

open class Figures() {
    fun printFigure() {
        println("figure")
    }
}

class Cirle(var radius: Int) : Figures() {
    fun print() {}
}

open class Polygon(var a: Int) : Figures() {
    fun print() {}
    fun getSquare(a: Int) = a * a
}

class Triangle(x: Int, var y: Int, var z: Int) : Polygon(x) {
    fun getPeriment(x: Int, y: Int, z: Int): Int {
        return x + y + z
    }
}

class Rectangle(x: Int, var y: Int) : Polygon(x) {
    fun getSquare(x: Int, y: Int): Int {
        return x * y
    }
}

//Учебные Заведения
//Базовый класс: Учебное Заведение
//Производные классы: Школа, …
//Дополнительное разветвление для …: …
open class EducCentre(var city: String) {}
class School(city: String, var type: String) : EducCentre(city) {}
open class HighEduc(city: String, var type: String) : EducCentre(city) {}
class University(city: String, type: String, var prestige: Int) : HighEduc(city, type) {}
class Academy(city: String, type: String, var specilization: String) : HighEduc(city, type) {}

//Иерархия Мебели
//Базовый класс: Мебель
//Производные классы: …
//Дополнительное разветвление для …: …
open class Mebel(var material: String) {}
class StreetMebel(material: String, var waterProof: Boolean) : Mebel(material) {}
open class HomeMebel(material: String, var color: String) : Mebel(material) {}
class BathroomMebel(material: String, city: String) : HomeMebel(material, city) {}
