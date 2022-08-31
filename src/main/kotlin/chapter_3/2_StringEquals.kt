package chapter_3

/**
 * @Author: Hxina
 * @Date: 2022/8/31 Wednesday 20:48
 */
fun main() {
    val str1: String = "Str1"
    val str2: String = "Str2"
    val str3: String = "str1"

    // == 等价 equals()
    println(str1 == str2)   // false

    // true 代表忽略大小写     false 不忽略大小写
    println(str1.equals(str3, true))    // true
}