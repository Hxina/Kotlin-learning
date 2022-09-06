package chapter_16

/**
 * @Author: Hxina
 * @Date: 2022/9/6 Tuesday 10:39
 */
fun main() {
    // 嵌套类
    NestClass.InnerNestClass("Kotlin --- NestClass").show()     // InnerNestClass: Kotlin --- NestClass
}


// 嵌套类
// 若一个类只对另一个类有用，那么将其嵌入到该类中并使这两个类保持在一起是合乎逻辑的，可以使用嵌套类
class NestClass {
    class InnerNestClass(val name: String) {
        fun show() = println("InnerNestClass: $name")
    }
}