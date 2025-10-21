package ru.stimmax.lessons.lesson14.homeworks.shelfAndRack

class Rack(
    private var shelves: MutableList<Shelf>,
    var amount: Int,
) {
    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.contains(shelf) && shelves.size >= amount) {
            return false
        } else
            return shelves.add(shelf)
    }

    fun removeShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        } else {
            val shelf = shelves.removeAt(index)
            return shelf.getItems()
        }
    }

    fun addItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(item)) return true else continue
        }
        return false
    }

    fun removeItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(item)) return true else continue
        }
        return false
    }

    fun containsItem(item: String): Boolean {
        return shelves.any { it.containsItem(item) }
    }

    fun getShelves(): List<Shelf> {
        return shelves.toList()
    }

    fun printContents() {
        for (i in shelves.indices) {
            println("== Shelf $i ==")
            val capacity = shelves[i].capacity
            println("Вместимость - $capacity")
            val listItems = shelves[i].getItems()
            val rest = capacity - listItems.map { it.length }.sum()
            println("Оставшаяся вместимость - $rest")
            println("Список предметов:")
            println(listItems.joinToString())
        }
    }

    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        }

        //TODO
       else return shelves[index].getItems()
    }
}
