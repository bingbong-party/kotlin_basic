package functionAndVariable

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// max 함수를 아래와 같이 더 간결하게 표현 가능하다.
fun maxShort(a: Int, b: Int): Int = if (a > b) a else b

fun main(args: Array<String>) {
    println(max(10, 12))
    println(maxShort(10, 12))
}