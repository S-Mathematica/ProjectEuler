package problems

import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val limit = 10001

    var value = 1
    var counter = 0
    while (counter < limit) {
        value++
        var isPrime = true
        for (index in 2 .. floor(sqrt(value * 1.0)).toInt()) {
            if (value % index == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) counter++
    }
    println(value)
}