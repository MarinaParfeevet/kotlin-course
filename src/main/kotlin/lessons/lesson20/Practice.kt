package ru.stimmax.lessons.lesson20

fun List<Int>.second(str: String) {

}

fun <T, R> Map<T, R>.third(key: T, value: R): R {
    return value
}

fun Double?.fifth(): Int? {
    return null
}

fun <S> Set<S>.sixth(arg: S): List<S> {
    return toList()
}

fun Double.formStr(): String {
    return "%.2f".format(this)
}

fun String.countWords(): Int {
    return this.split(" ").count { it.isNotBlank() }
}

fun <T> T.createList() = listOf(this)


fun main(args: Array<String>) {
    println(0.765434674.formStr())
    println(" z  ds sdf   il".countWords())

    "strnig g".createList()
    1234.createList()
    3.7654.createList()
}
