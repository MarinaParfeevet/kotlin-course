package ru.stimmax.lessons.lesson14

import java.time.LocalDate
import java.time.Period

class Passenger(
    val name: String,
    private val dateOfBirth: String,
    private var phone: String
) {
    private var age: Int = calculateAge()
    private fun calculateAge(): Int {
        return Period.between(
            LocalDate.parse(dateOfBirth),
            LocalDate.now()
        ).years
    }
    fun recalculateAge() {
        age = calculateAge()
    }
}
class Carriage(val capacity: Int, val type: String = "Плацкарт") {
    private val passengers = mutableMapOf<Int, Passenger>()
    fun boardPassenger(passenger: Passenger, seat: Int) {
        if (passengers.size < capacity) {
            passengers[seat] = (passenger)
        }
    }
    fun passengerGetOff(seat: Int) {
        passengers.remove(seat)
    }
}
class Train(val engineType: String) {
    val carriages = mutableListOf<Carriage>()
    fun boardPassenger(
        passenger: Passenger,
        seat: Int,
        carriageType: String
    ) {
        // логика для размещения пассажира
    }
}
fun main() {
    val reservedSeatCarriage = Carriage(48)
    val compartmentCarriage = Carriage(16, "Купе")
    val train = Train("Electric locomotive")
    train.carriages.add(reservedSeatCarriage)
    train.carriages.add(compartmentCarriage)
    val passengerAlexandr = Passenger("Alexandr", "02.10.1983", "")
    train.boardPassenger(passengerAlexandr, 10, "Купе")
}
