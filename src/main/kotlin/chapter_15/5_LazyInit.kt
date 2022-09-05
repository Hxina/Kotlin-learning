package chapter_15

/**
 * @Author: Hxina
 * @Date: 2022/9/5 Monday 15:46
 */
fun main() {
    val lazyInit = LazyInit("Kotlin")
    Thread.sleep(3000)
    println(lazyInit.config)    // Loading... loaded success
}

// lazy --- 惰性初始化
// 延迟初始化并不是推后初始化的唯一方式，也可以暂时不初始化某个变量，直到首次使用它
class LazyInit(_name: String) {
    var name = _name
    val config by lazy { loadConfig() }

    private fun loadConfig(): String {
        println("Loading...")
        return "loaded success"
    }
}