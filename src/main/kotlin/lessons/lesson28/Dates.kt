package ru.stimmax.lessons.lesson28

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

fun main() {

//Instant
//Представляет момент времени относительно эпохи Unix (00:00:00 UTC 1 января 1970 года).
//Используется для работы с метками времени в формате UTC.
//Идеален для хранения и обработки временных меток в распределенных системах или для сериализации времени в базах данных.
    val instant = Instant.now()
    println(instant.epochSecond)

//LocalDate
//Представляет дату (год, месяц, день) без времени и часового пояса. Используется, когда вам нужна только дата.
    val dateTimeNow = LocalDate.now()
    val birthday = LocalDate.of(1983, 10, 2)

//LocalTime
//Представляет время без даты и часового пояса. Подходит, когда важно только время.
    val localTimeNow = LocalTime.now()
    val endOfTheMyWorkingDay = LocalTime.of(18, 0, 0)

//LocalDateTime
//Сочетает в себе LocalDate и LocalTime, хранит информацию о дате и времени без учета часового пояса.
    val localDateTime = LocalDateTime.now()
    val alarmClock = LocalDateTime.of(2024, 4, 1, 9, 0, 0)

//ZonedDateTime
//Подобно LocalDateTime, но также содержит информацию о часовом поясе. Используется для точного представления моментов
// времени с учетом часовых поясов.

//Для указания часового пояса используется класс ZoneId, он представляет собой идентификатор часового пояса, который может
// включать в себя правила для изменения времени, такие как переход на летнее время и обратно.

//Это более общий способ работы с часовыми поясами, который учитывает все исторические и будущие изменения в правилах
// часового пояса для конкретной географической области.
//https://en.wikipedia.org/wiki/List_of_tz_database_time_zones

// Примеры ZoneId: "Europe/Paris", "America/New_York".
    val vaticanCurrentTime = ZonedDateTime.now(ZoneId.of("Europe/Vatican"))
    val mobileWorldCongress = ZonedDateTime.of(2024, 2, 26, 10, 0, 0, 0, ZoneId.of("Europe/Madrid"))

//OffsetDateTime
//Это более конкретный способ работы с часовыми поясами, который используется, когда нужно указать только фиксированное
// смещение от координированного всемирного времени, без перехода на летнее время и других изменений. Для указания смещения
// используется класс ZoneOffset. Он подходит для случаев, когда известно только смещение от UTC и не требуется учет
// дополнительных правил часового пояса.

// Примеры ZoneOffset: "+02:00", "-05:00".
    val birthdayInDubai = OffsetDateTime.of(birthday.atTime(19, 0), ZoneOffset.of("+09:00"))

//Преобразования
//Можно преобразовывать между собой типы Instant, ZonedDateTime и OffsetDateTime
    val vaticanCurrentTimeInstant = vaticanCurrentTime.toInstant()
    val birthdayInstant = birthday.atTime(19, 0).toInstant(ZoneOffset.of("+09:00"))
    val instantToZonedDateTime = instant.atZone(ZoneId.systemDefault())
    val instantToOffsetDateTime = instant.atOffset(ZoneOffset.of("-02:00"))

//Методы для работы с датами
//Прибавление к дате
    LocalDate.now().plus(2, ChronoUnit.MONTHS)
//Год:
LocalDate.now().plusYears(1) // Добавить один год к текущей дате
//Секунда:
LocalDateTime.now().plusSeconds(1) // Добавить одну секунду к текущей дате и времени

//Вычитание из даты
//Год:
LocalDate.now().minusYears(1) // Вычесть один год из текущей даты
//Секунда:
LocalDateTime.now().minusSeconds(1) // Вычесть одну секунду из текущей даты и времени
//Получение разницы между датами или временем
//Period.between(startDate, endDate) // Получить разницу между двумя датами в годах, месяцах и днях
//Duration.between(startDateTime, endDateTime) // Получить разницу между двумя моментами времени в часах, минутах и секундах

//Сравнение дат
//Больше: date1.isAfter(date2) // Проверяет, больше ли date1, чем date2
//Меньше: date1.isBefore(date2) // Проверяет, меньше ли date1, чем date2
//Равно: date1.isEqual(date2) // Проверяет, равны ли date1 и date2
//ChronoUnit enum, представляющий единицу измерения времени, такую как дни, месяцы, годы. Используется в операциях с
// датами для указания, в каких единицах измерения производится добавление или вычитание.

// ChronoUnit от наносекунд до полу-дней, посмотреть в реализацию plus
    val nextAlarmClock = alarmClock.plus(5, ChronoUnit.MINUTES)
    val nextBirthday = birthday.plusYears(1)

//Периоды
//Duration и Period оба предназначены для измерения количества времени, но они используются в различных контекстах и
// имеют разные основные единицы измерения.

//Duration измеряет время в секундах и наносекундах.

//Использование: Он предназначен для измерения временных интервалов с высокой точностью и обычно используется для
// измерения коротких промежутков времени, например, время выполнения операции в приложении.

//Операции: Duration поддерживает арифметические операции, такие как сложение, вычитание, умножение и деление.
//Period измеряет время в годах, месяцах и днях.
//Использование: Он предназначен для измерения временных интервалов в контексте календарных дат и обычно используется для
// работы с датами, например, для расчета возраста человека или длительности события.
//Period не хранит длительность в секундах, поэтому невозможно из этого типа получить точную длительность, например в днях.
// Вместо этого, он хранит данные в виде “лет”, “месяцев”, “дней”. Можно получить эти значения по отдельности. Это связано
// с тем, что невозможно года и месяцы перевести в дни не зная точной даты начала, так как есть високосные годы и в месяцах
// разное количество дней.

//Фактически, этот тип поможет вычислить разницу между датами и получить годы, месяцы и дни.

//Операции: Period также поддерживает арифметические операции, но они сосредоточены на добавлении или вычитании дней,
// месяцев и лет к дате.

    val nanoSeconds = Duration.ofNanos(200)
    println(nanoSeconds.dividedBy(4).toNanos())
    println(nanoSeconds.plus(Duration.ofSeconds(2)).toNanos())
    val seconds = Duration.ofSeconds(45)
    println(seconds.minusMinutes(1).seconds)
    val period = Period.of(2, 4, 10)
    println(period.minusMonths(13).toTotalMonths())
    val periodFromConferenceToBirthday = Period.between(mobileWorldCongress.toLocalDate(), birthday)
    println("${periodFromConferenceToBirthday.years} лет ${periodFromConferenceToBirthday.months} месяцев ${periodFromConferenceToBirthday.days} дней")

//Форматирование дат в Kotlin с использованием DateTimeFormatter
//Основные шаблоны форматирования:

//yyyy: год четырьмя цифрами
//MM: месяц двумя цифрами (01 - Январь, 12 - Декабрь)
//MMM: месяц сокращённо (янв., фев. и т.д.)
//MMMM: месяц полностью
//dd: день месяца двумя цифрами
//HH: часы в 24-часовом формате
//mm: минуты
//ss: секунды
//SSS: миллисекунды
//ZZZ: часовой пояс в формате +HHmm или -HHmm
//z: текстовое название часового пояса
//'текст': литералы, которые будут выводиться как есть
//Примеры форматирования:

    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS ZZZ")
    val formattedDate = vaticanCurrentTime.format(formatter)
    println("Текущая дата и время с миллисекундами и часовым поясом: $formattedDate")
    val isoFormatter = DateTimeFormatter.ISO_DATE_TIME
    val isoFormattedDate = birthdayInDubai.format(isoFormatter)
    println(isoFormattedDate)
    val prettyFormatter = DateTimeFormatter.ofPattern("'год' yyyy', месяц' MM', день' dd")
    val prettyFormattedDate = dateTimeNow.format(prettyFormatter)
    println(prettyFormattedDate)
    try {
        println(
            "При форматировании с часовым поясом помни, что в LocalDateTime его нет и будет ошибка ${
                localDateTime.format(
                    formatter
                )
            }"
        )
    } catch (e: Throwable) {
        e.printStackTrace()
    }
    try {
        println("При форматировании LocalDate помни, что нет полей времени и будет ошибка ${birthday.format(formatter)}")
    } catch (e: Throwable) {
        e.printStackTrace()
    }
//Стандартный формат даты с часовым поясом и миллисекундами
//Стандарт ISO 8601 определяет формат даты и времени, включающий часовой пояс и миллисекунды: yyyy-MM-dd'T'HH:mm:ss.SSSZZZ.
// Пример: 2023-03-29T15:42:01.123+0300.

//Парсинг дат с использованием форматтера
    val parsedDate = LocalDate.parse(prettyFormattedDate, prettyFormatter)
    println(parsedDate)
}
