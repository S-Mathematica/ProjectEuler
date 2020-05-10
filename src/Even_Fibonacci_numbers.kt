package practice.euler

import java.util.*

fun main(args: Array<String>) {
    val limit = 4000000

    var a = 1
    var b = 2

    var sum = 2
    while (true) {
        val c = a + b
        if (c > limit) break

        if (c % 2 == 0) sum += c

        a = b
        b = c
    }

    println(sum)
}