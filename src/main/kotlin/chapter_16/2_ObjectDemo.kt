package chapter_16

/**
 * @Author: Hxina
 * @Date: 2022/9/6 Tuesday 10:03
 */
fun main() {
    // 对象声明
    // 既是类明，也是实例名
    ApplicationConfig.doSomething()     // Application loading... doSomething

    // 对象表达式
    val a = object : Anonymity() {
        override fun load() = "anonymity nothing..."
    }
    println(a.load())   // anonymity nothing...
}


// 对象 --- object
// 对象声明
// 对象声明有利于组织代码和管理状态，尤其是以整个应用运行生命周期内的某些一致性状态
object ApplicationConfig {
    init {
        println("Application loading...")
    }

    fun doSomething() {
        println("doSomething")
    }
}


// 对象表达式 --- 匿名类
// 有时候不一定非要定义一个新的命名类不可，也许只需要某个现有类的一种变体实例，但只需要用一次就行了
// 对于这种用完就丢的类实例，连命名都可以省略
// 这个对象表达式是xx的子类，这个匿名类依然遵循 object 关键字的一个规则，即一旦实例化，该匿名类只能有唯一一个实例存在
open class Anonymity {
    open fun load() = "Loading nothing..."
}