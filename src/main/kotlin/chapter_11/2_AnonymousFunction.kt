package chapter_11

/**
 * @Author: Hxina
 * @Date: 2022/9/2 Friday 09:55
 */
fun main() {
    showOnBoard("Kotlin", ::getDiscountWords)
}

private fun getDiscountWords(goodsName: String, hour: Int): String {
    val currentYear = 2027
    return "$currentYear, $goodsName, $hour"
}

private fun showOnBoard(goodsName: String, getDiscountWords: (String, Int) -> String) {
    // 随机
    val hour: Int = (1..24).shuffled().last()
    println(getDiscountWords(goodsName, hour))
}