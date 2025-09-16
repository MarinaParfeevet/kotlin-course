package ru.stimmax.lessons.lesson05

fun main() {
    val userLang: String? = null
    val defaultLang = "English"
    val currentLang = userLang ?:defaultLang
    println("currentLang = $currentLang")

    val innerAccumulator = 5000
    val externalAccumulator: Int? = 2000
    val powerBank = innerAccumulator + (externalAccumulator ?: 0)
    println(powerBank)

    val goodsInContainer: String? = null
    val checkedGoods = goodsInContainer ?: "error"
    println(goodsInContainer)

    val price = 80.0
    val discountInPercent: Double? = null
    val discount = (discountInPercent ?: 0.0) / 100.0
    val discountPrice = price - price * discount
    println(discountPrice)
}
