package ru.stimmax.lessons.lesson14

fun main() {
    val person = Person("John", 30)
    person.sayHello()
}
class Person(val name: String, var age: Int) {
    // Метод класса
    fun sayHello() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

