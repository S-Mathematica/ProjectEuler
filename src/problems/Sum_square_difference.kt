package problems

import java.util.*

fun main(args: Array<String>) {
    val limit = 101
    var sumOfSquare = 0
    for (index in 1 until limit) {
        sumOfSquare += (index * index)
    }

    var squareSum = 0
    for (index in 1 until limit) {
        squareSum += index
    }
    squareSum = squareSum * squareSum

    println(squareSum - sumOfSquare)
}