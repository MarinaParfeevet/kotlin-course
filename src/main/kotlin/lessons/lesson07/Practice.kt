package ru.stimmax.lessons.lesson07

fun main() {
    for (i in 10 downTo 1 step 3) {
        if (i % 2 == 0) println(i * i)
    }

    var length: Int = 34
    for (i in 0..<length) {

    }

    var counter = 0
    var sum = 0
    while (counter <= 10) {
        sum += counter
        counter++
    }
    println(sum)

    var ss = 0
    var count = 0
    do {
        ss += count
        count++
    } while (ss + count <= 50)

    var i = 1
    while (true) {
        i++
        if (i % 7 == 0) break
    }
    println(i)
    println()

    for (j in 1..10) {
        if (j == 3 || j==7) continue
        println(j)
    }

    count =0
    for (j in 20 downTo 1) {
        count++
        if (count==4) {
            count=0
            continue
        }
        println(j)
    }
}
