package chapter_18

/**
 * @Author: Hxina
 * @Date: 2022/9/8 Thursday 11:55
 */
fun main() {
    val box1: MagicBox<Man> = MagicBox()
    val subject: Man = box1.randomOrBackup {
        Man("Man_35", 35)
    }
    println(subject)
}

// reified
// 有时候，想知道某个泛型参数具体是什么类型，reified 关键字能够检查泛型参数类型。
// Kotlin 不允许对泛型参数 T 做类型检查，因为泛型参数类型会被类型擦除，也就是说，
// T 的类型信息在运行时是不可知的，Java 也有这样的规则
class MagicBox<T : Human> {
    // 随机产生一个对象，如果不是指定类型的对象，就通过 backup 函数生成一个指定类型的对象
    inline fun <reified T> randomOrBackup(backup: () -> T): T {
        val items: List<Human> = listOf(
            Boy("Boy_20", 20),
            Man("Man_30", 30)
        )
        val random: Human = items.shuffled().first()
        println(random)
        return if (random is T) {
            random
        } else {
            backup()
        }
    }
}

open class Human(val age: Int)

class Boy(val name: String, age: Int) : Human(age) {
    override fun toString(): String {
        return "Boy(name='$name', age='$age')"
    }
}

class Man(val name: String, age: Int) : Human(age) {
    override fun toString(): String {
        return "Man(name='$name', age='$age')"
    }
}