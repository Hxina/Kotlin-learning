package chapter_15

import java.util.*

/**
 * @Author: Hxina
 * @Date: 2022/9/5 Monday 10:15
 */
fun main() {
    val user = User("Kotlin", 2022, true)
    println("${user.name} ${user.age} ${user.isNormal}\n")   // Kotlin 2022 true
    val user1 = User("Android")
    println("${user1.name}\n")  // Android
    val user2 = User("Android", 2022)
    println("${user2.name} ${user2.age}\n")  // ANDROID 2022
}

// 主构造函数
private class User(
    _name: String,
    var age: Int,
    var isNormal: Boolean
) {
    var name = _name
        get() = field.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        set(value) {
            field = value.trim()
        }

    // 次构造函数
    // 初始化函数默认值
    constructor(name: String) : this(name, age = 2022, isNormal = false)
    constructor(name: String, age: Int) : this(name, age = age, isNormal = false) {
        this.name = name.uppercase(Locale.getDefault())
    }

    // init---初始化块
    // 初始化块可以设置变量或值，以及执行有效性检查，如检查传给某构造函数的值是否有效，初始化代码块会在构造类实例时执行
    init {
        require(age > 0){ "age must be positive!"}
        require(name.isNotBlank()){ "User must have a name!"}
    }

}

/*
private class User(
    _name: String,
    _age: Int,
    _isNormal: Boolean
) {
    var name = _name
        get() = field.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        set(value) {
            field = value.trim()
        }
    var age = _age
        get() = age.absoluteValue
        set(value) {
            field = age.absoluteValue
        }
    var isNormal = _isNormal
}*/