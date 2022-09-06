package chapter_16

import chapter_2.sub

/**
 * @Author: Hxina
 * @Date: 2022/9/6 Tuesday 12:43
 */
fun main() {
    val student = Student("Kotlin")
    val copy: Student = student.copy(name = "Android")
    println(student)
    /*
    * initializing student
    * initializing student
    * Student(name='Kotlin', age=2022, hobby='program', subject='develop', score=10)*/
    println("***********")
    println(copy) // Student(name='Android', age=2022, hobby='program', subject='develop', score=0)
}

data class Student(var name: String, val age: Int) {
    private val hobby = "program"
    private val subject: String
    private var score: Int = 0

    init {
        println("initializing student")
        subject = "develop"
    }

    constructor(_name: String) : this(_name, 2022) {
        score = 10
    }

    override fun toString(): String {
        return "Student(name='$name', age=$age, hobby='$hobby', subject='$subject', score=$score)"
    }
}