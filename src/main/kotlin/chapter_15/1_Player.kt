package chapter_15

import java.util.*

/**
 * @Author: Hxina
 * @Date: 2022/9/5 Monday 09:57
 */
fun main() {
    val player = Player()
    println(player.name)    // Kotlin
    player.name = " kotlin "
    println(player.name)    // Kotlin
}

class Player() {
    var name: String? = "Kotlin"
        get() = field?.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        set(value) {
            field = value?.trim()   // 去掉前后空格
        }
}
