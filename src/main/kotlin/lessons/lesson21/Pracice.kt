package ru.stimmax.lessons.lesson21

import kotlin.math.absoluteValue

class Pracice {

}
fun main(){
    val arg:Any="Smth"
    println((arg as String).length)
    if (arg is String) {println("this is string")}
    println(arg as? String ?: "this is not string")

    val arg1:Any=listOf(1)
    println((arg1 as List<Int>)[0].absoluteValue)

    val arg2:Any = listOf(3,8)
    if(arg2 is List<*>){
        println(arg2)
    }

        //  if ((arg1 as List<*>).isNotEmpty() && (arg1[0] is String)) {}
}
