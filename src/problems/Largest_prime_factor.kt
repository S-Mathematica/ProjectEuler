package problems

import java.util.*

fun main(args: Array<String>) {
    var num = 600851475143
    var startPrime = 2
    while (num != 1L) {
        while (num % startPrime == 0L) num /= startPrime
        startPrime++
    }

    println(startPrime - 1)
}