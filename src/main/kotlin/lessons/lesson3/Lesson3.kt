package ru.stimmax.lessons.lesson3

class Lesson3 {
//в котлине всегда надо инициилизовать переменные
    val name: String = "Alice"

    var age: Int = 10

    // пример задания константы в классе (статика)
    companion object {
        const val PI = 3.14

    }

    //отложенная инициализация, только var
    lateinit var phoneNumber: String

    //линивая инициализация, только val
    val lazyValue: String by lazy {
        "Hello, this lazy value"
    }

    //обозначение nullable переменной, это значит что значение может быть null, обозначается вопросом
    var speed: Double?=null

    fun example(){
      //  name = "a"
        age = 23
        speed?.dec()
    }

    var count: Int = 0
        get() {
            return if (field>100) field else 0
        }
        set(value) {
            if (value>0) field = value
        }

}
