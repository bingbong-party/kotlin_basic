package a_basic.whileAndFor

fun main(args: Array<String>) {
    // 100 부터 2씩 감소하는 수열 (1까지 감소)
    for (i in 100 downTo 1 step 2) {
        println(i)
    }
}

// in 으로 컬렉션이나 범위의 원소 검사
// in 연산자를 사용해 어떤 값이 범위에 속하는지 알 수 있다. 반대로 !n을 사용하면 어떤 값이 범위에 속하지 않는지 알 수 있다.

