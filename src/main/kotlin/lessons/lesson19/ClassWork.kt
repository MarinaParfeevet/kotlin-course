package ru.stimmax.lessons.lesson19

import kotlin.math.max

class Container<A>(private val arg: A) {
    fun getA(): A = arg
}

class PairBox<A, B>(val a: A, val b: B) {
    fun getMap(): Map<A, B> {
        return mapOf(a to b)
    }
}

class Multiple<T : Number>() {
    fun multi(arg: T): Double {
        return arg.toDouble() * 2.0
    }
}

interface Storage<T> {
    fun saveObj(obj: T)
    fun getObj(): T
}

interface Transformer<T, R> {
    fun transform(arg: T): R
}

interface PairProcessor<R, T> {
    fun proccess(arg1: R, arg2: T)
}

interface ConnectionDif<R, T, V> {
    fun connect(arg1: List<R>, arg2: List<T>): List<V>
}

fun <R> swap(list: MutableList<R>, index1: Int, index2: Int): List<R> {
    if (index1 in list.indices && index2 in list.indices) {
        var temp = list[index1]
        list[index1] = list[index2]
        list[index2] = temp
    }
    return list.toList()
}

fun <R : Number> mergeLists(list1: List<R>, list2: List<R>): List<Double> {
    val resultList: MutableList<Double> = mutableListOf()
    val temp = max(list1.lastIndex, list2.lastIndex)
    for (i in 0..temp) {
        val res = list1.getOrElse(i){0}.toDouble() + list2.getOrElse(i){0}.toDouble()
        resultList.add(res)
    }
    return resultList.toList()
}
