package problems

fun main(args: Array<String>) {
    val limit = 10000
    val targetSum = 1000
    for (a in 1 until limit) {
        for (b in a + 1 until limit) {
            for (c in b + 1 until limit) {
                if (a + b + c == targetSum && (a * a + b * b == c * c)) {
                    println("$a $b $c")
                    println(a*b*c)
                    break
                }
            }
        }
    }
    println("finished")
}