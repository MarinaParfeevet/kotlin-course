package ru.stimmax.lessons.lesson14.practice

class Lamp(private var state: Boolean) {
    fun changeState() {
        state = !state
        val isOn = if (state) "On" else "Off"
        println(isOn)
    }
}

