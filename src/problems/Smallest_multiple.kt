package problems

fun main(args: Array<String>) {
    val limit = 20
    var output = 1L
    for (index in 2 .. limit) {
        output = lcm(output, index.toLong())
    }
    println(output)
}

fun lcm(a: Long, b: Long): Long = a * b * 1L / gcd(a, b)

fun gcd(a: Long, b: Long): Long {
    if (a == 0L) return b
    else return gcd(b % a, a)
}