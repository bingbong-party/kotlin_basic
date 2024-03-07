package a_basic.enumAndWhen

import java.lang.Exception

// when 으로 enum 클래스 다루기
fun genMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Ricahrd"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

// when 과 임의의 객체를 함께 사용
// 코틀린에서의 when 은 자바의 switch 와 다르게 조건에 상수뿐 아니라, 임의의 객체도 허용한다.
fun mix(c1: Color, c2: Color) =
    when (setOf(c2, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color. YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("Dirty color")
    }

// 위처럼 when 절에서 set 인스턴스를 생성하게 되면, 해당 함수가 자주 생성될 시 불필요한 가비지 객체가 늘어날 수 있다.
// 아래처럼 고쳐쓸 경우 이런 상황에서는 좀 더 효율적이다. (가독성은 더 떨어진다)
fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == Color.RED && c2 == Color.YELLOW) || (c1 == Color.YELLOW && c2 == Color.RED) -> Color.ORANGE
        (c1 == Color.YELLOW && c2 == Color.BLUE) || (c1 == Color.BLUE && c2 == Color.YELLOW) -> Color.GREEN
        (c1 == Color.BLUE && c2 == Color.VIOLET) || (c1 == Color.VIOLET && c2 == Color.BLUE) -> Color.INDIGO
        else -> throw Exception("Dirty color")
    }

