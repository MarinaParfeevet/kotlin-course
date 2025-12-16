package ru.stimmax.lessons.lesson28

import ru.stimmax.lessons.lesson3.homework.privatePolicy
import java.time.*
import java.time.format.DateTimeFormatter

fun main() {
//    1.Создай текущую метку времени.
    val a = Instant.now()
    val b = Instant.ofEpochSecond(-123456789) // от 1970 года отсчет
    println(b)

//    3.Создай дату дня знаний в 2024 году
    val c = LocalDate.of(2022, 9, 1)
    val d = LocalDate.of(2025, 5, 31)

//    5.Вычисли период между датами и выведи её в неделях
    val e = Period.between(c, d)
    println(e) //result p2y8m30d - 2 года 8 месяца 30 дней

//    6.Создай период из 2 лет, 3 месяцев и 24 дней
    val k = Period.of(2, 9, 24)

//    7.Добавь этот период к дате последнего дня весны, выведи в формате год-месяц-день
    println(d + k)

//    8.Создай запись для календаря (дату и время) - планирование спринта на ближайший понедельник, 10 утра московского времени
    val f = ZonedDateTime.of(2025, 10, 25, 10, 45, 35, 50, ZoneId.of("Europe/London"))
    val s = LocalDate.of(2025, 12, 25)
    val v = LocalTime.of(11, 12)
    val date = ZonedDateTime.of(s, v, ZoneId.of("Europe/London"))

    val i = s.atTime(v).atZone(ZoneId.of("Europe/London"))

//    9.Прибавь к дате планирования 11 дней и пять часов, выведи дату закрытия спринта в отформатированном виде.
    val p = i.plusDays(11).plusHours(5)
    val formater = DateTimeFormatter.ofPattern("'год' yyyy', месяц' MM', день' dd")
    println(formater.format(p))

//    10.Умножь период из пункта 6 на 2 методом multipliedBy(), распечатай результат и объясни его.
    val m = k.multipliedBy(2)
    println(k)
    println(m)
}
