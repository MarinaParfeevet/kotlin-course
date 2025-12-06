package ru.stimmax.lessons.lesson25.homeworks

class Person(val name: String, val age: Int) {
    var email: String = ""
}

class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"
}

fun main() {

//Задание 2: Использование apply для инициализации объекта Employee
//Создайте объект Employee и используйте apply для инициализации его полей email и department.
    var emp = Employee("Bob", 30, "Dmitry").apply {
        email = "bob@dmitry.com"
        department = "hos"
    }

//Задание 4: Использование with для преобразование Person в Employee
//Создайте объект класса Person. Используйте функцию with, чтобы создать из этого объекта Employee, указав дополнительно
// должность. Возвращаемым значением должен быть новый объект Employee.
    val person = Person("Anna", 34)
    var emp1 = with(person) {
        Employee(name, age, "director").apply {
            email = "bob@dmitry.com"
            department = "hos"
        }
    }

//Задание 5: Использование run для преобразования и инициализации Employee
//Перепиши предыдущую задачу на использование run вместо with.
    val pers = Person("Anna", 34)
        .apply { email = "bob@dmitry.com" }
    var emp2 = pers.run {
        Employee(name, age, email)
            .apply { department = "department" }
    }

// задание 3
    val person3 = Person("Anna", 34).also {
        it.email = "bob@dmitry.com"
        ex3(it)
    }

}

//Задание 3: Использование also для логирования
//Создайте функцию, принимающую объект Person и выводящую информацию об объекте в консоль в красивом, отформатированном
// виде. Используй with для создания контекста Person и возможности использовать поля объекта напрямую без обращения к переменной.
//Создайте объект Person и используйте also для добавления почты и печати данных в консоль с помощью метода который
// только что создали.
fun ex3(arg: Person) {
    with(arg) {
        println("name: $name, age: $age, email: $email")
    }
}

//Задание 6: Использование let для безопасного преобразования Person в Employee
//Создайте функцию toEmployee, которая расширяет класс Person, который может быть null. В функции используйте функцию
// let для создания Employee, только если объект Person не null. В противном случае возвращается null
fun Person?.toEmployee(): Employee? {
    return this?.let { Employee("Bob", 30, "qa") }
}
