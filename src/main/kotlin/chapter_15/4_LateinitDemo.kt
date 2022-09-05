package chapter_15

/**
 * @Author: Hxina
 * @Date: 2022/9/5 Monday 15:38
 */
fun main() {
    val l = LateInit()
    println(l.ready())      // sharp knife
    println(l.battle())     // kotlin.Unit
}

// lateinit 关键字相当于做了一个约定：在用它之前复制初始化
// 只要无法确认 lateinit 变量名是否完成初始化，可执行 isInitialized 检查
class LateInit {
    lateinit var equipment: String

    fun ready() {
        equipment = "sharp knife"
    }

    fun battle() {
        if (::equipment.isInitialized) println(equipment)
    }
}