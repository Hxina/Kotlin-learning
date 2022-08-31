package chapter_3

/**
 * @Author: Hxina
 * @Date: 2022/8/31 Wednesday 20:55
 */
fun main() {
    val result1: String = heat("水")
    println(result1)     // 热水

    val result2: String = heat(null)
    println(result2)    // 热null
}

// String? 表示该值可为空
fun heat(string: String?): String {
    return "热$string"
}