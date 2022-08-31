package chapter_1

/**
 * @Author: Hxina
 * @Date: 2022/8/31 Wednesday 19:18
 * @Desc: 变量的声明和使用 var、val
 */
fun main() {
    // val（value）声明一个不可变的变量，初始赋值后不可重新赋值
    val nameVal = "val"
    // var（variable）声明一个可变的变量，初始赋值后可重新赋值
    var nameVar = "var"

//    nameVal = "val_1"     // 错误，不可变量不可重新赋值
    nameVar = "var_1"       // 正确，nameVar 被重新赋值为 var_1

    println("nameVal：$nameVal")       // 输出：val
    println("nameVar：$nameVar")       // 输出：var_1

    // 显式指定数据类型
    val nameVal1: String = "nameVal1"
    val nameVar1: String = "nameVar1"

    println("nameVal1：$nameVal1")
    println("nameVar1：$nameVar1")
}