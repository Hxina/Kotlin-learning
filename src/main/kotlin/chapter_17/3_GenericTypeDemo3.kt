package chapter_17

/**
 * @Author: Hxina
 * @Date: 2022/9/7 Wednesday 13:51
 */
fun main() {
    val box3: MagicBox3<Person3> = MagicBox3(
        Person3("Kotlin", 2022),
        Person3("Java", 2022),
        Person3("Android", 2022)
    )
    box3.available = true
    box3.fetch(2)?.run {
        println("Find $name, age: $age")    // Find Android, age: 2022
    }

    // [] 操作
    box3[2]
}

// 泛型   (通常用字母 T(type) 表示，也可以用其它字母表示)
// 泛型类的构造函数可以接受任何类型
// MagicBox3 类指定的泛型参数由放在一对 < > 里的字母 T 表示，T 是个代表 item 类型的占位符
// MagicBox3 类接受任何类型的 item 作为主构造函数值 (item: T)，并将 item 值赋给同样是 T 类型的 subject 私有属性
// vararg 可变参数
class MagicBox3<T : Human3>(vararg item: T) {
    var available = false
    private var subject: Array<out T> = item

    // 泛型函数
    // 添加索引，通过索引查找元素
    fun fetch(index: Int): T? {
        return subject[index].takeIf { available }
    }

    // 多泛型参数    return --> R
    // 取出时对元素进行修改
    // 添加索引，通过索引查找元素
    fun <R> fetch(index: Int, subjectModFunction: (T) -> R): R? {
        return subjectModFunction(subject[index]).takeIf { available }
    }

    // 运算符重载
    operator fun get(index: Int): T? = subject[index]?.takeIf { available }
}

// 泛型类型约束   ---- MagicBox3<T : Human3>
open class Human3(val age: Int)
class Person3(val name: String, age: Int) : Human3(age)