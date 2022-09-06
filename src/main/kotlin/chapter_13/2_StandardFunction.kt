package chapter_13

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
    // 在 lambda 表达式里，apply 能让每个配置函数都作用于接收者，这种行为又是又叫做 相关作用域
    // 因为 lambda 表达式里的所有函数调用都是针对接收者的，或者说，它们是针对接收者的 隐式调用
    val file2: File = File("G://apply_copy.txt").apply {
        setReadable(true)
        setWritable(true)
        setExecutable(false)
    }
    println(file2)      // G:\apply_copy.txt

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
    println(formatGreeting("Kotlin"))   // Welcome, Kotlin


    // run 函数
    // run 和 apply 很相似，但与 apply 不同，run 函数不返回接收者
    // run 返回的是 lambda 结果， true 或 false 或 其它类型
    // 执行函数引用
    val file3 = File("G://run_copy.txt")
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
        .run(::println)     // StrName is too long.


    // with 函数
    // with 函数是 run 的变体，它们的功能一样，但 with 的调用方式不同，调用 with 时，需要 值参作为其第一个参数传入
    val result1 = with("Kotlin for Android.") {
        length >= 10
    }
    println(result1)    // true


    // also 函数
    // also 函数和 let 函数功能相似，和 let 一样，also 也是把接收者作为值参传给 lambda，
    // 不同：also 返回接收者对象，而 let 返回 lambda 结果
    // also 尤其针对同一个原始对象，利用副作用做事
    // 由于 also 返回接收者对象，就可以基于原始接收者对象执行额外的链式调用
    var fileContents: List<String>
    File("G://run_copy.txt")
        .also {
            println(it.name)    // run_copy.txt
        }
        .also {
            fileContents = it.readLines()     // 读出文件
        }
    println(fileContents)   // [Kotlin apply let run]


    // takeIf 函数
    // takeIf 和其它标准函数不一样，takeIf 函数需要判断 lambda 中提供的条件表达式，给出 true 或 false 结果，
    // 若判断结果是 true，则从 takeIf 函数返回接收者对象；若是 false 则返回 null
    // 如果需要判断某个条件是否满足，再决定是否可以赋值变量或执行某项任务，takeIf 就非常有用，
    // 概念上讲，takeIf 函数类似于 if 语句，但它的优势是可以直接在对象实例上调用，避免了临时变量赋值的麻烦
    val fileTakeIf = File("G://run_copy.txt")
        .takeIf { it.exists() && it.canExecute() }      // true
        ?.readLines()
    println(fileTakeIf)     // [Kotlin apply let run]


    // takeUnless 函数
    // takeUnless 是 takeIf 函数的辅助函数，只有判断给定的条件是 false 时，takeUnless 才会返回原始接收者对象
    val fileTakeUnless = File("G://run_copy.txt")
        .takeUnless { it.isHidden }
        ?.readLines()
    println(fileTakeUnless)     // [Kotlin apply let run]
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