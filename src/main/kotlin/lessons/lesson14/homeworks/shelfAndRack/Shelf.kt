package ru.stimmax.lessons.lesson14.homeworks.shelfAndRack

class Shelf(
    var capacity: Int,
    var items: MutableList<String>
) {
    fun addItem(item: String): Boolean {
        if (canAccommodate(item)) {
            return items.add(item)
        }
        return false
    }

    fun removeItem(item: String): Boolean {
        return items.remove(item)
    }

    fun containsItem(item: String): Boolean {
        return items.contains(item)
    }

    fun getItems(): List<String> {
        return items.toList()
    }

    private fun canAccommodate(item: String): Boolean {
        return item.length < capacity
    }

}
