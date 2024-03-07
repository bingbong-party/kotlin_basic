package a_basic.exception

import java.lang.NumberFormatException

val number = try {
    Integer.parseInt("12")
} catch (e: NumberFormatException) {
    println("에러 발생")
}