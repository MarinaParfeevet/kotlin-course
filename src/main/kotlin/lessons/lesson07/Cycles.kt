package ru.stimmax.lessons.lesson07

fun main() {
    for (i in 1..10) {
        println(i*2)
    }

    for (i in 10 downTo 1) {
        println(i)
    }

    for (i in 1..10 step 2) {
        println(i)
    }

    for (i in 1 until 10) { // не включая 10
        println(i)
    }

    val range = 1..10
    for (i in range) {
        println(i)
    }

    var counter = 0
    while (counter++ < 10) {
        println(counter)
    }

    var counter1 = 0
    do {
        println(counter1)
    } while (counter1++ < 10)

    for (i in 1..10) {
        if (i == 3) break
        println(i)
    }

    for (i in 1..10) {
        if (i == 3) continue
        println(i)
    }
}
