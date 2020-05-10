package practice.euler

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    fun scanInt() = scanner.nextInt()
    fun scanString() = scanner.next()

    var output = 0
    for (index in 1 until 1000) {
        if (index % 3 == 0 || index % 5 == 0) {
            output += index
        }
    }

    println(output)
}