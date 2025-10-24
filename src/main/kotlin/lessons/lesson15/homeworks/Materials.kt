package ru.stimmax.lessons.lesson15.homeworks

//Это класс контейнера. Он абстрактный, это означает, что нельзя создавать экземлпяр этого класса, он нужен только
// для того, чтобы быть основой для подклассов.

//Создай подклассы этого контейнера, которые будут добавлять строку material (или коллекции или словари строк) в
// какое-то определённое место (места).

abstract class Materials {
    private val materials = mutableListOf<String>()
    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

//1.Первый класс должен вставлять строку на дно контейнера (должно появиться под индексом 0)

class AddStringToTheBottom : Materials() {
    fun addStringToTheBottom(material: String) {
        val list = extractMaterials()
        addMaterial(material)
        list.forEach { addMaterial(it) }
    }
}
//2.Второй класс должен получать список строк и вставлять их в начало контейнера но поочерёдно с теми данными, которые
// уже есть. То-есть, наш список должен появиться в контейнере по индексам 0, 2, 4 и так далее.

class GetListAndPasteToTheBeginning : Materials() {
    fun updateList(list: List<String>) {
        val temp = extractMaterials()
        val size = if (list.size >= temp.size) list.size else temp.size
        for (i in 0..size) {
            if (i < list.size) {
                addMaterial(list[i])
            }
            if (i < temp.size) {
                addMaterial(temp[i])
            }
        }
    }
}

//3.Третий класс при добавлении строки должен отсортировать весь список метиралов в алфавитном порядке включая
// добавляемый материал.

class SortStr : Materials() {
    fun sortMyList(str: String) {
        addMaterial(str)
        val temp: List<String> = extractMaterials().sorted()
        temp.forEach { addMaterial(it) }
    }
}

//4.Четвёртый класс должен принимать словарь (ключи и значения строки). Каждая пара ключа и значения должна попадать
// в контейнер следующим образом - ключ в начало, значение в конец. Таким образом в начале должны быть ключи в
// обратном порядке, потом существующие материалы, потом все значения.

class UpdateWithMap : Materials() {
    fun updateWithMap(map: Map<String, String>) {
        val temp = map.keys.reversed() + extractMaterials() + map.values
        temp.forEach { addMaterial(it) }
    }
}

fun main() {
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth"
    )

    val mat = AddStringToTheBottom()
    for (number in ordinalNumbers) {
        mat.addMaterial(number)
    }
    mat.addStringToTheBottom("zero")
    mat.printContainer()


    val mat2 = GetListAndPasteToTheBeginning()
    for (number in ordinalNumbers) {
        mat2.addMaterial(number)
    }
    mat2.updateList(listOf("1", "2", "3", "4", "5", "6", "7"))
    mat2.printContainer()


    val mat3 = SortStr()
    for (number in ordinalNumbers) {
        mat3.addMaterial(number)
    }
    mat3.sortMyList("popsa")
    mat3.printContainer()


    val mat4 = UpdateWithMap()
    for (number in ordinalNumbers) {
        mat4.addMaterial(number)
    }
    mat4.updateWithMap(mapOf("a" to "aa", "b" to "bb", "c" to "cc"))
    mat4.printContainer()
}

