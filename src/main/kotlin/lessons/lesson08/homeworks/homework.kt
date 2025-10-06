package lessons.lesson08.homeworks


// 1. Преобразование строк
fun funnyString(phrase: String): String {
    var result = phrase.trim()

    when {
        // 1. Содержит слово "невозможно"
        result.lowercase().contains("невозможно") ->
            result = result.replace("невозможно", "совершенно точно возможно, просто требует времени")

        // 2. Начинается с "Я не уверен"
        result.startsWith("Я не уверен", ignoreCase = true) ->
            result += ", но моя интуиция говорит об обратном"

        // 3. Содержит слово "катастрофа"
        result.lowercase().contains("катастрофа") ->
            result = result.replace("катастрофа", "интересное событие")

        // 4. Заканчивается на "без проблем"
        result.endsWith("без проблем", ignoreCase = true) ->
            result = result.removeSuffix("без проблем").trimEnd() + " с парой интересных вызовов на пути"

        // 5. Только одно слово
        result.split(" ").filter { it.isNotBlank() }.size == 1 ->
            result = "Иногда, $result, но не всегда"
    }

    return result
}

//2. Извлечение даты из строки лога
fun getDate(log: String) {
    val index = log.indexOf("->") + 2
    val dateTime = log.substring(index)
    val date = dateTime.trim().split(" ")[0]
    val time = dateTime.trim().split(" ")[1]
    println(date)
    println(time)
}

//3. Маскирование личных данных
fun hideCreditCardNumbers(cardNumber: String) {
    var number = cardNumber.trim().replace(" ", "")
    val lastFourDigits = number.takeLast(4)
    number = "*".repeat(number.length - 4) + lastFourDigits
    number = number.chunked(4).joinToString(" ")
    println(number)
}

//4. Форматирование адреса электронной почты
fun formatEmail(email: String) {
    val result = email.trim().replace("@", " [at] ").replace(".", " [dot] ")
    println(result)
}

//5. Извлечение имени файла из пути.
fun getFileName(path: String) {
    val fileName = path.trim().split("/")
    val size = fileName.size
    println(fileName[size - 1])
}

//6. Создание аббревиатуры из фразы.
fun createAbr(phrase: String):String {
    val list = phrase.trim().split(" ")
    val size = list.size
    var abbr = ""
    for (i in 0 until size) {
       abbr += list[i][0].uppercaseChar()
    }
    return abbr
}

fun main() {
    println(funnyString(" как всегда без проблем"))
    getDate("Пользователь вошел в систему -> 2021-12-01 09:48:23")
    hideCreditCardNumbers("4539 1488 0343 6467")
    formatEmail("username@example.com")
    getFileName("C:/Пользователи/Документы/report.txt")
    println(createAbr("Котлин лучший язык программирования"))
}
