package ru.stimmax.lessons.lesson16.homeworks

import ru.stimmax.lessons.lesson16.Colors
import ru.stimmax.lessons.lesson16.printColored

//Животные и Их Звуки
//Базовый класс: Animal с методом makeSound().
//Классы наследники: Dog, Cat, Bird.
//Базовый метод makeSound() в классе Animal выводит "This animal makes no sound."
//Переопределите метод makeSound() в каждом классе-наследнике, чтобы Dog выводил "Bark", Cat - "Meow", Bird - "Tweet".
// Обогати вывод звуков цветом.
//Создайте список животных List<Animal> и вызовите в цикле метод makeSound()

open class Animal {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        printColored("Meow", Colors.RED)
    }
}

class Bird : Animal() {
    override fun makeSound() {
        printColored("Tweet", Colors.YELLOW)
    }
}

class Dog : Animal() {
    override fun makeSound() {
        printColored("Bark", Colors.GREEN)
    }
}

fun main() {
    val noDog = Animal()
    noDog.makeSound()

    val cat = Cat()
    cat.makeSound()
}
