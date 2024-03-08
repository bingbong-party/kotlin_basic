package a_basic.enumAndWhen

import java.lang.IllegalArgumentException

fun eval (value: Int): Int =
    if (value is Int) {
        value
    } else {
        throw IllegalArgumentException("Unknown expression")
    }

// if 문을 when 으로 변경해보자.
fun eval2 (value: Int): Int =
    when (value) {
        is Int -> value
        else -> throw IllegalArgumentException("Unknown expression")
    }

