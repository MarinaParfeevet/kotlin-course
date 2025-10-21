package ru.stimmax.lessons.lesson14.practice

class Wind(var speed: Double) {
    fun convertToMetersPerSecond(): Double {
        return speed / 3.6
    }

    fun setSpeed(speed:Double){
        if (speed < 0) return
        else this.speed = speed
    }
}
