package ru.stimmax.lessons.lesson05.homeworks

fun main() {
    //  1
    val baseIntensity: Double = 3.0
    val coefficient: Double? = 0.73 // но может быть null
    val baseCoefficient = 0.5
    val resultIntensity = baseIntensity * (coefficient ?: baseCoefficient)

    //  2
    val defaultCost: Double = 50.0
    val cost: Double? = 20.0 // но может быть null
    val deliveryCost = 5.0
    val insuranceCoefficient = 0.005
    // стоимость страховки
    val insuranceCost = insuranceCoefficient * (cost ?:defaultCost)
    val totalCost: Double = deliveryCost + insuranceCost

    //  3
    val pressure: String? = "34.6" // но может быть null
    val attentionMessage = "Attention, pressure is lost"
    val pressureForLab = pressure ?: attentionMessage

}
