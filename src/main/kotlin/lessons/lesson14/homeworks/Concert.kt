package ru.stimmax.lessons.lesson14.homeworks

//Мероприятие: концерт. Создайте класс, который будет представлять концерт. У него должны быть свойства “группа”,
// “место проведения”, “стоимость”, “вместимость зала”. Также приватное поле “проданные билеты”. Добавьте метод,
// который выводит информацию о концерте и метод “купить билет”, который увеличивает количество проданных билетов
// на один.
class Concert(
    var group: String,
    var place: String,
    var capacity: Int,
    private var soldTicket: Int
) {
    fun showInfo() {
        println("$group, $place, $capacity, $soldTicket")
    }

    fun buyTicket() {
        soldTicket++
    }

}
