package chapter_19

/**
 * @Author: Hxina
 * @Date: 2022/9/9 Friday 09:53
 */
fun main() {
    "Kotlin".easyPrintln2().addExt2(3).easyPrintln2()

    // 泛型扩展函数在 Kotlin 标准库里随处可见，例如 let 函数，let 函数呗定义成了泛型扩展函数，
    // 所以能够支持任何类型，它接收一个 lambda 表达式，这个 lambda 表达式接收者 T作为值参，
    // 返回的 R-lambda 表达式返回的任何新类型
    "Kotlin".let { }
}

// 泛型扩展函数
// 新的泛型扩展函数不仅可以支持任何类型的接收者，还保留了接收者的类型信息，
// 使用泛型类型后，扩展函数能够支持更多类型的接收者，适用范围更广
fun <T> T.easyPrintln2(): T {
    println(this)
    return this
}

fun String.addExt2(amount: Int = 1): String = this + "!".repeat(3)