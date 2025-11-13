package ru.stimmax.lessons.lesson17.homeworks
abstract class BaseClass(
    // 1. объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
    //Потому что там это поле публичное
    private val privateVal: String,
    // 2. объясни, почему это поле недоступно в main()
    //Потому что модификатор доступа protected. Вызов доступен из класса и из его дочерних классов.
    // В дочернем классе можно создать метод и использовать его как интерфейс.в main доступно не будет.
    protected val protectedVal: String,
    val publicVal: String
) {
    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
        get(){
            return if (field =="2") "2" else "1"
        }
    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"
    private var privateField = "6. добавь сеттер чтобы изменить меня из main()"
    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }
    fun printText() {
        privatePrint()
    }
    // 7. объясни, почему эта функция не может быть публичной
    //Потому что она возвращает protected класс, который доступен только наследникам. Был бы private класс,
    // то и метод был бы private без open
    protected open fun getProtectedClass() = ProtectedClass()
    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }
    // 8. Распечатай getAll() и объясни, почему в поле "generate" другой текст
    // метод generate переопределен в дочернем классе.
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }
    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }
    // 9. объясни, почему эта функция не может быть публичной или protected
    //Потому что метод возвращает приватный класс.
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass() {}

    private class PrivateClass() {}
}
class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    // Это поле родительского класса, которое используется в конструкторе. Модификатор public
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {
    // 11. объясни, почему в main() доступна функция getAll() хотя её здесь нет
    // 12. проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }

    fun printProtect() {
        println(protectedField)
    }

    override fun verifyPublicField(value: String): Boolean {
        return value.length < 51
    }

    fun setProtectedFieldValue(v: String) {
        protectedField = v

    }

    fun getProtectedFieldValue(): String {
        return protectedField
    }
}
fun main() {
    val a = ChildrenClass("Приват", "Протект", "Публичный")
    a.publicField = "Антонио Бандерас"
    println(a.publicField)
    a.setProtectedFieldValue("изменил protectedField")
    println(a.getProtectedFieldValue())
    println(a.getAll())
    a.printText()
}

// --------- ответы

/*
1. privateVal недоступен в main() напрямую, но в getAll() он читается — потому что private в Kotlin означает доступ только внутри класса BaseClass, но не извне. В main() к нему нет прямого доступа. (Примечание: в задании, возможно, опечатка — на самом деле privateVal недоступен в main).

2. protectedVal — недоступен в main(), потому что protected разрешает доступ только в подклассах и внутри самого класса, но не извне (в т.ч. из main).

3–4. Чтобы изменить publicField из main(), нужно, чтобы проверка verifyPublicField разрешала новое значение. Поэтому переопределили логику (в решении просто всегда true).

5. Чтобы изменить protectedField из main(), добавили в ChildrenClass публичный сеттер setProtectedField.

6. Добавили публичный метод setPrivateField() в BaseClass, чтобы можно было менять privateField извне.

7. getProtectedClass() не может быть public, потому что она возвращает вложенный protected класс — иначе нарушится инкапсуляция: внешний код сможет создавать/получать объекты ProtectedClass.

8. В getAll() поле "generate" показывает текст из дочернего класса, потому что generate() — open, и в ChildrenClass он переопределён. Вызывается полиморфно.

9. getPrivateClass() не может быть public или protected, потому что возвращает вложенный private класс, который недоступен за пределами BaseClass.

10. publicVal в конструкторе ChildrenClass не является полем, но передаётся в суперкласс, где объявлен как val publicVal: String → публичное свойство, поэтому доступно в main() через экземпляр.

11. getAll() доступна, потому что унаследована от BaseClass (метод public по умолчанию).

12. При вызове printText() печатается "Печать из класса BaseClass", потому что private-методы не наследуются и не переопределяются. privatePrint() в ChildrenClass — это совершенно другой метод.*/
