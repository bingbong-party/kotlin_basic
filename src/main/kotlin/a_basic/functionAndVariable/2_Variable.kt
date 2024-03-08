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

    // Int 와 Int?
    // 코틀린의 Int 는 null을 허용하지 않음. null을 허용하려면 타입에 ?를 붙여서 선언해야 함
    var i: Int = 10
    var k: Int? = 10

//    i = null => 에러 발생
    k = null

    // String 과 String?
    // Int 와 마찬가지로, ? 를 붙여 선언해야 null을 허용함
    var a: String
    var b: String?

//    a = null => 에러 발생
    b = null

    // 타입 추론 : 코틀린은 타입 추론으로 변수에 들어오는 값을 보고 타입을 알아서 지정해준다.
    val string = "ABC"
    val integer = 1
    val long = 1L
    val double = 1.0
    val float = 1.0F
    val char = 'A'

    println("string = " + string::class)
    println("integer = " + integer::class)
    println("long = " + long::class)
    println("double = " + double::class)
    println("float = " + float::class)
    println("char = " + char::class)
}

