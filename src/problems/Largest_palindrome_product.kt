package problems

fun main(args: Array<String>) {
    val startIndex = 999
    val endIndex = 100

    var maxi = -1
    for (index1 in startIndex downTo endIndex) {
        for (index2 in startIndex downTo endIndex) {
            val multiply = index1 * index2
            if (isPalindrome(multiply)) {
                 maxi = Math.max(maxi, multiply)
            }
        }
    }
    println(maxi)
}

fun isPalindrome(num: Int): Boolean {
    val numStr = num.toString()
    val size = numStr.length

    var isPalindrome = true
    for (index in 0 until size / 2) {
        if (numStr[index] != numStr[size - index - 1]) {
            isPalindrome = false
            break
        }
    }

    return isPalindrome
}