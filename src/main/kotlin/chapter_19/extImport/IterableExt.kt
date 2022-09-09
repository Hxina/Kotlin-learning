package chapter_19.extImport

/**
 * @Author: Hxina
 * @Date: 2022/9/9 Friday 12:07
 */

// 扩展函数需要在多个文件里面使用，可以将它定义在独立的文件中，然后 import
fun <T> Iterable<T>.randomTake(): T = this.shuffled().first()