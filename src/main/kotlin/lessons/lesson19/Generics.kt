package ru.stimmax.lessons.lesson19

class Box<T>(val item: T)

fun <S> secondOrNull(list: List<S>): S? {
    return list.getOrNull(1)
}
//ограничения дженериков
fun <T : Number> sum(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}

//Использование нескольких дженериков
class GenericIterator<T : Number, R : Iterable<T>>(
    private val argument: T,
    private val elements: R
) {

    fun printElements() {
        for (e in elements) {
            println(
                e.toString()
                    .repeat(argument.toInt())
            )
        }
    }
}

fun main() {

    val appleBox = Box("Apple")
    val intBox = Box(42)

    val appleBoxItem: String = appleBox.item
    val intBoxItem: Int = intBox.item

    val secondElementLength: Int? = secondOrNull(listOf("a", "b", "c"))?.length

    println(sum(5, 10))        // 15.0
    println(sum(3.5, 2.5))     // 6.0
}
