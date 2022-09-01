package chapter_7

/**
 * @Author: Hxina
 * @Date: 2022/9/1 Thursday 09:50
 */
fun main() {
    val person = Person("Gentle", "Sweet")
    println(person.character)
    println(person.voice)
    person.smile()
    person.cry()
}

class Person(var character: String, var voice: String) {
    fun smile() {
        println("Smile...")
    }

    fun cry() {
        println("Cry...")
    }
}