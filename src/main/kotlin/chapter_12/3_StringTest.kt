package chapter_12

/**
 * @Author: Hxina
 * @Date: 2022/9/3 Saturday 09:38
 */

const val NAME = "Kotlin for Android"
const val NAMES = "Kotlin, Java, Jetpack"

fun main() {
    // substring
    val index: Int = NAME.indexOf(' ')      // for 之前的空格
    val string: String = NAME.substring(0 until index)
    println(string)     // Kotlin

    println("*************")

    // split ---- 返回 List 集合数据
    // List集合支持解构语法特性，允许在一个表达式里给多个变量赋值，解构常用来简化变量的赋值
    // val data: List<String> = NAMES.split(", ")
    val (origin: String, dest: String, proxy: String) = NAMES.split(", ")
    println("$origin $dest $proxy")     // Kotlin for Android Java for Android Jetpack for Android

    println("*************")

    // replace --- 字符串替换
    val string1 = "Kotlin for Android"
    val string2: String = string1.replace(Regex("[KlfA]")) {
        when (it.value) {
            "K" -> "1"
            "l" -> "2"
            "f" -> "3"
            "A" -> "4"
            else -> it.value
        }
    }
    println(string1)    // Kotlin for Android
    println(string2)    // 1ot2in 3or 4ndroid

    println("*************")

    // 字符串比较
    // 用 == 检查两个字符串中的字符是否匹配
    // 用 === 检查两个变量是否指向内存堆上同一对象
    val str1 = "Java"
    val str2 = "Android"
    val str3 = "Android"
    println(str1 == str2)   // false
    println(str1 === str2)  // false
    println(str2 == str3)   // true
    println(str2 === str3)  // true

    println("*************")

    // 字符串遍历
    val string3 = "Kotlin for Android"
    string3.forEach {
        print("$it * ")     // K * o * t * l * i * n *   * f * o * r *   * A * n * d * r * o * i * d *
    }
}