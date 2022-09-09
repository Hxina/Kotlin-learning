package chapter_19

/**
 * @Author: Hxina
 * @Date: 2022/9/9 Friday 09:29
 */
fun main() {
    println("Kotlin is good".addExt(3))     // Kotlin is good!!!
    "Kotlin".easyPrintln()      // Kotlin
    15.easyPrintln()        // 15
}

// 扩展函数
// 扩展可以在不直接修改类定义的情况下增加类功能，扩展可以用于自定义类，也可以用于比如 List、String，
// 以及 Kotlin  标准库里的其他类。和继承相似，扩展也能共享类行为，在无法接触到某个类定义，
// 或者某个类没有使用 open 修饰符，导致无法继承它时，扩展就是增加类功能的最好选择
// 定义扩展函数和定义一般函数不同，除了函数定义，还需要指定接受功能扩展的接收者类型
fun String.addExt(amount: Int = 1): String = this + "!".repeat(amount)   // 给字符串追加若干个感叹号

fun Any.easyPrintln(): Unit = println(this)     // 超类