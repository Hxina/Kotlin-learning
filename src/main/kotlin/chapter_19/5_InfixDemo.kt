package chapter_19

/**
 * @Author: Hxina
 * @Date: 2022/9/9 Friday 11:57
 */
fun main() {
    val nullableString: String? = null
    nullableString printWithDefault5 "Kotlin"   // Kotlin
}

// infix 关键字
// infix 关键字适用于又单个参数的扩展和类函数，可以以更简洁的语法调用函数，如果一个函数定义使用了 infix 关键字，
// 那么调用它时，接收者和函数之间的点操作以及参数的一堆括号都可以不要
infix fun String?.printWithDefault5(default: String): Unit = println(this ?: default)