package chapter_8

/**
 * @Author: Hxina
 * @Date: 2022/9/1 Thursday 10:35
 * @Desc: 抽象方法
 */
fun main() {
//    val person1 = Man("Man")
//    person1.name
//    person1.eat()
//    val person2 = Woman("Women")
//    person2.name
//    person2.eat()

    println("******************")

    // 多态
    val person1 = Man("Man 1")
    val person2 = Woman("Woman 1")
    val person3 = Man("Man 2")
    val person4 = Woman("Woman 2")

    val personList = listOf<Human>(person1, person2, person3, person4)
    for (person in personList) {
        person.eat()
        person.pee()
    }
}

abstract class Human(var name: String) {
    abstract fun eat()
    abstract fun pee()
}

class Man(name: String) : Human(name) {
    override fun eat() {
        println("$name Eating...man...")
    }

    override fun pee() {
        println("$name Man standing to pee...")
    }
}

class Woman(name: String) : Human(name) {
    override fun eat() {
        println("$name Eating...women...")
    }

    override fun pee() {
        println("$name Woman squatting to pee...")
    }
}