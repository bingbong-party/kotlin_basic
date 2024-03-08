package a_basic.`in`

fun main(args: Array<String>) {
    println(recognize('4'))

    val price: Int = 100

    if (price in arrayOf(100, 200, 300)) {
        println("contain")
    } else {
        println("not contain")
    }
}

fun recognize(c: Char) =
    when (c) {
        in '0'..'9' -> "It's a digit!"
        in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
        else -> "I don't know.."
    }