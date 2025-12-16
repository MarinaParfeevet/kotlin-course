package ru.stimmax.lessons.lesson28.homeworks

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

val bumerFrom = 1946
val bumerTo = 1964
val zumerFrom = 1997
val zumerTo = 2012

fun main() {

//1.Создай текущую метку времени и выведи её на печать (чтобы ещё раз запомнить название этого класса)
    val dateNow = LocalDate.now()
    println(dateNow)

//2.Создай дату своего дня рождения.
    val myBirthday = LocalDate.of(1987, 9, 22)
    println(myBirthday)

//3.Создай период между датой своего рождения и текущей датой. Выведи на печать количество лет из этого периода.
    val period1and2 = Period.between(myBirthday, dateNow)
    println(period1and2.years)

    //4.Создай функцию, которая принимает тип Temporal и выводит форматированное значение в зависимости от того, содержит ли
//аргумент время и часовой пояс. Temporal - это общий тип для разных классов даты-времени. В форматированном значении
//нужно выводить часы, минуты, секунды и таймзону, если они представлены в переданном объекте. Обработай в методе все
//типы дат, которые знаешь. Реализуй два варианта функции - с собственный форматированием и с форматами из ISO коллекции.
    fun task4(temp: Temporal) {
        when (temp) {
            is LocalDate -> "dd.MM.YYYY"
            is LocalTime -> "HH:mm:ss"
            is LocalDateTime -> "dd.MM.yyyy HH:mm:ss"
            is ZonedDateTime -> "dd.MM.yyyy HH:mm:ss z"
            is OffsetDateTime -> "dd.MM.yyyy HH:mm:ss z"
            else -> throw Exception("Is undefined")
        }.let { DateTimeFormatter.ofPattern(it) }
            .also { println(it.format(temp)) }
    }

//5.Создай объекты дат и / или времени которые мы изучили и по очереди передай их в метод созданный выше.
//Не используй в них метод now()
    val obj1 = LocalDate.of(2000, 1, 1)
    val obj2= LocalTime.of(14, 9, 22)
    val obj3 = LocalDateTime.of(2000, 1, 1, 1, 0, 0, 0)
    val obj4 = ZonedDateTime.of(2000, 1, 1, 1, 0, 0, 0, ZoneId.systemDefault())
        // val obj5 = OffsetDateTime.of(obj3, ZoneOffset.of("-02:00"))

    task4(obj1)
    task4(obj2)
    task4(obj3)
    task4(obj4)
  //  task4(obj5)

    //6.Создайте функцию identifyGeneration, которая расширяет класс LocalDate и печатает строку, определяющую, к какому
//поколению принадлежит человек родившийся в эту дату: "Бумер" для тех, кто родился с 1946 по 1964 год включительно,
//и "Зумер" для тех, кто родился с 1997 по 2012 год включительно. Если дата рождения не попадает ни в один из этих
//диапазонов, функция должна печатать "Не определено". Для сравнения дат используй методы isAfter(otherDate) и
//isBefore(otherDate) или проверку вхождения в диапазон. Объекты с эталонными датами вынеси в приватные поля файла с
//методом identifyGeneration.
    fun LocalDate.identifyGeneration() {
        println(
            when (this.year) {
                in bumerFrom..bumerTo -> "Bumer"
                in zumerFrom..zumerTo -> "Zumer"
                else -> "Is undefined"
            }
        )
    }

//7.Создай два объекта даты: 25 февраля 2023 года и 25 февраля 2024 года. Создай форматтер, который форматирует дату в месяц и день.
    val o1 = LocalDate.of(2023, 2, 25)
    val o2 = LocalDate.of(2024, 2, 25)
    val formater1 = DateTimeFormatter.ofPattern("'MM': MM 'dd': dd")

//8.Выведи первую отформатированную дату, прибавив к ней 10 дней.
    println(formater1.format(o1.plusDays(10)))
//9.Выведи вторую отформатированную дату, прибавив к ней 10 дней. Найди отличия)))
    println(formater1.format(o2.plusDays(10)))

    // о2  это высокосный год , поэтому результат 6ое марта, а не 7ое марта

}
