package chapter_19

/**
 * @Author: Hxina
 * @Date: 2022/9/9 Friday 11:48
 */
fun main() {
//    val nullableString: String? = null
//    nullableString.printWithDefault4("Kotlin")   // Kotlin

    val nullableString: String? = "null"
    nullableString.printWithDefault4("Kotlin")   // null
}

// 可空类扩展
// 可以定义扩展函数用于可空类型，在可空类型上定义扩展函数，可以直接在扩展函数体内解决可能出现的空值问题
fun String?.printWithDefault4(default: String): Unit = println(this ?: default)