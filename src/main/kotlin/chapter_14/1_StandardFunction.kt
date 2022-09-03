package chapter_14

import java.io.File

/**
 * @Author: Hxina
 * @Date: 2022/9/3 Saturday 10:12
 */
fun main() {
    val file1 = File("G://apply_copy.txt")
    file1.setReadable(true)
    file1.setWritable(true)
    file1.setExecutable(false)

    // apply 函数
    // 在 lambda 表达式里，apply 能让每个配置函数豆子作用于接收者，这种行为又是又叫做 相关作用域
    // 因为 lambda 表达式里的所有函数调用都是针对接收者的，或者说，它们是针对接收者的 隐式调用
    val file2: File = File("G://apply_copy.txt").apply {
        setReadable(true)
        setWritable(true)
        setExecutable(false)
    }


    // let 函数
    // let 函数能使某个变量作用域其 lambda 表达式里，让 it 关键字引用它。
    // let 与 apply 比较，let 会把接收者传给 lambda，而 apply 什么都不传
    // 匿名函数执行完，apply 会返回当前接收者，而 let 会返回 lambda 的最后一行
    val res = listOf(3, 2, 1).first().let {
        it * it
    }
    // val firstElement = listOf<Int>(3, 2, 1)
    // val result = firstElement * firstElement
    println(res)     // 9

    println(formatGreeting(null))       // What's your name?
    println(formatGreeting("Kotlin"))   // Kotlin


    // run 函数
    // run 和 apply 很相似，但与 apply 不同，run 函数不返回接收者
    // run 返回的是 lambda 结果， true 或 false 或 其它类型
    val file3 = File("G:\\run_copy.txt")
    val result: Boolean = file3.run {
        readText().contains("Kotlin")
    }
    println(result)     // true
    val strName: Boolean = "Kotlin for Android".run(::isLong)
    println(strName)    // true
    // 链式调用
    "Kotlin for Android"
        .run(::isLong)
        .run(::showLong)
}

// let
fun formatGreeting(guestName: String?): String {
    return guestName?.let {
        "Welcome, $it"
    } ?: "What's your name?"
}

// run
fun isLong(string: String) = string.length >= 10
fun showLong(isLong: Boolean): String {
    return if (isLong) "StrName is too long." else "Please rename."
}