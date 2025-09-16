package ru.stimmax.lessons.lesson5

val remainder = 10 % 5 // 0

val isEqual = (5 == 5) // true
val isNotEqual = (5 != 5) // false
val isGreater = (5 > 3) // true
val isLesser = (5 < 3) // false
val isGreaterOrEqual = (5 >= 5) // true
val isLesserOrEqual = (5 <= 3) // false

val andResult = (5 > 3) && (5 > 4) // true
val orResult = (5 > 3) || (5 < 4) // true
val notResult = !(5 > 3) // false

var number = 5
// number += 3 // number теперь равно 8
// равнозначное выражение: number = number + 3


var a = 5 // инкремент постфиксный
var b = a++


var c = 5
var d = ++c // инкремент префиксный. операция выполняется первой, затем возвращается значение.


//Логическое НЕ ( ! ) имеет самый высокий приоритет. Оно инвертирует значение своего операнда.
//Логическое И ( && ) выполняется после логического НЕ. Оператор && возвращает true, только если оба операнда истинны.
//Логическое ИЛИ ( || ) имеет самый низкий приоритет. Оператор || возвращает true, если хотя бы один из операндов истинен.

// оператор Элвиса
val name: String? = null
val result = name ?: "Unknown" //в result пойдет "Unknown", так как name равно null
