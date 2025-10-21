package ru.stimmax.lessons.lesson14

object Logger {
    fun log(message: String) {
        println("Log: $message")
    }
}
fun main() {
    Logger.log("Application started")
}
