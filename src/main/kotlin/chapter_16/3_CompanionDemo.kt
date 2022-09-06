package chapter_16

import java.io.File

/**
 * @Author: Hxina
 * @Date: 2022/9/6 Tuesday 10:38
 */
fun main() {
    ConfigMap.load()
}


// 伴生对象 --- companion
// 如果要将某个类的初始化和一个类实例捆绑在一起，可以考虑使用伴生对象，使用 companion 修饰符修饰
// 可以在一个类定义里声明一个伴生对象，一个类里只能有一个伴生对象
open class ConfigMap {
    companion object {
        private const val PATH = "G://run_copy.txt"
        fun load() = File(PATH).readBytes()
    }
}