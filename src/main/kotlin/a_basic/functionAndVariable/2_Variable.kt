package a_basic.functionAndVariable

fun main(args: Array<String>) {
    // 자바에서는 변수를 선언할 때 타입이 맨 앞에 오지만, 코틀린에서는 타입 지정을 생략하는 경우가 흔하다.
    val answer1: Int = 42 // 타입 지정
    val answer2 = 42 // 타입 생략
    // 단, 초기화 하지 않고 변수를 선언하려면 반드시 타입 지정이 필요하다.
    val answer3: Int
    answer3 = 42

    // 변경 가능한 변수 var, 변경 불가능한 변수 val (java 에서 final)
    // var
    var message: String = "changeable message"
    message = "changed message"
    // val - 참조 자체는 불변일지라도, 참조하는 개체의 내부 값은 변경될 수 있다.
    val arrayData = arrayListOf("Java")
    arrayData.add("kotlin")

    // 문자열 템플릿
    // 문자열 리터럴의 필요한 곳에 변수명을 넣되, 변수명 앞에 $를 붙인다.
    println("now message : $message")
    val testData = "now message : $message"
    println(testData)
}

