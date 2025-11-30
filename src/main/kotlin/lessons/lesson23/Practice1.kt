package ru.stimmax.lessons.lesson23

//Задание 1
fun example01() {
    println("Hello!")
}
fun main() {
    val e1 = fun () {
        println("Hello!")
    }
    val e11: () -> Unit = {
        println("Hello!")
    }
    val e111 = {
        println("Hello!")
    }
}
