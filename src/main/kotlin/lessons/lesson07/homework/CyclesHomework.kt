package ru.stimmax.lessons.lesson07.homework

fun main() {

//Напишите цикл for, который выводит числа от 1 до 5.
    for (i in 1..5) {
        print("$i  ")
    }
    println()

//Напишите цикл for, который выводит четные числа от 1 до 10.
    for (i in 1..10) {
        if (i % 2 == 0) print("$i  ")
    }
    println()


//Создайте цикл for, который выводит числа от 5 до 1.
    for (i in 5 downTo 1) print("$i  ")
    println()

//Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    var j = 0
    for (i in 10 downTo 1) {
        j = i / 2
        print("$j  ")
    }
    println()

//Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    for (i in 1..9 step 2) print("$i  ")
    println()
//Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    for (i in 1..20 step 3) print("$i  ")
    println()

//Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
    var size = 15
    for (i in 3 until size step 2) print("$i  ")
    println()

//Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    var i: Int = 1
    while (i <= 5) {
        println(i * i)
        i++
    }
//Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    var count=10
    while (count > 5) {
        count--
    }
    println(count)

//Используйте цикл do while, чтобы вывести числа от 5 до 1.
    count = 5
    do {
        print("$count ")
        count--
    } while (count >= 1)
    println()
//Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
    count = 5
    do {
        print("$count ")
        count++
    } while (count < 10)
    println()

//Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    for (i in 1..10) {
        if (i == 6) break
        print("$i  ")
    }
    println()
//Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    count =1
    while (true) {
        print("$count ")
        count++
        if (count > 10) break
    }
    println()
//В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    for (i in 1..10) {
        if (i % 2 == 0) continue
        print("$i  ")
    }
    println()
//Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
    count=0
    while (count <10) {
        count++
        if (count % 3 == 0) continue
        print("$count  ")
    }
}
