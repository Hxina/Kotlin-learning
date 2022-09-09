package chapter_19

// 重命名扩展
import chapter_19.extImport.randomTake as randomizer

/**
 * @Author: Hxina
 * @Date: 2022/9/9 Friday 12:13
 */
fun main() {
    val list: List<String> = listOf("Kotlin", "Android", "Java")
    val set: Set<String> = setOf("Kotlin", "Android", "Java")

//    list.randomTake()
//    set.randomTake()
    list.randomizer()
    set.randomizer()
}