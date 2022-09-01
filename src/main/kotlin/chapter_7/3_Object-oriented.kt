package chapter_7

/**
 * @Author: Hxina
 * @Date: 2022/9/1 Thursday 09:56
 */
fun main() {
    val washMachine = WashMachine(model = "XXX", size = 20)
    washMachine.openDoor()
    washMachine.closeDoor()
    washMachine.setMode(3)
    washMachine.start()
}

class WashMachine(val model: String, val size: Int) {
    var isDoorOpen: Boolean = false
    var currentMode = 0

    fun openDoor() {
        println("Door opened.")
        isDoorOpen = true
    }

    fun closeDoor() {
        println("Door closed.")
        isDoorOpen = false
    }

    fun setMode(mode: Int) {
        currentMode = mode
        when (currentMode) {
            0 -> println("Init...")
            1 -> println("Mode 1...")
            2 -> println("Mode 2...")
            3 -> println("Mode 3...")
            else -> println("Unknown error...")
        }
    }

    fun start() {
        if (isDoorOpen) {
            println("Start...")
        } else {
            when (currentMode) {
                0 -> println("Please select a working mode")
                1 -> println("Selected mode 1")
                2 -> println("Selected mode 2")
                3 -> println("Selected mode 3")
                else -> println("Error...")
            }
        }
    }
}