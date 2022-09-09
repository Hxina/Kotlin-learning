package chapter_19

/**
 * @Author: Hxina
 * @Date: 2022/9/9 Friday 10:05
 */
fun main() {
    "Jetpack for Android, Kotlin".numVowels.easyPrintln3()  // 7
}

// 扩展属性
// 除了给类添加功能扩展函数外，还可以给类定义扩展属性。
// 例如给 String 类添加一个扩展，可以统计字符串里用多少个元音字母
val String.numVowels
    get() = count { "aeiou".contains(it) }

fun <T> T.easyPrintln3(): T {
    println(this)
    return this
}