package ru.stimmax.lessons.lesson06

fun main() {
    example1(9)
}

fun example1(arg: Int) {
    when (arg) {
        in 0..5 -> println("night")
        in 6..11 -> println("morning")
        in 12..17 -> println("afternoon")
        else -> println("error")
    }

    fun example2(temp: Int, cond: Boolean) {
        if (temp > 30 || temp < -5) {
            if (cond) println("seat at home")
            else println("take a car")
        } else if (temp >= 15 && !cond) println("have a walk")
                else println("take a bus")
    }
}
