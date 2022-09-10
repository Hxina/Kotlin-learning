package chapter_19

import java.io.File

/**
 * @Author: Hxina
 * @Date: 2022/9/10 Saturday 09:37
 */
fun main() {
    // DSL --- 领域特定语言
    // 这是一种 Api 编程范式，暴露接收者的函数和特性，以便于自定义的 lambda 表达式来读取和配置它们。
    val file: File = File("G://run_copy.txt").apply {
        setReadable(true)
    }
    "Kotlin".addExt7(3).easyPrintln7()    // Kotlin!!!

    // 1. 定义扩展函数
    fun File.ext(): Unit {
        setReadable(true)
    }
    // 2. 给 block 变量赋值
    val block = File::ext
    // 3. 传入 apply 对象
    File("xxx").apply(block)
}


// 为甚么要传入扩展函数（泛型），而不是一个普通的匿名函数？
// T.() -> Unit
// 扩展函数里自带了接收者对象的 this 隐式调用

// apply 函数
public inline fun <T> T.apply(block: T.() -> Unit): T {
    block()
    return this
}

// 匿名函数也可以是扩展函数
// 普通的匿名函数
// () -> Unit
// 匿名函数内部 this 指向一个 File 对象，隐式调用
// File.() -> Unit
public inline fun File.apply(block: File.() -> Unit): File {
    block()
    return this
}

// 扩展函数
fun String.addExt7(amount: Int = 1): String = this + "!".repeat(3)

// 泛型扩展函数
fun <T> T.easyPrintln7(): Unit = println(this)

// 匿名函数的定义
fun doSomething(fix: () -> Unit) {}