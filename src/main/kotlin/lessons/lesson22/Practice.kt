package ru.stimmax.lessons.lesson22

import java.io.File

fun main() {
//    val obj:Int? = null
//    obj!!  - аналог  obj as Int

//    try {
//        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//        println(list[20])
//    } catch(e: ArrayIndexOutOfBoundsException){
//        throw MyExc(e.message)
//    }

//    val obj1:Any = 45
//   obj1 as String

    val str: String = "23.h"
    str.toFloatOrNull()

    // addMoney(-100)

//    val file =File("//path/hfg.txt")
//    file.readText()

//    val list = mutableListOf<Float>()
//    while(true){
//        list.add(Math.PI.toFloat())
//    }

    // fun1()

}

fun fun1() {
    fun1()
}

fun addMoney(money: Int) {
    check(money > 0) {
        "money lfkjgld"
    }
}

class MyExc(message: String?) : RuntimeException(message) {}
