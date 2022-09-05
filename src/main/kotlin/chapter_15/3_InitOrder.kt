package chapter_15

/**
 * @Author: Hxina
 * @Date: 2022/9/5 Monday 15:26
 */
fun main() {
    Student("Kotlin")
}

// 初始化顺序
// 主构造函数里声明的属性 ---> 类级别的属性赋值 ---> init 初始化块里的属性赋值和函数调用 ---> 次构造函数里的属性赋值和函数调用
class Student(
    _name: String,
    val age: Int
) {
    var name = _name
    var score = 90
    private val hobby = "music"
    private val subject: String

    init {
        println("initializing student...")
        subject = "math"
    }

    // 次构造函数
    constructor(_name: String) : this(_name, 10) {
        score = 20
    }
}