package ru.stimmax.lessons.lesson12

fun main() {
    val ex = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val a = ex.firstOrNull() { it > 0 }
    ex.forEach { println(it*it) }

    val b = ex.filter() { it in 1..7 }
    val c = ex.filterNotNull()

    val sCol = listOf("zasd", "qwe", "yt6", "ytxc")
    val q = sCol.map(){it.length}

    val p = sCol.associate{it to it.reversed()}
    val k = sCol.sorted()
    println(k)

    val g= sCol.groupBy { it.first() }
    println(g)
}
