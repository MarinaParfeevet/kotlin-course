package ru.stimmax.lessons.lesson14.homeworks

//Природное явление: луна. Создайте объект Moon, который будет представлять Луну. Добавьте свойства
// isVisible (Boolean), чтобы отображать, видна ли Луна в данный момент, и phase (String), чтобы отображать
// текущую фазу Луны (например, "Full Moon", "New Moon"). Добавьте метод showPhase(), который выводит текущую фазу
// Луны.

class Moon(
    var isVisible: Boolean,
    var phase: String
) {
    fun showPhase() {
        if (isVisible) {
            println(phase)
        } else println("moon invisible")
    }
}

