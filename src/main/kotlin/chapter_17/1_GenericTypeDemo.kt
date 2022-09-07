package chapter_17

/**
 * @Author: Hxina
 * @Date: 2022/9/7 Wednesday 13:15
 */
fun main() {
    val box1: MagicBox<Person> = MagicBox(Person("Kotlin", 2022))
    // val box2: MagicBox<Dog> = MagicBox(Dog(20))
    box1.available = true
    // box2.available = true
    box1.fetch()?.run {
        println("Find $name, age: $age")    // Find Kotlin, age: 2022
    }
    // println(box2.fetch()?.weight)   // 20
    val man: Man? = box1.fetch {
        Man(it.name, it.age.plus(20))
    }
}

// 泛型   (通常用字母 T(type) 表示，也可以用其它字母表示)
// 泛型类的构造函数可以接受任何类型
// MagicBox 类指定的泛型参数由放在一对 < > 里的字母 T 表示，T 是个代表 item 类型的占位符
// MagicBox 类接受任何类型的 item 作为主构造函数值 (item: T)，并将 item 值赋给同样是 T 类型的 subject 私有属性
class MagicBox<T : Human>(item: T) {
    var available = false
    private var subject: T = item

    // 泛型函数
    fun fetch(): T? {
        return subject.takeIf { available }
    }

    // 多泛型参数    return --> R
    // 把元素进行修改
    fun <R> fetch(subjectModFunction: (T) -> R): R? {
        return subjectModFunction(subject).takeIf { available }
    }
}

// 泛型类型约束   ---- MagicBox<T : Human>
open class Human(val age: Int)
class Person(val name: String, age: Int) : Human(age)
class Man(val name: String, val age: Int)

class Dog(val weight: Int)