// Nullability(널 가능성) //

// null pointer exception 방지위해 if문으로 매번 조건 체크 -> 번거로움
// -> 연산자 사용

// Null-Safe Operator //
// ?.
// 참조 연산자를 실행하기 전에 먼저 객체가 null인지 확인
// -> 객체가 null이면 ?. 뒤에 따라오는 구문을 실행하지 않음

// Elvis Operator //
// ?:
// 객체가 null이 아니라면 그대로 사용
// -> null이면 ?: 뒤에 따라오는 객체로 대체

// Non-Null Assertion Operator //
// !!.
// 참조 연산자를 사용할 때 null 여부를 컴파일시 확인하지 않음
// -> 런타임시 null pointer exception이 나도록 의도적으로 방치

fun main() {

    // 그냥 공백(null 아님)
    val test13 = ""
    println(test13)

    // null <- 대충 슈뢰딩거의 값(undefined, 0, ""와는 다름)
    val test14 = null
    println(test14)

    // null은 문자열이 아니기 때문에 -> 에러 발생
//    val test15 : String = null
    // Kotlin: Null can not be a value of a non-null type String

    // test16은 String 또는 null이다
    val test16 : String? = null



    // 자료형 뒤에 ? 붙여서 nullable 변수로 선언
    var a: String? = null

    // null이므로 대문자 적용 안 함
    println(a?.toUpperCase())
//    null

    // null이므로 default로 대체 후 대문자 적용
    println(a?:"default".toUpperCase())
//    DEFAULT

// null pointer exception 발생
//    println(a!!.toUpperCase())
//    Exception in thread "main" java.lang.NullPointerException

    // null을 체크하기 위해 스코프 함수를 if문 대신 사용
    a?.run {
        println(toUpperCase())
        println(toLowerCase())
    }
    // null이므로 실행 안 됨

    var b : String? = "Kotlin"

    b?.run {
        println(toUpperCase())
        println(toLowerCase())
    }
//    KOTLIN
//    kotlin



//    val x: Int = null
//    Kotlin: Null can not be a value of a non-null type Int
//    val y: String = null
//    Kotlin: Null can not be a value of a non-null type String
//    ?은 null인지 아닌지를 확인(포함한다고 봐도 됨)
//    변수값을 null로 지정하되 에러 안 나려면 변수타입에 ? 붙이기
    val x: Int? = null
    val y: String? = null

    val name: String? = null
//    println(name.length)
//    Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
//    값이 null일 때 ? 사용해 오류 없이 null 반환함
    println(name?.length)
//    null

    var name2: String? = null
    name2 = "Treehouse"
//    값이 null이 아니라고 장담할 수 있을 때 !! 사용
    println(name2!!.length)
//    9

}