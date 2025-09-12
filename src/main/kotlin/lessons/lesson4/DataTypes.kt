package ru.stimmax.lessons.lesson4

val myInt: Int = 5
val myFloat: Float = 0.58F
val myLong: Long = 1_234_567_890L
val myShort: Short = 32000
val myByte: Byte = 120
val myDouble: Double = 5.99

val isKotlinFun: Boolean = true

val letter: Char = 'A'
val text: String = "Hello, Kotlin!"

//коллекции
val numbers: Array<Int> = arrayOf(1, 2, 3)
val strings: List<String> = listOf("one", "two", "one")
val doubles: Set<Double> = setOf(23.3, 56.8)

//словари
val keysToValues: Map<String, String> = mapOf(
    "Ключ 1" to "Значение 1",
    "Ключ 2" to "Значение 2",
)

//Null-безопасные Типы. Надо явно указать что может быть null
val name: String? = null

//это "ничего", используется когда ничего не возвращает, например в лямбда выражениях
val unit:Unit = Unit

//для обозначения функций, которые никогда нормально не завершаются. Это значит, что такие функции либо выбрасывают исключение, либо бесконечно выполняются
fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

//Any - любой тип
var something: Any = "24"
fun change() {
    something = 24
    something = true
    something = ArrayList<String>()
}

//PRACTICE
val s1:Byte = 100
val s2:Long = 156L
val s3:Float = 12.34f
val s4:Double = 123.456
val s5:String = "Hello, World!"
val s6:Boolean = true
val s7:Char = 'a'
val s8:Byte = 0
val s9:Long = 9999999999L
val s10:Float = 25.0f
val s11:Double = -123.4
val c1:List<Byte> = listOf(2, 3, 4)
val c2:Char = '?'
val c3:String = "Kotlin"
val c4:Set<Double> = setOf(3.14, 45.0)
val c5:Boolean = false
val c6:String = "D"
val c7:Long = 2147483648L
val c8:Array<String> = arrayOf("Hello", "world")
val c9:String = "true"
val r1:Map<Int, String> = mapOf(12 to "Kotlin")
val r2:Float = 0.1f
val r3:Char = '!'
val r4:Map<String, Any?> = mapOf("a" to 'a', "b" to true, "n" to null)
