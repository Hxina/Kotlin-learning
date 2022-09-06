package chapter_16

import java.io.File

/**
 * @Author: Hxina
 * @Date: 2022/9/6 Tuesday 09:46
 */
fun main() {
    val p: Product = DetailProduct()
    println(p.load())   // Detail loading...
    println(p.description())    // Product: Kotlin
    // 判断是否是子类
    println(p is Product)       // true
    println(p is DetailProduct)     // true
    println(p is File)      // true

    // 类型转换
    // 只要能确定 any is 父类条件检查属实，就能够将 any 当作子类类型对待
    // 编译器允许不经类型转换直接使用
//    if (p is DetailProduct) {
//        println((p as DetailProduct).special())
//    }
    println((p as DetailProduct).special())     // DetailProduct special function
    println(p.special())    // DetailProduct special function
}

// 继承
// 类默认是封闭的，要让某个类开放继承，必须用 open 关键字修饰
// 父类的函数也要以 open 关键字修饰，子类才能覆盖它
open class Product(val name: String) {
    fun description() = "Product: $name"

    open fun load() = "Noting..."
}

class DetailProduct : Product(name = "Kotlin") {
    override fun load() = "Detail loading..."

    fun special() = "DetailProduct special function"
}