package ru.stimmax.lessons.lesson22.homework



fun main() {
//1.  NullPointerException
    try {
        val obj: String? = null
        obj as String
    } catch (e: NullPointerException) {
        println(e.message)
    }
// 2.   IndexOutOfBoundsException
    try {
        val arr = arrayOf(1, 2, 3)
        arr[3]
    } catch (e: IndexOutOfBoundsException) {
        println(e.message)
    }
//  3.  ClassCastException
    try {
        val x: Any = 123
        val s = x as String  // неправильное приведение типов
        println(s)
    } catch (e: ClassCastException) {
        println(e.message)
    }
//   4. IllegalArgumentException
    try {
        squareRoot(-5)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    } catch (E: Exception) {
        println("alarm!!")
    }
//  5.  NumberFormatException
    try {
        val n = "12a".toInt()
    } catch (e: NumberFormatException) {
        println(e.message)
    }
//  6.  IllegalStateException
    try {
        checkState(false)
    } catch (e: IllegalStateException) {
        println(e.message)
    }

//   7. OutOfMemoryError
    try {
        val list = mutableListOf<Int>()
        while (true) {
            list.addAll(List(100) { 0 }) // бесконечное расширение списка
        }
    } catch (e: OutOfMemoryError) {
        println(e.message)
    } catch (e: Error) {
        println(e.message)
    }
//  8.  StackOverflowError
    try {
        recurse()
    } catch (e: StackOverflowError) {
        println(e.message)
    } catch (e: Error) {
        println(e.message)
    }

    //11. Создай свой тип исключения в отдельном файле, наследуемый от AssertionError и принимающий текст. Выброси это исключение в main
    try {
        val arg = -10
        assert(arg > 0)
    } catch (e: AssertionError) {
        throw MyExc11(e.message)
    }

    //12. Создай свой тип исключения в отдельном файле, наследуемый от RuntimeException и принимающий
// IndexOutOfBoundsException тип в качестве аргумента. Напиши код, который спровоцирует выброс IndexOutOfBoundsException,
// перехвати его с помощью try-catch и в блоке catch выведи сообщение в консоль и сделай выброс своего типа исключения.
    try{
        val arr = arrayOf(1, 2, 3)
        arr[3]
    } catch(e:IndexOutOfBoundsException){
        throw MyExc12(e)
    }
}
//10. Напиши функцию, которая принимает nullable аргумент типа Any и в блоке try/catch выполни набор действий с этим
// аргументом которые могут потенциально вызвать одно из исключений в этом же порядке:
//
//NullPointerException
//IndexOutOfBoundsException
//ClassCastException
//IllegalArgumentException
//NumberFormatException
//IllegalStateException
//В блоке catch перехватывай исключение с общим типом Throwable а внутри через when определи тип исключения и выведи
// сообщение с названием исключения. Сразу после when выброси перехваченное исключение через throw, чтобы прекратить
// работу программы. Если аргумент функции не вызвал исключение, то выведи текст, сообщающий что переданный аргумент
// фантастически хорош!

fun checkExc(arg: Any?) {
    try {
        arg as Int
        require(arg in 0..100)
        check(arg.toInt() == 100)
    } catch (e: Throwable) {
        when (e) {
            is NullPointerException -> {
                println("NullPointerException")
            }

            is IndexOutOfBoundsException -> {
                println("IndexOutOfBoundsException")
            }

            is ClassCastException -> {
                println("ClassCastException")
            }

            is IllegalArgumentException -> {
                println("IllegalArgumentException")
            }

            is NumberFormatException -> {
                println("NumberFormatException")
            }

            is IllegalStateException -> {
                println("IllegalStateException")
            }
        }
        throw e
    }
    println("Argument is fantastic")
}

fun squareRoot(x: Int): Double {
    require(x >= 0) { "x must be non-negative" }
    return Math.sqrt(x.toDouble())
}

fun checkState(st: Boolean): Int {
    check(st) { "some check!" }
    return 1
}

fun recurse() {
    recurse()
}
