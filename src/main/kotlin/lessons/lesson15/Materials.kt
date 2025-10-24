package ru.stimmax.lessons.lesson15

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

fun main() {
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )

    var mat = Mat()
    for (number in ordinalNumbers) {
        mat.addMaterial(number)
    }
    mat.printContainer()
    println(mat.extract1())
    mat.printContainer()
}

class Mat : Materials() {
    fun extract1(): String {
        var materials = extractMaterials()
        for (i in 1..materials.lastIndex) {
//...
        }
        //или другой вариант
        materials.drop(1).forEach { addMaterial(it) }
        return materials.first()
    }
}

class GetLastMaterial : Materials() {
    fun extractItem(): String {
        val materials = extractMaterials()
        materials.take(materials.lastIndex - 1)
            .forEach {
                addMaterial(it)
            }
        return materials.last()
    }
}

class Mat2 : Materials() {
    fun extract2(): String {
        var materials = extractMaterials()
        var ind = materials.size / 2
        for (i in 0..materials.lastIndex){
            if (i ==ind) continue
            addMaterial(materials[i])
        }
        return materials[ind]
    }
}
